package projectfiles.gui.testings;

import java.awt.FlowLayout;

import projectfiles.components.CDetailedMultipleChoice;
import projectfiles.components.CFieldGroup;
import projectfiles.components.CFormField;
import projectfiles.components.CMultipleChoice;

public class test_MultipleChoice {
  public static void main(String args[]) throws Exception {
    TestFrame mainFrame = new TestFrame();
    mainFrame.setLayout(new FlowLayout());

    CMultipleChoice mcg1 = new CMultipleChoice("Top header", CFormField.TOP, CFormField.VERTICAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg2 = new CMultipleChoice("Bottom header", CFormField.BOTTOM, CFormField.VERTICAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg3 = new CMultipleChoice("Left header", CFormField.LEFT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg4 = new CMultipleChoice("Right header", CFormField.RIGHT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CDetailedMultipleChoice dmc = new CDetailedMultipleChoice("Header", CFieldGroup.TOP, "Details label", CFieldGroup.RIGHT, CFieldGroup.VERTICAL, "ICT", "HE", "ABM", "STEM", "HUMSS");

    mainFrame.add(mcg1);
    mainFrame.add(mcg2);
    mainFrame.add(mcg3);
    mainFrame.add(mcg4);
    mainFrame.add(dmc);

    mainFrame.packFinalize();
  }
}
