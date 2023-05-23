package projectfiles.components;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

/**
 * {@code}CLabel{@code} is a display area for a short string of text, extending
 * from Swing's {@code}JLabel{@code}. This class is specifically designed to
 * display Cobast labels.
 * 
 * @author Loui Dominic Naquita
 * @see JLabel
 */
public class CLabel extends JLabel {
	
	/**
	 * Creates a {@code}CLabel{@code} object with the specified text string to
	 * display.
	 * 
	 * @param text - the text string to display
	 */
	public CLabel(String text) {
		super(text);
		this.setOpaque(false);
		this.setFont(Fonts.DEFAULT_LABEL);
		this.setForeground(Colors.TEXT_ACCENT1);
	}
}
