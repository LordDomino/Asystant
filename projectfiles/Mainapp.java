package projectfiles;

import java.awt.Color;

import javax.swing.JFrame;

import projectfiles.gui.SectionTab;

public class Mainapp extends JFrame{

    static JFrame mainFrame = new JFrame();

    public static void main(String [] args) {
        Mainapp.packMain();
    }

    static void packMain() {
        SectionTab sections = new SectionTab();
        sections.wrap();

        int[] color = Util.randomColor();
        mainFrame.setBackground(new Color(color[0], color[1], color[2]));

        mainFrame.add(sections);
        mainFrame.setSize(400, 250);
        mainFrame.pack();
        
        mainFrame.setVisible(true);
    }
}