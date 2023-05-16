package projectfiles.gui.testings;

import java.awt.FlowLayout;

import projectfiles.components.CDetailedCheckboxGroup;
import projectfiles.components.CDetailedMultipleChoice;
import projectfiles.components.CFieldGroup;
import projectfiles.components.CLabelledTextField;
import projectfiles.components.CMultipleChoice;

public class test_MultipleChoice {
  public static void main(String args[]) throws Exception {
    TestFrame mainFrame = new TestFrame();
    mainFrame.setLayout(new FlowLayout());

    CMultipleChoice mcg1 = new CMultipleChoice("Top header", CLabelledTextField.TOP, CLabelledTextField.VERTICAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg2 = new CMultipleChoice("Bottom header", CLabelledTextField.BOTTOM, CLabelledTextField.VERTICAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg3 = new CMultipleChoice("Left header", CLabelledTextField.LEFT, CLabelledTextField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg4 = new CMultipleChoice("Right header", CLabelledTextField.RIGHT, CLabelledTextField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CDetailedMultipleChoice dmc = new CDetailedMultipleChoice("Testing", CFieldGroup.TOP, "Details label", CFieldGroup.RIGHT, CFieldGroup.VERTICAL, "ICT", "HE", "ABM", "STEM", "HUMSS");

    CDetailedCheckboxGroup cbg1 = new CDetailedCheckboxGroup("Checkbox group header", CFieldGroup.TOP, "Details", "Checkbox 1", "Checkbox 2", "Checkboxx 3");

    mainFrame.add(mcg1);
    mainFrame.add(mcg2);
    mainFrame.add(mcg3);
    mainFrame.add(mcg4);
    mainFrame.add(dmc);

    mainFrame.add(cbg1);

    mainFrame.packFinalize();
  }
}
