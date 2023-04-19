package projectfiles;

import java.util.ArrayList;

import projectfiles.structures.Row;
import projectfiles.structures.Section;

public class Main {
    public static void main(String args[]) {
        SectionB.pack();
        SectionA.pack();
        SectionC.pack();
    }
}

/**
 * Written by Loui Dominic Naquita
 */
class SectionA {

    static Section sec = new Section("PERSONAL INFO");

    static void pack() {
        Row row1 = new Row(); row1.setShowTextfields(true);
        Row row2 = new Row(); row2.setShowTextfields(true);
        Row row3 = new Row(); row3.setShowTextfields(true);

        ArrayList<String> row1_part1_fields = Utils.newArray(new String[]{"(Last name)", "(First name)", "(Middle initial)"});
        ArrayList<String> row1_part2_fields = Utils.newArray(new String[]{"Level/Section"});
        ArrayList<String> row2_part1_fields = Utils.newArray(new String[]{"Address"});
        ArrayList<String> row3_part1_fields = Utils.newArray(new String[]{"(Mobile / Landline number)"});
        ArrayList<String> row3_part2_fields = Utils.newArray(new String[]{"Date of birth:"});
        ArrayList<String> row3_part3_fields = Utils.newArray(new String[]{"Age"});
        ArrayList<String> row3_part4_fields = Utils.newArray(new String[]{"Height (in ft.)"});
        ArrayList<String> row3_part5_fields = Utils.newArray(new String[]{"Weight (in kg.)"});
        
        row1.createPartition(row1_part1_fields, "Name:");
        row1.createPartition(row1_part2_fields, "");
        row2.createPartition(row2_part1_fields, "");
        row3.createPartition(row3_part1_fields, "Contact numbers:");
        row3.createPartition(row3_part2_fields, "");
        row3.createPartition(row3_part3_fields, "");
        row3.createPartition(row3_part4_fields, "");
        row3.createPartition(row3_part5_fields, "");

        row1.wrap();
        row2.wrap();
        row3.wrap();

        sec.addRow(row1);
        sec.addRow(row2);
        sec.addRow(row3);

        sec.wrap();
    }
}

class SectionB {

    static Section sec = new Section("CONTACT PERSON IN CASE OF EMERGENCY");

    static void pack() {
        Row row1 = new Row(); row1.setShowTextfields(true);
        
        ArrayList<String> row1_part1_fields = Utils.newArray(new String[]{"(Last name)", "(First name)", "(Middle initial)"});;
        ArrayList<String> row1_part2_fields = Utils.newArray(new String[]{"Relationship:"});
        ArrayList<String> row1_part3_fields = Utils.newArray(new String[]{"Contact no.:"});
        
        row1.createPartition(row1_part1_fields, "Name:");
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

        ArrayList<String> row1_fields1 = Utils.newArray(new String[]{"YES / NO"});
        
        String row1_label = "Is your child subject to seizures, fainting, epilepsy, bleeding, asthma or any other condition that may affect his or her safety?";

        row1.createPartition(row1_fields1, row1_label);
        row1.wrap();

        sec.addRow(row1);
        
        sec.wrap();
    }
}
