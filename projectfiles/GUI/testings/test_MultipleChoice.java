package projectfiles.gui.testings;

import java.awt.FlowLayout;

import projectfiles.components.CCheckboxGroup;
import projectfiles.components.CDetailedMultipleChoice;
import projectfiles.components.CFieldGroup;
import projectfiles.components.CFormField;
import projectfiles.components.CMultipleChoice;

public class test_MultipleChoice {
  public static void main(String args[]) throws Exception {
    TestFrame mainFrame = new TestFrame();

    CMultipleChoice mcg1 = new CMultipleChoice("Top header", CFormField.TOP, CFormField.VERTICAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg2 = new CMultipleChoice("Bottom header", CFormField.BOTTOM, CFormField.VERTICAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg3 = new CMultipleChoice("Left header", CFormField.LEFT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg4 = new CMultipleChoice("Right header", CFormField.RIGHT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CDetailedMultipleChoice dmc = new CDetailedMultipleChoice("", CFieldGroup.TOP, "Details label", CFieldGroup.RIGHT, CFieldGroup.VERTICAL, "ICT", "HE", "ABM", "STEM", "HUMSS");

    CCheckboxGroup cbg1 = new CCheckboxGroup("Checkbox group header", CFieldGroup.TOP, CFieldGroup.VERTICAL, "Checkbox 1", "Checkbox 2", "Checkboxx 3");


    mainFrame.add(mcg1);
    mainFrame.add(mcg2);
    mainFrame.add(mcg3);
    mainFrame.add(mcg4);
    mainFrame.add(dmc);

    mainFrame.add(cbg1);

    mainFrame.packFinalize();
  }
}
