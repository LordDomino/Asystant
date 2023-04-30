package projectfiles.formSections;

import projectfiles.structures.Row;
import projectfiles.structures.Section;

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
