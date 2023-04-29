package projectfiles.structures;

import java.awt.Color;

import javax.swing.JTextArea;

import projectfiles.gui.styles.Fonts;

public class FieldLabel extends JTextArea {
    public FieldLabel(String label) {
        super(label);
        this.initialize();
    }

    private void initialize() {
        this.setFont(Fonts.default_fieldLabel);
        this.setEditable(false);
        this.setBackground(new Color(255, 255, 255));
    }
}
