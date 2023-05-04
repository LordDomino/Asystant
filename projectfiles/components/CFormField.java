package projectfiles.components;

import javax.swing.JPanel;

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

    String label;
    int orientation = CFormField.HORIZONTAL;
    
    /**
     * Creates a new {@code}CFormField{@code} object with the specified label
     * for the field.
     * 
     * @param label - the text label that will be rendered with the text field 
     */
    public CFormField(String label) {
        super();
        this.label = label;
        this.setLayout(new GridBagLayout());
    }

    /**
     * Creates a new {@code}CFormField{@code} object with the specified label
     * for the field and the orientation of the placement of the label and text
     * field.
     * 
     * @param label - the text label that will be rendered with the text field
     * @param orientation - the direction that determines how the label and the
     * text field will be place, either from left to right or from top to
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
    }
}
