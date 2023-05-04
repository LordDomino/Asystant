package projectfiles.gui.formSections;

import projectfiles.components.Row;
import projectfiles.components.Section;

/**
 * Written by Loui Dominic Naquita
 */
public final class SectionA extends Section {

    public SectionA() {
        super("A. PERSONAL INFORMATION");
        Row row1 = new Row();
        Row row2 = new Row();
        Row row3 = new Row();
        Row row4 = new Row();
        Row row5 = new Row();
        
        row1.createFieldGroup("Name", new String[]{"(Last name)", "(First name)", "(Middle initial)"});
        row1.createFieldGroup(new String[]{"Level/Section"});
        row2.createFieldGroup(new String[]{"Address"});
        row3.createFieldGroup("Contact Number", new String[]{"(Mobile / Landline number)"});
        row3.createFieldGroup(new String[]{"Date of birth"});
        row3.createFieldGroup(new String[]{"Age"});
        row3.createFieldGroup(new String[]{"Height (in ft.)"});
        row3.createFieldGroup(new String[]{"Weight (in kg.)"});
        row4.createFieldGroup(new String[]{"Name of Mother", "Occupation", "Contact number:", "Email"});
        row5.createFieldGroup(new String[]{"Name of Father", "Occupation", "Contact number:", "Email"});

        this.add(row1);
        this.add(row2);
        this.add(row3);
        this.add(row4);
        this.add(row5);
    }
}