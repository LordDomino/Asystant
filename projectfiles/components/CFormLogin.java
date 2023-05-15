package projectfiles.components;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

/**
 * {@code}CFormField{@code} is a Cobast component acting like Swing's
 * {@code}JTextField{@code} but is customized to include a {@code}JLabel{@code}
 * either to the left or to the top of the text field. It inherits from Swing's
 * {@code}JPanel{@code}.
 * 
 * @author Loui Dominic Naquita 
 * @modified author Lance Resurreccion
 * @see JPanel
 * @see JLabel
 * @see JTextField
 * @see JPasswordField
 * @see JButton
 */
public class CFormLogin extends CFieldGroup {

	/**
	 * The string label to be displayed as the label.
	 */
	String label;
 
	/**
	 * The component serving as this object's label.
	 */
	CLabel labelComponent;

	/**
	 * The component serving as this object's text field.
	 */
	public CTextField textFieldComponent;

	/**
	 * The component serving as this object's password field.
	 */
	public JPasswordField passwordFieldComponent;

	public JButton buttonComponent;

	/**
	 * Creates a new {@code}CFormField{@code} object with the specified label
	 * for the field.
	 * 
	 * @param label - the text label that will be rendered with the text field 
	 */
	public CFormLogin(String label) throws Exception {
		super();
		this.label = label;

		this.constructComponents();
	}

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
	public CFormLogin(String label, int orientation) throws Exception {
		super();
		this.label = label;

		try {
			this.orientation = (int) matchValue(orientation, CFieldGroup.HORIZONTAL, CFieldGroup.VERTICAL);
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid orientation value!");
		}

		this.constructComponents();
	}

	private void constructComponents() throws Exception {
		this.labelComponent = new CLabel(this.label);
		this.textFieldComponent = new CTextField();
		this.passwordFieldComponent = new JPasswordField();
		this.buttonComponent = new JButton("Submit");
		
		this.gbc.weightx = 0; this.gbc.weighty = 0;
		this.add(labelComponent);
		
		this.gbc.weightx = 1; this.gbc.weighty = 1;
		this.add(textFieldComponent);
	
		this.gbc.weightx = 1; this.gbc.weighty = 1;
		this.add(passwordFieldComponent);

		this.gbc.weightx = 1; this.gbc.weighty = 1;
		this.add(buttonComponent);
	}
	
	public void overrideField(int index, JComponent newComponent) throws Exception {
		
		this.remove(this.textFieldComponent);
		this.remove(this.passwordFieldComponent);
		this.remove(this.buttonComponent);

		this.gbc.weightx = 1; this.gbc.weighty = 1;
		this.add(newComponent);
		this.revalidate();
		this.repaint();
	}
}
