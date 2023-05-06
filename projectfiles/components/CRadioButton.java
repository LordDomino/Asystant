package projectfiles.components;

import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

/**
 * {@code}CRadioButton{@code} is a customized Java Swing component inheriting
 * from {@code}JRadioButton{@code} for Cobast.
 * 
 * @author Loui Dominic Naquita
 * @see JRadioButton
 */
public class CRadioButton extends JRadioButton {

    /**
     * Creates a {@code}CRadioButton{@code} object with the specified label to
     * display.
     * 
     * @param label - the text string to display
     */
    public CRadioButton(String label) {
        super(label);
        this.setBackground(Colors.WHITE);
        this.setFont(Fonts.DEFAULT_FORMOPTION);
        this.setIcon(new ImageIcon("projectfiles/gui/graphics/radiobutton.png"));
        this.setSelectedIcon(new ImageIcon("projectfiles/gui/graphics/radiobutton_selected.png"));
    }
}
