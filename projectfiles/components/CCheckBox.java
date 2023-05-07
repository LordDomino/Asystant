package projectfiles.components;

import javax.swing.JCheckBox;

import projectfiles.gui.styles.Fonts;

/**
 * {@code}CCheckBox{@code} is a customized Java Swing component, extending from
 * {@code}JCheckBox{@code}, to display Cobast checkboxes.
 * 
 * @author Loui Dominic Naquita
 * @see JCheckBox
 */
public class CCheckBox extends JCheckBox {
	
	/**
	 * Creates {@code}CCheckBox{@code} object with the specified text string to
	 * display.
	 * 
	 * @param text - the text string to display
	 */
	public CCheckBox(String text) {
		super(text);
		this.setFont(Fonts.DEFAULT_LABEL);
	}
}
