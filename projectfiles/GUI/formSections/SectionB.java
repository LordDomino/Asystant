package projectfiles.gui.formSections;

import projectfiles.components.CRow;
import projectfiles.components.Section;

public class SectionB extends Section {
    public SectionB() {
        super("B. CONTACT PERSON IN CASE OF EMERGENCY");

        CRow row1 = new CRow();
        
        row1.createFieldGroup("Name of contact person", new String[]{"Last name", "First name", "Middle initial"});
        row1.createFieldGroup(new String[]{"Relationship"});
        row1.createFieldGroup(new String[]{"Contact number"});

        this.add(row1);
    }
}
