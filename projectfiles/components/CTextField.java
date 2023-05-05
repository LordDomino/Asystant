package projectfiles.components;

import javax.swing.JTextField;

import projectfiles.gui.styles.Fonts;

/**
 * {@code}CTextField{@code} is a Cobast component allowing the editing of a
 * single line of text, extending from Swing's {@code}JTextField{@code}.
 * 
 * @author Loui Dominic Naquita
 * @see JTextField
 */
public class CTextField extends JTextField {

    /**
     * Creates a {@code}CTextField{@code} object.
     */
    public CTextField() {
        super("", 10);
        this.setFont(Fonts.DEFAULT_FIELD);
    }

    /**
     * Creates a {@code}CTextField{@code} object with the specified pre-typed
     * text.
     * 
     * @param text - the pre-typed text rendered with the text field
     */
    public CTextField(String text) {
        super(text, 10);
        this.setFont(Fonts.DEFAULT_FIELD);
    }
}
