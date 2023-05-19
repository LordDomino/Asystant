package projectfiles.gui.testings;

import projectfiles.components.CFieldGroup;
import projectfiles.components.CLabelledTextField;
import projectfiles.components.CRow;
import projectfiles.components.CSection;
import projectfiles.components.CTextField;
import projectfiles.components.CTextFieldGroup;

public class test_TextFieldGroup {
  public static void main(String args[]) throws Exception {
    TestFrame tf = new TestFrame();

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

    CSection sec1 = new CSection("Section 1 example");

    sec1.add(row1);
    sec1.add(row2);
    sec1.add(row3);

    tf.add(sec1);

    tf.packFinalize();
  }
}
