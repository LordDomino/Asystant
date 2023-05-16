package projectfiles.gui.testings;

import java.awt.FlowLayout;

import projectfiles.components.CLabelledPasswordField;
import projectfiles.components.CLabelledTextField;

public class test_FormField {
    public static void main(String args[]) throws Exception {
        TestFrame mainFrame = new TestFrame();
        mainFrame.setLayout(new FlowLayout());
        
        // CFormField
        CLabelledTextField formField1 = new CLabelledTextField("CFormField string only");
        CLabelledTextField formField2 = new CLabelledTextField("CFormField horizontal", CLabelledTextField.HORIZONTAL);
        CLabelledTextField formField3 = new CLabelledTextField("CFormField vertical", CLabelledTextField.VERTICAL);
        CLabelledPasswordField clpf = new CLabelledPasswordField("Password field label");

        mainFrame.add(formField1);
        mainFrame.add(formField2);
        mainFrame.add(formField3);
        mainFrame.add(clpf);

        mainFrame.packFinalize();
    }
}
