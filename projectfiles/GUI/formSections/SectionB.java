package projectfiles.gui.formSections;

import projectfiles.components.Row;
import projectfiles.components.Section;

public class SectionB extends Section {
    public SectionB() {
        super("B. CONTACT PERSON IN CASE OF EMERGENCY");

        Row row1 = new Row();
        
        row1.createFieldGroup("Name of contact person", new String[]{"Last name", "First name", "Middle initial"});
        row1.createFieldGroup(new String[]{"Relationship"});
        row1.createFieldGroup(new String[]{"Contact number"});

        this.add(row1);
    }
}
