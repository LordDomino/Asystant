package projectfiles.gui.testings;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projectfiles.gui.MenuBar;

public class mainMenuTest {
    public static void main(String args[]) {
        JFrame testFrame = new JFrame();
        // testFrame.setLayout(new GridBagLayout());

        MenuBar menuBar = new MenuBar();
            
        testFrame.setJMenuBar(menuBar);
        testFrame.setSize(200,200);
        testFrame.pack();
        testFrame.setVisible(true);

        
    }
}
