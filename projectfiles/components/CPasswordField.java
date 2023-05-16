package projectfiles.components;

import javax.swing.JPasswordField;

import projectfiles.gui.styles.Fonts;

public class CPasswordField extends JPasswordField {
  public CPasswordField() {
    super();
    this.setFont(Fonts.DEFAULT_FIELD);
  }

  public CPasswordField(String text) {
    super(text);
    this.setFont(Fonts.DEFAULT_FIELD);
  }
}
