package projectfiles;

import projectfiles.SectionA;
import projectfiles.structures.Row;

public class Main {
    public static void main(String args[]) {
        SectionA secA = new SectionA();
    }
}

/**
 * Written by Loui Dominic Naquita
 */
class SectionA {
    SectionA () {
        Row nameAndSection = new Row();
        String[] nameAndSection_fields1 = {"(Last name)", "(First name)", "(Middle initial)"};
        String[] nameAndSection_fields2 = {"Level and Section"};
        nameAndSection.createPartition(nameAndSection_fields1, "Name: ");
        nameAndSection.createPartition(nameAndSection_fields2, "");
        nameAndSection.wrap();
    }
}

class SectionC {
    SectionC () {

    }
}