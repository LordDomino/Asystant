package projectfiles.gui.formSections;

import projectfiles.components.CDetailedFormField;
import projectfiles.components.CDetailedListedBinaryChoice;
import projectfiles.components.CLabelledTextField;
import projectfiles.components.CSection;

public class SectionE extends CSection {
  public SectionE() throws Exception {
    super("E. MEDICAL HISTORY");

    CDetailedListedBinaryChoice group1 = new CDetailedListedBinaryChoice(
      "Yes", "No",
      "Please specify details",
      "Asthma",
      "G6PD Deficiency",
      "Stomach problems (pain, constipation, ulcer, or bloated)",
      "Diabetes",
      "Lung problem (Tuberculoses, Bronchities, and Pneumonia)",
      "Heart disorder",
      "Urinary tract infection (UTI)",
      "Fainting/diziness",
      "Eye problem (astigmatism, near/far sightedness)",
      "Fracture (arm, foot, hips, or legs)",
      "Allergic Rhinitis",
      "Eczema (Skin diseases)",
      "Febrile Seizures",
      "Dengue",
      "Pneumonia",
      "Hand, Foot, and Mouth Diseases (HFMD)",
      "Chickenpox",
      "Measles",
      "Is your child wearing an eyeglass?",
      "Hearing difficulty",
      "Other active medical conditions"
    );

    group1.overrideField(18, new CDetailedFormField(new String[]{"Right eye grade", "Left eye grade"}));
    group1.overrideField(20, new CLabelledTextField("Please specify diagnoses, state of illness, and any ongoing medications:", CLabelledTextField.VERTICAL));

    this.add(group1);
  }
}
