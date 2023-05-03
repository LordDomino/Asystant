package projectfiles.gui.testings;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projectfiles.gui.MainMenu;

public class mainMenuTest {
    public static void main(String args[]) {
        JFrame testFrame = new JFrame();
        testFrame.setLayout(new GridBagLayout());

        MainMenu mainMenu = new MainMenu();

        testFrame.add(mainMenu);
        testFrame.pack();
        testFrame.setVisible(true);
    }
}
