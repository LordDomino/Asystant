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
        Row nameAndSection = new Row();
        String[] nameAndSection_fields1 = {"(Last name)", "(First name)", "(Middle initial)"};
        String[] nameAndSection_fields2 = {"Level and Section"};
        nameAndSection.createPartition(nameAndSection_fields1, "Name: ");
        nameAndSection.createPartition(nameAndSection_fields2, "");
        nameAndSection.wrap();
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