# java-learning-club
You are going to need to install several tools on your computer
## Git
Git is a revision control system that will:
* Keep track of every change we make
* Will allow us to share our work
* Will allow us to work together

You will need to download Git and install it from: https://git-scm.com

When install Git, there will be several screens asking you questions. Just select next to accept the default for each of these questions.

## JDK 8
You will need to download and install the Java Development Kit 8 to program in Java - this contains the Java compiler which converts Java code into bit-code, and the Java virtual machine which will run the bit-code for your programs.

1. http://www.oracle.com/technetwork/java/javase/downloads/index.html
2. Find the "download" button corresponding to the JDK and click on it (NOT THE NETBEANS VERSION)
3. Select "Accept License Agreement" in the Java SE Development Kit 8u66 box
4. There will be download links for many different operating systems. Click on the download for your computer system (probably Windows x64	if your computer is reasonably new)
5. Run the downloaded file to install the JDK 8 on your computer.
6. Just like with Git click next through all the questions on the installer.

You will also need to get a GitHub.com account at https://github.com

## Eclipse IDE
Eclipse is a tool that will allow us to edit, run, and even debug our programs - it is our main programming tool.

Installing Eclipse

1. http://www.eclipse.org/downloads/
2. Download Eclipse "IDE for Java Developers" - if you download the one for "Java *EE* Developers", it will work too, but it is much larger and is for web development (which we will not be getting into anytime soon).
3. Eclipse is never really "installed" on your computer. It comes in a ZIP file and just needs to be placed on your computer - so once the file is downloaded, open the ZIP file and drag the "Eclipse" folder onto your desktop.

## GitHub
GitHub is going to host our projects - in the software industry it is well recognized place for hosting countless open source projects. You will need to go to https://github.com/ and sign up for an account with your email. Once you have an account, contact me and send me your GitHub username and the email address you used to sign up for GitHub and I will add you as a collaborator (a member) of this project.

This is where things get hairy...

If no one else is using SSH on your computer (and they would know if they are), then the following instructions will be fine for our purposes. However, if they are, we will have to have some quality time setting your stuff up nice.

### Creating yourself an SSH public/private key

1. Run Git Bash - you may see the icon on your computer or you can search from the start menu.
2. Inside Git Bash enter to following command... make sure to replace the fabricated email address with the email address you used to sign up for GitHub *AND* press <ENTER> for all the questions it asks.

```bash
 ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
```

### Importing your SSH public key into GitHub

1. Now you need to log into https://github.com/
2. On the top-right of the page there an icon with your avatar (picture) - you will need to click on it and select "Settings"
2. On the settings page, click the "SSH keys" option on the left hand side of the page.
4. Click the "Add SSH key" button on the right.
5. Go back into your Git Bash window and enter the following command:

```bash
 cat ~/.ssh/id_rsa.pub
```

6. That command will print out a crazy mess which ends with your email address. This is your SSH public key. Using your mouse, select/highlight this stuff (in Git Bash, this will actually copy the selection to the clipboard)
7. Go back to your browser window where you were in step 4.
8. Click in the text area labeled, "Key" and then press <CNTRL>-v. This will paste the crazy mess into the text area - should look familiar to you.
9. Click on the "Add Key" button
 
### Cloning our Git repository onto your computer

1. If your Git Bash is not open, then open it...
2. Enter the following commands (the last command will ask you a scary question - just answer "yes"):

```bash
 mkdir ~/git
 cd ~/git
 git clone git@github.com:yoshiya8/java-learning-club.git
```
 


