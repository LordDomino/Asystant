package projectfiles.gui.formSections;

import projectfiles.components.CRow;
import projectfiles.components.CSection;
import projectfiles.components.CTextFieldGroup;

public class SectionB extends CSection {
	public SectionB() throws Exception {
		super("B. CONTACT PERSON IN CASE OF EMERGENCY");
	
		CTextFieldGroup r1_g1 = new CTextFieldGroup("Name of Contact Person:", new String[]{"Last name", "First name", "Middle Initial"});
        CTextFieldGroup r1_g2 = new CTextFieldGroup(new String[]{"Relationship"});
		CTextFieldGroup r1_g3 = new CTextFieldGroup(new String[]{"Contact No:"});

		CRow row1 = new CRow(r1_g1, r1_g2, r1_g3);

		this.add(row1);

	}

}
