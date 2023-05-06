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
public class CFormField extends CFieldGroup {
    
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
     * The string label to be displayed as the label.
     */
    String label;

    /**
     * The orientation of this form field indicating the placement of the label
     * and the text field.
     */
    int orientation = CFormField.HORIZONTAL;
 
    /**
     * The component serving as this object's label.
     */
    JLabel labelComponent;

    /**
     * The component serving as this object's text field.
     */
    JTextField textFieldComponent;

    /**
     * Creates a new {@code}CFormField{@code} object with the specified label
     * for the field.
     * 
     * @param label - the text label that will be rendered with the text field 
     */
    public CFormField(String label) {
        super();
        this.label = label;
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
        
        if (orientation == CFormField.HORIZONTAL) {
            this.orientation = orientation;
        } else if (orientation == CFormField.VERTICAL) {
            this.orientation = orientation;
        } else {
            throw new IllegalArgumentException("Value " + orientation + " is not a valid integer value for the parameter \"orientation\"");
        }

        this.constructComponents();
    }

    @Override
    void constructComponents() {
        this.labelComponent = new CLabel(this.label);
        this.textFieldComponent = new CTextField();

        if (this.orientation == CFormField.HORIZONTAL) {
            this.addHorizontal(labelComponent);
            this.addHorizontal(textFieldComponent);
        } else if (this.orientation == CFormField.VERTICAL) {
            this.addVertical(labelComponent);
            this.addVertical(textFieldComponent);
        }
    }
}
