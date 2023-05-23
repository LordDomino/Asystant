package projectfiles.gui.formSections;

import projectfiles.components.CFieldGroup;
import projectfiles.components.CLabelledTextField;
import projectfiles.components.CRow;
import projectfiles.components.CSection;
import projectfiles.components.CTextField;
import projectfiles.components.CTextFieldGroup;


public final class SectionA extends CSection {

    public SectionA() throws Exception {
        super("A. PERSONAL INFORMATION");
        CTextFieldGroup r1_g1 = new CTextFieldGroup("Name", new String[]{"Last name", "First name", "Middle Initial"});
        CTextFieldGroup r1_g2 = new CTextFieldGroup(new String[]{"Level/Section"});
        CTextFieldGroup r2_g1 = new CTextFieldGroup(new String[]{"Address:"});
        CTextFieldGroup r3_g1 = new CTextFieldGroup("Contact Numbers:", new String[]{"(Mobile / Landline number):"});
        CLabelledTextField r3_g2 = new CLabelledTextField("Date of birth", CFieldGroup.VERTICAL);
        CTextFieldGroup r3_g3 = new CTextFieldGroup(new String[]{"Age:"});
        CTextFieldGroup r3_g4 = new CTextFieldGroup(new String[]{"Height:(in ft.)"}); 
        CTextFieldGroup r3_g5 = new CTextFieldGroup(new String[]{"Weight:(kg.)"}); 
        CTextFieldGroup r4_g1 = new CTextFieldGroup(new String[]{"Name of Mother:"});
        CTextFieldGroup r4_g2 = new CTextFieldGroup(new String[]{"Occupation"});
        CTextFieldGroup r4_g3 = new CTextFieldGroup(new String[]{"Contact number:"});
        CTextFieldGroup r4_g4 = new CTextFieldGroup(new String[]{"Email"});
        CTextFieldGroup r5_g1 = new CTextFieldGroup(new String[]{"Name of Father:"});
        CTextFieldGroup r5_g2 = new CTextFieldGroup(new String[]{"Occupation"});
        CTextFieldGroup r5_g3 = new CTextFieldGroup(new String[]{"Contact number:"});
        CTextFieldGroup r5_g4 = new CTextFieldGroup(new String[]{"Email"});

        CRow row1 = new CRow(r1_g1, r1_g2);
        CRow row2 = new CRow(r2_g1);
        CRow row3 = new CRow(r3_g1, r3_g2, r3_g3, r3_g4, r3_g5);
        CRow row4 = new CRow(r4_g1, r4_g2, r4_g3, r4_g4);
        CRow row5 = new CRow(r5_g1, r5_g2, r5_g3, r5_g4);


        this.add(row1);
        this.add(row2);
        this.add(row3);
        this.add(row4);
        this.add(row5);

    }
}