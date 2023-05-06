package projectfiles.gui.testings;

import java.awt.FlowLayout;

import projectfiles.components.CFormField;
import projectfiles.components.CMultipleChoiceGroup;

public class testFormField {
    public static void main(String args[]) throws Exception {
        TestFrame mainFrame = new TestFrame();
        mainFrame.setLayout(new FlowLayout());
        
        // CFormField
        CFormField formField1 = new CFormField("CFormField string only");
        CFormField formField2 = new CFormField("CFormField horizontal", CFormField.HORIZONTAL);
        CFormField formField3 = new CFormField("CFormField vertical", CFormField.VERTICAL);
        
        // CMultipleChoiceGroup
        CMultipleChoiceGroup mcg = new CMultipleChoiceGroup("Pick-a-coder", "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");

        mainFrame.add(formField1);
        mainFrame.add(formField2);
        mainFrame.add(formField3);
        mainFrame.add(mcg);

        mainFrame.packFinalize();
    }
}
