package projectfiles;

import java.util.Arrays;
import java.util.ArrayList;

import projectfiles.SectionA;
import projectfiles.structures.Row;

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
        Row row1 = new Row();
        Row row2 = new Row();
        Row row3 = new Row();

        ArrayList<String> row1_part1_fields = new ArrayList<String>(Arrays.asList(new String[]{"test", "test2"}));
        ArrayList<String> row1_part2_fields = {"Level/Section:"};
        ArrayList<String> row2_fields = {"Address:"};
        ArrayList<String> row3_part1_fields = {"(Mobile / Landline number):"};
        ArrayList<String> row3_part2_fields = {"Date of birth:"};
        ArrayList<String> row3_part3_fields = {"Age"};
        ArrayList<String> row3_part4_fields = {"Height (in ft.):"};
        ArrayList<String> row3_part5_fields = {"Weight (in kg.):"};
        
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
    }
}

class SectionC {
    static void pack() {
        Row healthandsafety = new Row();
        ArrayList<String> healthandsafety_fields1 = {"Is your child subject to seizures, fainting, epilepsy, bleeding, asthma or" 
                                           + " any other condition that may affect his or her safety?"};
        ArrayList<String> healthandsafety_fields2 = {"  YES/NO  "};
        healthandsafety.createPartition(healthandsafety_fields1, "");
        healthandsafety.createPartition(healthandsafety_fields2, "");
        healthandsafety.wrap();
    }
}

class SectionB {
    static void pack() {
       Row row = new Row();
       ArrayList<String> row_part1_fields = {"(Last name)", "(First name)", "(Middle initial)"};
       ArrayList<String> row_part2_fields = {"Relationship:"};
       ArrayList<String> row_part3_fields = {"Contact No. :"};
       row.createPartition(row_part1_fields, "Name:");
       row.createPartition(row_part2_fields,"");
       row.createPartition(row_part3_fields, "");
       row.wrap();
    }
}