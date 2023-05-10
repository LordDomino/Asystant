package projectfiles.gui.testings;

import projectfiles.components.CRow;
import projectfiles.components.CSection;
import projectfiles.components.CTextFieldGroup;

public class test_TextFieldGroup {
  public static void main(String args[]) throws Exception {
    TestFrame tf = new TestFrame();
    
    CTextFieldGroup tfg1 = new CTextFieldGroup("Textfield group label", new String[]{"Label 1", "Label 2", "Label 3"});
    CTextFieldGroup tfg2 = new CTextFieldGroup("Textfield group label 2", new String[]{"Label 4", "Label 5"});
    CTextFieldGroup tfg3 = new CTextFieldGroup("Textfield group label 4", new String[]{"Label 6", "Label 7"});
    CTextFieldGroup tfg4 = new CTextFieldGroup("Textfield group label 3", new String[]{"Label 8", "Label 9"});
    
    CRow row1 = new CRow(tfg1, tfg2);
    CRow row2 = new CRow(tfg3, tfg4);

    CSection sec1 = new CSection("Section 1 example");

    sec1.add(row1);
    sec1.add(row2);

    tf.add(sec1);

    tf.packFinalize();
  }
}
