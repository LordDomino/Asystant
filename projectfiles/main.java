package projectfiles;

import java.util.Arrays;
import java.util.ArrayList;

import projectfiles.structures.Row;
import projectfiles.structures.Section;

public class Main {
    public static void main(String args[]) {
        SectionB.pack();
        SectionA.pack();
    }
}

/**
 * Written by Loui Dominic Naquita
 */
class SectionA {
    static void pack() {
        Row row1 = new Row(); row1.setShowTextfields(true);
        Row row2 = new Row(); row2.setShowTextfields(true);
        Row row3 = new Row(); row3.setShowTextfields(true);

        ArrayList<String> row1_part1_fields = Utils.newArray(new String[]{"(Last name)", "(First name)", "(Middle initial)"});
        ArrayList<String> row1_part2_fields = Utils.newArray(new String[]{"Level/Section"});
        ArrayList<String> row2_fields = Utils.newArray(new String[]{"Address"});
        ArrayList<String> row3_part1_fields = Utils.newArray(new String[]{"(Mobile / Landline number)"});
        ArrayList<String> row3_part2_fields = Utils.newArray(new String[]{"Date of birth:"});
        ArrayList<String> row3_part3_fields = Utils.newArray(new String[]{"Age"});
        ArrayList<String> row3_part4_fields = Utils.newArray(new String[]{"Height (in ft.)"});
        ArrayList<String> row3_part5_fields = Utils.newArray(new String[]{"Weight (in kg.)"});
        
        row1.createPartition(row1_part1_fields, "Name:");
        row1.createPartition(row1_part2_fields, "");
        row2.createPartition(row2_fields, "");
        row3.createPartition(row3_part1_fields, "Contact numbers:");
        row3.createPartition(row3_part2_fields, "");
        row3.createPartition(row3_part3_fields, "");
        row3.createPartition(row3_part4_fields, "");
        row3.createPartition(row3_part5_fields, "");

        row1.wrap();
        row2.wrap();
        row3.wrap();

        Section sec = new Section("PERSONAL INFO");
        sec.addRow(row1);
        sec.addRow(row2);
        sec.addRow(row3);

        sec.wrap();
    }
}

class SectionB {
    static void pack() {
        Row row = new Row();
        ArrayList<String> row_part1_fields = Utils.newArray(new String[]{"(Last name)", "First name", "Middle initial"});;
        ArrayList<String> row_part2_fields = Utils.newArray(new String[]{"Relationship:"});
        ArrayList<String> row_part3_fields = Utils.newArray(new String[]{"Contact no.:"});
        row.createPartition(row_part1_fields, "Name:");
        row.createPartition(row_part2_fields,"");
        row.createPartition(row_part3_fields, "");
        row.wrap();
    }
}

class SectionC {
    static void pack() {
        Row healthandsafety = new Row();
        ArrayList<String> healthandsafety_fields1 = Utils.newArray(new String[]{"Is your child subject to seizures, fainting, epilepsy, bleeding, asthma or" 
                                           + " any other condition that may affect his or her safety?"});
        ArrayList<String> healthandsafety_fields2 = Utils.newArray(new String[]{"YES / NO"});
        healthandsafety.createPartition(healthandsafety_fields1, "");
        healthandsafety.createPartition(healthandsafety_fields2, "");
        healthandsafety.wrap();
    }
}
