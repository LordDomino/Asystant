package projectfiles.components;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

/**
 * {@code}CTextField{@code} is a Cobast component allowing the editing of a
 * single line of text, extending from Swing's {@code}JTextField{@code}.
 * 
 * @author Loui Dominic Naquita
 * @see JTextField
 */
public class CTextField extends JTextArea {

	/**
	 * Creates a {@code}CTextField{@code} object at a default of 10 columns
	 * that contains an empty string.
	 */
	public CTextField() {
		super("", 0, 10);
		this.initialize();
	}

	/**
	 * Creates a {@code}CTextField{@code} object with the specified pre-typed
	 * text.
	 * 
	 * @param text - the pre-typed text rendered with the text field
	 */
	public CTextField(String text) {
		super(text, 0, 10);
		this.initialize();
	}

	public CTextField(String text, int rows, int columns) {
		super(text, rows, columns);
		this.initialize();
	}
	
	public void initialize() {
		this.setFont(Fonts.DEFAULT_FIELD);
		this.setBorder(new MatteBorder(1, 1, 1, 1, Colors.GRAY));
		this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), new EmptyBorder(2, 2, 2, 2)));
		this.setLineWrap(true);
		this.setWrapStyleWord(true);
	}
}
