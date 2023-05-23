package projectfiles.gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projectfiles.components.CFieldGroup;
import projectfiles.components.CLabel;
import projectfiles.components.CLabelledPasswordField;
import projectfiles.components.CLabelledTextField;
import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

import javax.swing.JPasswordField;

/**
 * {@code}CFormField{@code} is a Cobast component acting like Swing's
 * {@code}JTextField{@code} but is customized to include a {@code}JLabel{@code}
 * either to the left or to the top of the text field. It inherits from Swing's
 * {@code}JPanel{@code}.
 * 
 * @author Lance Resurreccion
 * @author Loui Dominic Naquita (contributor)
 * @see JPanel
 * @see JLabel
 * @see JTextField
 * @see JPasswordField
 * @see JButton
 */
public class GUI_LoginBox extends CFieldGroup {

	/**
	 * The string text to be displayed as the group label.
	 */
	String label;

	/**
	 * The string text to be displayed as the label for the password field.
	 */
	String passwordFieldLabel;

	/**
	 * The string text to be displayed as the label for the button.
	 */
	String buttonLabel;

	/**
	 * The array of string text to be displayed as the label for the different
	 * fields.
	 */
	String[] fieldLabels;

	/**
	 * The component serving as this object's label.
	 */
	CLabel labelComponent;

	/**
	 * The component serving as this object's password field.
	 */
	CLabelledPasswordField passwordFieldComponent;
	
	/**
	 * The component serving as this object's button.
	 */
	JButton buttonComponent;

	/**
	 * Creates a new {@code}CFormField{@code} object with the specified label
	 * for the field and the orientation of the placement of the label and text
	 * field.
	 * 
	 * @param label - the text label that will be rendered with the text field
	 * @param orientation - the direction that determines how the label and the
	 * text field will be placed, either from left to right or from top to
	 * bottom
	 */
	public GUI_LoginBox(String label, String passwordFieldLabel, String buttonLabel, String[] fieldLabels) throws Exception {
		super();
		this.label = label;
		this.passwordFieldLabel = passwordFieldLabel;
		this.buttonLabel = buttonLabel;
		this.fieldLabels = fieldLabels;
		
		// Setup styles and layout below
		// the CLoginBox will always be oriented vertically
		this.orientation = CFieldGroup.VERTICAL;
		this.setBackground(Colors.BACKGROUND_ACCENT_DARK);

		this.constructComponents();
	}

	private void constructComponents() throws Exception {

		int marginSize = 30;

		this.labelComponent = new CLabel(this.label);
		this.labelComponent.setFont(new Font("Arial", Font.PLAIN, 24));
		this.labelComponent.setForeground(Colors.TEXT_ACCENT1);
		
		this.gbc.insets.top = marginSize;
		this.gbc.insets.left = marginSize;
		this.gbc.insets.right = marginSize;
		this.gbc.anchor = GridBagConstraints.CENTER;
		this.gbc.fill = GridBagConstraints.NONE;
		this.gbc.weightx = 0; this.gbc.weighty = 0;
		this.add(labelComponent);
		
		this.gbc.fill = GridBagConstraints.BOTH;
		this.gbc.anchor = GridBagConstraints.WEST;
		this.gbc.insets.top = 0;
		this.gbc.weightx = 1; this.gbc.weighty = 1;
		
		for (String fieldLabel : this.fieldLabels) {
			CLabelledTextField field = new CLabelledTextField(fieldLabel, CFieldGroup.VERTICAL);
			
			// Field styling
			field.labelComponent.setFont(new Font("Arial", Font.BOLD, 13));
			field.setBackground(Colors.BACKGROUND_ACCENT_DARK);
			field.textFieldComponent.setLineWrap(false);
			
			this.add(field);
		}
		
		this.passwordFieldComponent = new CLabelledPasswordField(this.passwordFieldLabel);
		this.passwordFieldComponent.setBackground(Colors.BACKGROUND_ACCENT_DARK);
		this.buttonComponent = new JButton(this.buttonLabel);
		this.buttonComponent.setBackground(Colors.BUTTON1_FILL);
		this.buttonComponent.setFont(Fonts.DEFAULT_LABEL);
		this.buttonComponent.setForeground(Colors.BUTTONTEXT_ACCENT1);
		
		this.add(passwordFieldComponent);
		
		this.gbc.insets.top = 20;
		this.gbc.insets.bottom = marginSize;
		this.gbc.fill = GridBagConstraints.NONE;
		this.gbc.anchor = GridBagConstraints.CENTER;
		this.add(buttonComponent);
	}
}
