package projectfiles;

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

        String[] row1_part1_fields = {"(Last name)", "(First name)", "(Middle initial)"};
        String[] row1_part2_fields = {"Level/Section:"};
        String[] row2_fields = {"Address:"};
        String[] row3_part1_fields = {"(Mobile / Landline number):"};
        String[] row3_part2_fields = {"Date of birth:"};
        String[] row3_part3_fields = {"Age"};
        String[] row3_part4_fields = {"Height (in ft.):"};
        String[] row3_part5_fields = {"Weight (in kg.):"};
        
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
        String[] healthandsafety_fields1 = {"Is your child subject to seizures, fainting, epilepsy, bleeding, asthma or" 
                                           + " any other condition that may affect his or her safety?"};
        String[] healthandsafety_fields2 = {"  YES/NO  "};
        healthandsafety.createPartition(healthandsafety_fields1, "");
        healthandsafety.createPartition(healthandsafety_fields2, "");
        healthandsafety.wrap();
    }
}

class SectionB {
    static void pack() {
       Row row = new Row();
       String[] row_part1_fields = {"(Last name)", "(First name)", "(Middle initial)"};
       String[] row_part2_fields = {"Relationship:"};
       String[] row_part3_fields = {"Contact No. :"};
       row.createPartition(nameofContactPerson_fields1, "Name:");
       row.createPartition(nameofContactPerson_fields2,"");
       row.createPartition(nameofContactPerson_fields3, "");
       row.wrap();
    }
}


