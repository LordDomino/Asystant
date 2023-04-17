/*
 * Written by Loui Dominic Naquita
 */
package projectfiles;

import projectfiles.structures.Row;

public class SectionA {
    public SectionA () {
        Row nameAndSection = new Row();
        String[] nameAndSection_fields1 = {"(Last name)", "(First name)", "(Middle initial)"};
        String[] nameAndSection_fields2 = {"Level and Section"};
        nameAndSection.createPartition(nameAndSection_fields1, "Name: ");
        nameAndSection.createPartition(nameAndSection_fields2, "");
        nameAndSection.wrap();
    }
}
