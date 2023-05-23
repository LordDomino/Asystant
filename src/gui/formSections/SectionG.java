package projectfiles.gui.formSections;

import java.awt.GridBagConstraints;

import javax.swing.JSeparator;

import projectfiles.components.CCheckboxGroup;
import projectfiles.components.CDetailedMultipleChoice;
import projectfiles.components.CFieldGroup;
import projectfiles.components.CLabelledTextField;
import projectfiles.components.CLabel;
import projectfiles.components.CMultipleChoice;
import projectfiles.components.CSection;
import projectfiles.components.CSeparator;

public class SectionG extends CSection {
  public SectionG() throws Exception {
    super("G. COVID-19 HEALTH DECLARATION RECORD");

    CMultipleChoice question1 = new CMultipleChoice(
      "1. Has your child contracted the COVID-19 virus?",
      CFieldGroup.LEFT, CFieldGroup.HORIZONTAL, "YES", "NO"
    );

    CLabel question1_ifYes = new CLabel("If yes, please provide necessary information below:");
    CLabelledTextField question1_a = new CLabelledTextField("a. Date/s contracted the virus");
    CMultipleChoice question1_b = new CMultipleChoice("b. Undergone COVID-19 confirmatory test?", CFieldGroup.LEFT, CFieldGroup.HORIZONTAL, "YES", "NO");
    CCheckboxGroup question1_b_ifYes = new CCheckboxGroup("If yes, please check COVID-19 confirmatory test", CFieldGroup.LEFT, CFieldGroup.HORIZONTAL, "Swab test", "Saliva", "Others");
    CMultipleChoice question1_c = new CMultipleChoice("c. COVID-19 Classification and Diagnosis", CFieldGroup.LEFT, CFieldGroup.VERTICAL,
    "Asymptomatic (no symptoms at all, but COVID positive)",
    "Symptomatic (with symptoms and COVID positive)"
    );
    CMultipleChoice question1_d = new CMultipleChoice("d. Have been in a quarantine facility or home isolation?", CFieldGroup.LEFT, CFieldGroup.HORIZONTAL, "YES", "NO");
    CLabelledTextField question1_d_ifYes = new CLabelledTextField(" If yes, please state the location and date of isolation/quarantine");
    CMultipleChoice question1_e = new CMultipleChoice("e. Total no. of days of isolation", CFieldGroup.LEFT, CFieldGroup.HORIZONTAL, "10 days", "14 days", "21 days");
    
    CDetailedMultipleChoice question2 = new CDetailedMultipleChoice("2. Was your child already given COVID-19 vaccine?", CFieldGroup.LEFT, "If no, state the reason", CFieldGroup.RIGHT, CFieldGroup.HORIZONTAL, "Yes", "NO");
    CDetailedMultipleChoice question2_ifYes = new CDetailedMultipleChoice("If yes, how many doses?", CFieldGroup.LEFT, "Date given:", CFieldGroup.RIGHT, CFieldGroup.HORIZONTAL, "Yes", "NO");
    question2.detailsComponent.textFieldComponent.setRows(1);
    question2_ifYes.detailsComponent.textFieldComponent.setRows(1);
    
    CDetailedMultipleChoice question3 = new CDetailedMultipleChoice("3. Name / brand of vaccine", CFieldGroup.TOP, "Specify if \"Others\"", CFieldGroup.RIGHT, CFieldGroup.VERTICAL, "Sinovac", "Astrazeneca", "Pfizer", "Moderna", "Others");
    CDetailedMultipleChoice question4 = new CDetailedMultipleChoice("4. (SHS only) Did your child already receive a booster dose?", CFieldGroup.TOP, "Details:", CFieldGroup.RIGHT, CFieldGroup.VERTICAL, "Yes", "No", "First Booster dose", "Second booster dose", "No");
    CDetailedMultipleChoice question5 = new CDetailedMultipleChoice("5. Name / type of booster vaccine", CFieldGroup.TOP, "Specify if \"Others\"", CFieldGroup.RIGHT, CFieldGroup.VERTICAL, "Sinovac", "Astrazeneca", "Pfizer", "Moderna", "Others");
    

    this.gbc.anchor = GridBagConstraints.WEST;
    this.gbc.fill = GridBagConstraints.NONE;
    this.gbc.weightx = 1;
    this.add(question1);
    this.add(question1_ifYes);
    this.add(question1_a);
    this.add(question1_b);
    this.add(question1_b_ifYes);
    this.add(question1_c);
    this.add(question1_d);
    this.add(question1_d_ifYes);
    this.add(question1_e);
    this.gbc.fill = GridBagConstraints.HORIZONTAL;
    this.add(new CSeparator(JSeparator.HORIZONTAL));
    this.gbc.fill = GridBagConstraints.NONE;
    this.add(question2);
    this.add(question2_ifYes);
    this.gbc.fill = GridBagConstraints.HORIZONTAL;
    this.add(new CSeparator(JSeparator.HORIZONTAL));
    this.gbc.fill = GridBagConstraints.NONE;
    this.add(question4);
    this.gbc.fill = GridBagConstraints.HORIZONTAL;
    this.add(new CSeparator(JSeparator.HORIZONTAL));
    this.gbc.fill = GridBagConstraints.NONE;
    this.add(question3);
    this.gbc.fill = GridBagConstraints.HORIZONTAL;
    this.add(new CSeparator(JSeparator.HORIZONTAL));
    this.gbc.fill = GridBagConstraints.NONE;
    this.add(question5);
  }
}
