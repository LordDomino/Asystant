package projectfiles.gui.testings;

import javax.swing.JFrame;

import projectfiles.gui.MenuBar;

public class menuBarTest {
    public static void main(String args[]) {
        JFrame testFrame = new JFrame();

        MenuBar menuBar = new MenuBar();
            
        testFrame.setJMenuBar(menuBar);
        testFrame.setSize(200,200);
        testFrame.pack();
        testFrame.setVisible(true);  
    }
}
