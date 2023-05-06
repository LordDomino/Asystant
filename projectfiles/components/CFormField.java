package projectfiles.components;

import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * {@code}CFormField{@code} is a Cobast component acting like Swing's
 * {@code}JTextField{@code} but is customized to include a {@code}JLabel{@code}
 * either to the left or to the top of the text field. It inherits from Swing's
 * {@code}JPanel{@code}.
 * 
 * @author Loui Dominic Naquita
 * @see JPanel
 * @see JLabel
 * @see JTextField
 */
public class CFormField extends JPanel {
    
    /**
     * The horizontal orientation constant. This indicates a horizontal 
     * orientation (from left to right) of the components.
     */
    public static final int HORIZONTAL = 0;

    /**
     * The vertical orientation constant. This indicates a vertical orientation
     * (from top to bottom) of the components.
     */
    public static final int VERTICAL = 1;

    /**
     * The string label to be written in the label
     */
    String label;
    int orientation = CFormField.HORIZONTAL;
    GridBagLayout layout = new GridBagLayout();
    
    /**
     * Creates a new {@code}CFormField{@code} object with the specified label
     * for the field.
     * 
     * @param label - the text label that will be rendered with the text field 
     */
    public CFormField(String label) {
        super();
        this.label = label;
        this.setLayout(layout);
    }

    /**
     * Creates a new {@code}CFormField{@code} object with the specified label
     * for the field and the orientation of the placement of the label and text
     * field.
     * 
     * @param label - the text label that will be rendered with the text field
     * @param orientation - the direction that determines how the label and the
     * text field will be placed, either from left to right or from top to
     * bottom
     */
    public CFormField(String label, int orientation) {
        super();
        this.label = label;
        this.setLayout(layout);
        
        if (orientation == CFormField.HORIZONTAL) {
            this.orientation = orientation;
        } else if (orientation == CFormField.VERTICAL) {
            this.orientation = orientation;
        } else {
            throw new IllegalArgumentException("Value " + orientation + " is not a valid integer value for the parameter \"orientation\"");
        }
    }
}
