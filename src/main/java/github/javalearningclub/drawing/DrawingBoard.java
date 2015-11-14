package github.javalearningclub.drawing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DrawingBoard {
	private final DrawingPanel drawingPanel;
	private final ExecutorService executorService = Executors.newSingleThreadExecutor();
	private final JFrame frame;
	private final Set<Shape> shapes = new LinkedHashSet<>();

	private Future<?> updateFuture;

	public DrawingBoard(String title, int width, int height) {
		this.frame = new JFrame(title);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.drawingPanel = new DrawingPanel();
		Dimension size = new Dimension(width, height);
		this.drawingPanel.setMinimumSize(size);
		this.drawingPanel.setMaximumSize(size);
		this.drawingPanel.setPreferredSize(size);
		this.frame.add(drawingPanel);
		this.frame.pack();
		this.frame.setResizable(false);
		this.updateFuture = null;
	}

	/**
	 * Add a {@link Shape} to be drawn
	 * 
	 * @param shape
	 *            The {@link Shape} to draw.
	 */
	public synchronized void draw(Shape shape) {
		shapes.add(shape);
	}

	/**
	 * Erase a {@link Shape} that is being drawn.
	 * 
	 * @param shape
	 *            The {@link Shape} to erase.
	 */
	public synchronized void erase(Shape shape) {
		shapes.remove(shape);
	}

	/**
	 * Stop thread execution for specified amount of time
	 * 
	 * @param milliseconds
	 *            The number of milliseconds to pause
	 */
	public void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	/**
	 * You will need to start the {@link DrawingBoard} before you can see any of
	 * the stuff you draw.
	 * 
	 * @throws IllegalStateException
	 *             if you have already started this {@link DrawingBoard}
	 */
	public synchronized void start() throws IllegalStateException {
		if (updateFuture != null) {
			throw new IllegalStateException("This DrawingBoard is already started");
		}
		frame.setVisible(true);
		updateFuture = executorService.submit(() -> {
			while (!Thread.currentThread().isInterrupted()) {
				try {
					Thread.sleep(30);
					SwingUtilities.invokeLater(() -> drawingPanel.repaint());
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});
	}

	/**
	 * When you are done with this {@link DrawingBoard}, you will need to stop
	 * it - this will get rid of the window and allow your program to exit.
	 * 
	 * @throws IllegalStateException
	 *             if this {@link DrawingBoard} is not up and running.
	 */
	public synchronized void stop() throws IllegalStateException {
		if ((updateFuture == null) || updateFuture.isCancelled()) {
			throw new IllegalStateException("This DrawingBoard is not up and running.");
		}
		updateFuture.cancel(true);
		try {
			updateFuture.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} catch (CancellationException e) {
			// We actually expect an exception since we cancelled.
		}
		executorService.shutdownNow();
		frame.dispose();
	}

	/** Our special panel that will paint our shapes */
	private class DrawingPanel extends JPanel {
		private static final long serialVersionUID = -3341907225120415277L;
	
		/** Constructor */
		public DrawingPanel() {
			super(true);
		}
	
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			synchronized (shapes) {
				shapes.forEach(shape -> {
					shape.draw(g);
				});
			}
		}
	}

}
