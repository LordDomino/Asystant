package projectfiles.structures;

import javax.swing.JTextArea;

import projectfiles.gui.styles.Fonts;

public class FieldLabel extends JTextArea {
    public FieldLabel(String label) {
        super(label);
        this.initialize();
    }

    private void initialize() {
        this.setFont(Fonts.default_fieldLabel);
    }
}
