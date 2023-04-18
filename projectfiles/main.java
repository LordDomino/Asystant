package projectfiles;

import projectfiles.SectionA;
import projectfiles.structures.Row;

public class Main {
    public static void main(String args[]) {
        SectionB secB = new SectionB();
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

class SectionB {
    SectionB () {
       Row nameofContactPerson = new Row();
       String[] nameofContactPerson_fields1 = {"(Last name)", "(First name)", "(Middle initial)"};
       String[] nameofContactPerson_fields2 = {"Relationship:"};
       String[] nameofContactPerson_fields3 = {"Contact No. :"};
       nameofContactPerson.createPartition(nameofContactPerson_fields1, "Name:");
       nameofContactPerson.createPartition(nameofContactPerson_fields2,"");
       nameofContactPerson.createPartition(nameofContactPerson_fields3, "");
       nameofContactPerson.wrap();
    }
}