package projectfiles.gui.formSections;

import javax.swing.JSeparator;

import projectfiles.components.CDetailedCheckboxGroup;
import projectfiles.components.CDetailedMultipleChoice;
import projectfiles.components.CFieldGroup;
import projectfiles.components.CSection;
import projectfiles.components.CSeparator;

public class SectionC extends CSection {
    public SectionC() throws Exception {
        super("C. HEALTH AND SAFETY CONDITIONS");
  
        CDetailedMultipleChoice group1 = new CDetailedMultipleChoice(
            "1. Is your child subject to seizures, fainting, epilepsy, bleeding, asthma, or any other condition that may affect his or her safety?",
            CFieldGroup.LEFT,
            "If yes, specify details: (Name of Drug / Medication used)",
            CFieldGroup.BOTTOM, CFieldGroup.HORIZONTAL,
            "Yes", "No"
        );

        CSeparator sep1 = new CSeparator(JSeparator.HORIZONTAL);

        CDetailedCheckboxGroup group2 = new CDetailedCheckboxGroup(
            "Is your child allergic to the following?",
            CFieldGroup.TOP,
            "If yes, please specify details",
            "Food", "Insect bite", "Medication", "Others"
        );

        this.add(group1);
        this.add(sep1);
        this.add(group2);
    }

}


