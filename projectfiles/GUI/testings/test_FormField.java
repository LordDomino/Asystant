package projectfiles.gui.testings;

import java.awt.FlowLayout;

import projectfiles.components.CFormField;

public class test_FormField {
    public static void main(String args[]) throws Exception {
        TestFrame mainFrame = new TestFrame();
        mainFrame.setLayout(new FlowLayout());
        
        // CFormField
        CFormField formField1 = new CFormField("CFormField string only");
        CFormField formField2 = new CFormField("CFormField horizontal", CFormField.HORIZONTAL);
        CFormField formField3 = new CFormField("CFormField vertical", CFormField.VERTICAL);

        mainFrame.add(formField1);
        mainFrame.add(formField2);
        mainFrame.add(formField3);

        mainFrame.packFinalize();
    }
}
