package projectfiles.gui.testings;

import projectfiles.components.CFormField;
import projectfiles.components.CMultipleChoice;

public class test_MultipleChoice2 {
  public static void main(String args[]) throws Exception {
    TestFrame mainFrame = new TestFrame();

    CMultipleChoice mcg1 = new CMultipleChoice("Left header", CFormField.LEFT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg2 = new CMultipleChoice("Left header diff", CFormField.LEFT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg3 = new CMultipleChoice("Left", CFormField.LEFT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");
    CMultipleChoice mcg4 = new CMultipleChoice("Header", CFormField.LEFT, CFormField.HORIZONTAL, "Loui", "Lance", "Ryl", "Zeamon", "Sir Arnold");

    mainFrame.add(mcg1);
    mainFrame.add(mcg2);
    mainFrame.add(mcg3);
    mainFrame.add(mcg4);

    mainFrame.packFinalize();
  }  
}
