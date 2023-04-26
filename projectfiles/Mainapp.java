package projectfiles;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import projectfiles.GUI.SectionTab;
import projectfiles.formSections.*;
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
        mainFrame.setSize(400, 400);
        mainFrame.pack();
        
        mainFrame.setVisible(true);
    }
}

class SectionC {

    static Section sec = new Section("HEALTH AND SAFETY CONDITIONS");

    static void pack() {
        Row row1 = new Row(); row1.setShowTextfields(true);

        ArrayList<String> row1_fields1 = Util.newArray(new String[]{"YES / NO"});
        
        String row1_label = "Is your child subject to seizures, fainting, epilepsy, bleeding, asthma or any other condition that may affect his or her safety?";

        row1.createPartition(row1_fields1, row1_label);
        row1.wrap();

        sec.addRow(row1);
    }
}