package projectfiles;

import projectfiles.SectionA;
import projectfiles.structures.Row;

public class Main {
    public static void main(String args[]) {
        SectionA.pack();
    }
}

/**
 * Written by Loui Dominic Naquita
 */
class SectionA {
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