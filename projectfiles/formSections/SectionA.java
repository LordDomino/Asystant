package projectfiles.formSections;

import java.util.ArrayList;

import projectfiles.Util;
import projectfiles.structures.Row;
import projectfiles.structures.Section;

/**
 * Written by Loui Dominic Naquita
 */
public final class SectionA extends Section {

    public SectionA() {
        super("PERSONAL INFORMATION");
        Row row1 = new Row();
        Row row2 = new Row();
        Row row3 = new Row();
        Row row4 = new Row();
        Row row5 = new Row();
        
        row1.createPartition("Name", new String[]{"(Last name)", "(First name)", "(Middle initial)"});
        row1.createPartition(new String[]{"Level/Section"});
        row2.createPartition(new String[]{"Address"});
        row3.createPartition("Contact Number", new String[]{"(Mobile / Landline number)"});
        row3.createPartition(new String[]{"Date of birth"});
        row3.createPartition(new String[]{"Age"});
        row3.createPartition(new String[]{"Height (in ft.)"});
        row3.createPartition(new String[]{"Weight (in kg.)"});
        row4.createPartition(new String[]{"Name of Mother", "Occupation", "Contact number:", "Email"});
        row5.createPartition(new String[]{"Name of Father", "Occupation", "Contact number:", "Email"});

        this.add(row1);
        this.add(row2);
        this.add(row3);
        this.add(row4);
        this.add(row5);
    }
}
