package projectfiles.gui.formSections;

import projectfiles.components.CDetailedCheckboxGroup;
import projectfiles.components.CFieldGroup;
import projectfiles.components.CMultipleChoice;
import projectfiles.components.CSection;

public class SectionD extends CSection {
  public SectionD() throws Exception {
    super("D. MEDICATIONS");

    CMultipleChoice group1 = new CMultipleChoice(
      "Does you child have any specific medicine to take for his/her health condition?", 
      CFieldGroup.LEFT,
      CFieldGroup.HORIZONTAL, 
      "Yes", "No"
    );

    CDetailedCheckboxGroup group2 = new CDetailedCheckboxGroup(
      "",
      CFieldGroup.TOP,
      "Please indicate the name of medicine, dosage, and no. of times taken",
      "Vitamins", "Medication for Allergy", "Medication for Asthma", "Medications for Present/Past illness/sickness", "Others"
    );

    this.add(group1);
    this.add(group2);
  }
}
