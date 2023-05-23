package projectfiles.components;

import java.awt.Font;
import java.awt.GridBagConstraints;

public class CLabelledPasswordField extends CFieldGroup {

  String label;
  CLabel labelComponent;

  String passwordFieldPretext;
  CPasswordField passwordFieldComponent;

  public CLabelledPasswordField(String label) throws Exception {
    super();
    this.label = label;

    this.constructComponents();
  }

  public CLabelledPasswordField(String label, String pretext) throws Exception {
    super();
    this.label = label;
    this.passwordFieldPretext = pretext;

    this.constructComponents();
  }

  private void constructComponents() throws Exception {
    this.labelComponent = new CLabel(this.label);
    this.passwordFieldComponent = new CPasswordField();

    this.labelComponent.setFont(new Font("Arial", Font.BOLD, 13));

    this.gbc.fill = GridBagConstraints.BOTH;
    this.gbc.weightx = 0; this.gbc.weighty = 0;
		this.addVertical(this.labelComponent);
		
		this.gbc.weightx = 1; this.gbc.weighty = 1;
		this.addVertical(this.passwordFieldComponent);
  }
}
