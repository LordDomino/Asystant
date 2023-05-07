package projectfiles.gui.testings;

import java.awt.FlowLayout;

import projectfiles.components.CFormField;
import projectfiles.components.CMultipleChoiceGroup;

public class testFormField {
    public static void main(String args[]) throws Exception {
        TestFrame mainFrame = new TestFrame();
        mainFrame.setLayout(new FlowLayout());
        
        // CFormField
        // CFormField formField1 = new CFormField("CFormField string only");
        // CFormField formField2 = new CFormField("CFormField horizontal", CFormField.HORIZONTAL);
        // CFormField formField3 = new CFormField("CFormField vertical", CFormField.VERTICAL);
        
        // CMultipleChoiceGroup
        CMultipleChoiceGroup mcg1 = new CMultipleChoiceGroup("Top header", CFormField.TOP, CFormField.VERTICAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
        CMultipleChoiceGroup mcg2 = new CMultipleChoiceGroup("Bottom header", CFormField.BOTTOM, CFormField.VERTICAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
        CMultipleChoiceGroup mcg3 = new CMultipleChoiceGroup("Left header", CFormField.LEFT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
        CMultipleChoiceGroup mcg4 = new CMultipleChoiceGroup("Right header", CFormField.RIGHT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");

        // mainFrame.add(formField1);
        // mainFrame.add(formField2);
        // mainFrame.add(formField3);
        mainFrame.add(mcg1);
        mainFrame.add(mcg2);
        mainFrame.add(mcg3);
        mainFrame.add(mcg4);

        mainFrame.packFinalize();
    }
}
