package projectfiles.structures;

import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

public class CobastRadioButton extends JRadioButton {
    public CobastRadioButton(String label) {
        super(label);
        this.setBackground(Colors.WHITE);
        this.setFont(Fonts.DEFAULT_FIELDLABEL);
        this.setIcon(new ImageIcon("projectfiles/gui/graphics/radiobutton.png"));
        this.setSelectedIcon(new ImageIcon("projectfiles/gui/graphics/radiobutton_selected.png"));
    }
}
