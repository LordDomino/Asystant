package projectfiles.gui.testings;

import projectfiles.components.CCheckboxGroup;
import projectfiles.components.CDetailedCheckboxGroup;
import projectfiles.components.CFieldGroup;

public class test_Checkboxes {
  public static void main(String args[]) throws Exception {
    TestFrame mainFrame = new TestFrame();

    CCheckboxGroup cbg = new CCheckboxGroup("Header for a check box group", CFieldGroup.TOP, CFieldGroup.VERTICAL, "Checkbox 1", "Checkbox 2", "Checkbox 3");
    CDetailedCheckboxGroup dcbg = new CDetailedCheckboxGroup("Header for a detailed check box group", CFieldGroup.TOP, "Details label", CFieldGroup.VERTICAL, "Checkbox 1", "Checkbox 2", "Checkbox 3");

    mainFrame.add(cbg);
    mainFrame.add(dcbg);

    mainFrame.packFinalize();
  }  
}
