package projectfiles;

import java.util.ArrayList;

import projectfiles.formSections.SectionA;
import projectfiles.structures.Row;
import projectfiles.structures.Section;
import projectfiles.structures.SectionTab;

public class Main {
    public static void main(String args[]) {
        SectionA.pack();
        SectionB.pack();
        SectionC.pack();
    }
}

class SectionB {

    static Section sec = new Section("CONTACT PERSON IN CASE OF EMERGENCY");

    static void pack() {
        Row row1 = new Row(); row1.setShowTextfields(true);
        
        ArrayList<String> row1_part1_fields = Util.newArray(new String[]{"(Last name)", "(First name)", "(Middle initial)"});;
        ArrayList<String> row1_part2_fields = Util.newArray(new String[]{"Relationship:"});
        ArrayList<String> row1_part3_fields = Util.newArray(new String[]{"Contact no.:"});
        
        row1.createPartition(row1_part1_fields, "Name:", "Name:");
        row1.createPartition(row1_part2_fields,"");
        row1.createPartition(row1_part3_fields, "");
        row1.wrap();

        sec.addRow(row1);
        
        sec.wrap();
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
        
        sec.wrap();
    }
}