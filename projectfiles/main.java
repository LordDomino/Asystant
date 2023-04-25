package projectfiles;

import java.util.ArrayList;

import javax.swing.JFrame;

import projectfiles.formSections.*;
import projectfiles.structures.Row;
import projectfiles.structures.Section;
import projectfiles.structures.SectionTab;

public class Main {

    JFrame

    public static void main(String args[]) {
        packMain();
    }

    void packMain() {
        add(new SectionA());
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