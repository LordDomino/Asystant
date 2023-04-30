/**
 * Written by Loui Dominic Naquita
 */

package projectfiles.structures;

import javax.swing.JTextField;

import projectfiles.gui.styles.Fonts;

public class Field extends JTextField {
    public Field() {
        super("", 10);
        this.initialize();
    }
    
    protected void initialize() {
        this.setFont(Fonts.DEFAULT_FIELD);
    }
}
