package projectfiles.components;

import javax.swing.BorderFactory;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

public class CPasswordField extends JPasswordField {
  public CPasswordField() {
    super(15);
    this.setFont(Fonts.DEFAULT_FIELD);
    this.initialize();
  }

  public CPasswordField(String text) {
    super(text);
    this.setFont(Fonts.DEFAULT_FIELD);
    this.initialize();
  }

  public void initialize() {
		this.setFont(Fonts.DEFAULT_FIELD);
    this.setBackground(Colors.FIELD_FILL);
		this.setBorder(new MatteBorder(1, 1, 1, 1, Colors.FIELD_OUTLINE));
		this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), new EmptyBorder(2, 2, 2, 2)));
	}
}
