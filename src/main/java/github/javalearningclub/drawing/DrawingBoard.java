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
	private final ExecutorService executorService = Executors.newSingleThreadExecutor();
	private Future updateFuture;
	private final int width;
	private final int height;
	private final JFrame frame;
	private final DrawingPanel drawingPanel;

	public DrawingBoard(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.drawingPanel = new DrawingPanel(new Dimension(width, height));
		this.frame = new JFrame(title);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.add(drawingPanel);
		this.frame.pack();
		this.frame.setResizable(false);
		this.updateFuture = null;
	}

	public void start() {
		if (updateFuture == null) {
			frame.setVisible(true);
			updateFuture = executorService.submit(() -> {
				while (!Thread.currentThread().isInterrupted()) {
					try {
						Thread.sleep(30);
						drawingPanel.update();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			});
		}
	}

	public void stop() {
		if ((updateFuture != null) && (!updateFuture.isCancelled())) {
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
	}

	public void draw(Shape line) {
		drawingPanel.draw(line);
	}

	public void erase(Shape line) {
		drawingPanel.erase(line);
	}

	private static class DrawingPanel extends JPanel {
		private Set<Shape> shapes = new LinkedHashSet<>();

		public DrawingPanel(Dimension size) {
			super(true);
			this.setMinimumSize(size);
			this.setMaximumSize(size);
			this.setPreferredSize(size);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			shapes.forEach(shape -> {
				shape.draw(g);
			});
		}

		public void draw(Shape line) {
			SwingUtilities.invokeLater(() -> {
				shapes.add(line);
				this.repaint();
			});
		}

		public void erase(Shape line) {
			SwingUtilities.invokeLater(() -> {
				shapes.remove(line);
				this.repaint();
			});
		}

		public void update() {
			SwingUtilities.invokeLater(() -> {
				this.repaint();
			});
		}

	}

}
