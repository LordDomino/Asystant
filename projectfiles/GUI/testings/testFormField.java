package projectfiles.gui.testings;

import java.awt.FlowLayout;

import projectfiles.components.CCheckboxGroup;
import projectfiles.components.CDetailedMultipleChoice;
import projectfiles.components.CFieldGroup;
import projectfiles.components.CFormField;
import projectfiles.components.CMultipleChoice;

public class testFormField {
    public static void main(String args[]) throws Exception {
        TestFrame mainFrame = new TestFrame();
        mainFrame.setLayout(new FlowLayout());
        
        // CFormField
        CFormField formField1 = new CFormField("CFormField string only");
        CFormField formField2 = new CFormField("CFormField horizontal", CFormField.HORIZONTAL);
        CFormField formField3 = new CFormField("CFormField vertical", CFormField.VERTICAL);
        
        // CMultipleChoiceGroup
        CMultipleChoice mcg1 = new CMultipleChoice("Top header", CFormField.TOP, CFormField.VERTICAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
        CMultipleChoice mcg2 = new CMultipleChoice("Bottom header", CFormField.BOTTOM, CFormField.VERTICAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
        CMultipleChoice mcg3 = new CMultipleChoice("Left header", CFormField.LEFT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
        CMultipleChoice mcg4 = new CMultipleChoice("Right header", CFormField.RIGHT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
        
        // CDetailedMultipleChoice        
        CDetailedMultipleChoice dmc = new CDetailedMultipleChoice("Header", CDetailedMultipleChoice.RIGHT, "Details label", CFieldGroup.TOP, CDetailedMultipleChoice.VERTICAL, "ICT", "HE", "ABM", "STEM", "HUMSS");
        
        // CCheckBoxGroup
        CCheckboxGroup cbg = new CCheckboxGroup("Checkbox group header", CFieldGroup.TOP, CFieldGroup.VERTICAL, "Choice 1", "Choice 2", "Choice 3", "Choice 4");








        mainFrame.add(formField1);
        mainFrame.add(formField2);
        mainFrame.add(formField3);
        mainFrame.add(mcg1);
        mainFrame.add(mcg2);
        mainFrame.add(mcg3);
        mainFrame.add(mcg4);
        mainFrame.add(dmc);
        mainFrame.add(cbg);

        mainFrame.packFinalize();
    }
}
