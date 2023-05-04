package projectfiles.components;

import javax.swing.JLabel;

import projectfiles.gui.styles.Fonts;

/**
 * {@code}CLabel{@code} (Cobast Label) is a display area for a short string of
 * text, extending from Swing's {@code}JLabel{@code}. This class is specifically
 * designed to display Cobast labels.
 * 
 * @author Loui Dominic Naquita
 * @see JLabel
 */
public class CLabel extends JLabel {

    /**
     * Creates a {@code}CLabel{@code} object.
     */
    public CLabel() {
        super();
    }

    /**
     * Creates a {@code}CLabel{@code} object with the specified string of text
     * to display.
     * 
     * @param text - the text string to display
     */
    public CLabel(String text) {
        super(text);
        this.setFont(Fonts.DEFAULT_LABEL);
    }
}
