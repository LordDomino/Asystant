package projectfiles.components;

import javax.swing.JCheckBox;

import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

/**
 * {@code}CCheckBox{@code} is a customized Java Swing component, extending from
 * {@code}JCheckBox{@code}, to display Cobast checkboxes.
 * 
 * @author Loui Dominic Naquita
 * @see JCheckBox
 */
public class CCheckbox extends JCheckBox {
	
	/**
	 * Creates a {@code}CCheckBox{@code} object with the specified text string to
	 * display.
	 * 
	 * @param text - the text string to display
	 */
	public CCheckbox(String text) {
		super(text);
		this.setFont(Fonts.DEFAULT_LABEL);
		this.setBackground(Colors.WHITE);
	}
}
