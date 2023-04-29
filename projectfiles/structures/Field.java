package projectfiles.structures;

import javax.swing.JTextField;

import projectfiles.gui.styles.Fonts;

public class Field extends JTextField {
    public Field() {
        super();
        this.initialize();
    }
    
    private void initialize() {
        this.setFont(Fonts.default_field);
    }
}
