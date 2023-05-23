package projectfiles.components;

import java.awt.GridBagConstraints;

import javax.swing.ButtonGroup;

public class CListedBinaryChoice extends CFieldGroup {

  String choice1;
  String choice2;
  String[] prompts;

  public CListedBinaryChoice(String choice1, String choice2, String ... prompts) throws Exception {
    super();
    this.choice1 = choice1;
    this.choice2 = choice2;
    this.prompts = prompts;

    this.setGridBagConstraintValues();
    this.constructComponents();
  }

  private void constructComponents() throws Exception {

    CLabel choice1Label = new CLabel(this.choice1);
    CLabel choice2Label = new CLabel(this.choice2);

    this.gbc.weightx = 0;
    this.gbc.anchor = GridBagConstraints.CENTER;
    this.insets.left = 10;
    this.insets.right = 10;
    this.addOnGrid(choice1Label, 1, 0);
    this.addOnGrid(choice2Label, 2, 0);
    this.insets.left = 3;
    this.insets.right = 3;
    
    int index = 1;
    for (String prompt : this.prompts) {
      CQuestionLabel promptComponent = new CQuestionLabel(prompt);
      CCheckbox choice1Component = new CCheckbox("");
      CCheckbox choice2Component = new CCheckbox("");
      ButtonGroup choicesButtonGroup = new ButtonGroup();
      
      this.gbc.anchor = GridBagConstraints.WEST;
      choicesButtonGroup.add(choice1Component);
      choicesButtonGroup.add(choice2Component);
      
      this.gbc.weightx = 1;
      this.addOnGrid(promptComponent, 0, index);
      
      this.gbc.weightx = 0;
      this.gbc.anchor = GridBagConstraints.CENTER;
      this.addOnGrid(choice1Component, 1, index);
      this.addOnGrid(choice2Component, 2, index);
      index++;
    }
  }

  void setGridBagConstraintValues() {
    this.gbc.fill = GridBagConstraints.NONE;
  }
}