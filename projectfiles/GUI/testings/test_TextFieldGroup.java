package projectfiles.gui.testings;

import projectfiles.components.CTextFieldGroup;

public class test_TextFieldGroup {
  public static void main(String args[]) throws Exception {
    TestFrame tf = new TestFrame();
    
    CTextFieldGroup tfg = new CTextFieldGroup("Textfield group label", new String[]{"Label 1", "Label 2", "Label 3"});

    tf.add(tfg);

    tf.packFinalize();
  }
}
