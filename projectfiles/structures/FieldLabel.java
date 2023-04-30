/**
 * Written by Loui Dominic Naquita
 */

package projectfiles.structures;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import projectfiles.gui.styles.Fonts;

public class FieldLabel extends JLabel {

    String label;

    public FieldLabel(String label) {
        super(label);
        this.label = label;
        this.initialize();
    }

    protected void initialize() {
        if (this.label.length() > 20) {
            // this.setLineWrap(true);
        }
        this.setFont(Fonts.DEFAULT_FIELDLABEL);
        // this.setEditable(false);
        this.setBackground(new Color(255, 255, 255));
    }
}
