package projectfiles.gui.formSections;

import projectfiles.components.CListedBinaryChoice;
import projectfiles.components.CSection;

public class SectionF extends CSection {
  public SectionF() throws Exception {
    super("F. IMMUNIZATION AND VACCINES");

    CListedBinaryChoice group1 = new CListedBinaryChoice(
      "YES", "NO",
      "Has you child completed the basic immunization from birth to 4 years old?",
      "Hepatitis B",
      "DtaP (Diptheria, Tetanus, and Wooping cough)",
      "Polio",
      "Rotavirus",
      "Pneumococcal (PCV)",
      "Chicken pox (Varicella)",
      "Measles, mumps, and rubella (MMR)",
      "Hepatitis A",
      "Influenza (Flu)",
      "Others");

    this.add(group1);
  }
}
