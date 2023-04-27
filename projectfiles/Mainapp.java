package projectfiles;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import projectfiles.formSections.*;
import projectfiles.GUI.SectionTab;
import projectfiles.structures.Row;
import projectfiles.structures.Section;

public class Mainapp extends JFrame{

    static JFrame mainFrame = new JFrame();

    public static void main(String [] args) {
        Mainapp.packMain();
    }

    static void packMain() {
        SectionTab sections = new SectionTab();
        sections.wrap();
        mainFrame.add(sections);
        mainFrame.setSize(400, 250);
        mainFrame.pack();
        
        mainFrame.setVisible(true);
    }
}