/**
 * Written by Loui Dominic Naquita
 */

package projectfiles.components;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import projectfiles.Util;
import projectfiles.gui.styles.Colors;

public class FieldGroup extends JPanel {

    GridBagConstraints gbc = new GridBagConstraints();
    
    private String groupLabel = null; // This is the label of the field group.
    private String[] fieldLabels;

    public FieldGroup() {
        super();
        this.initialize();
    }

    /**
     * Creates a {@code}FieldGroup{@code} object, intended to be used with a
     * {@code}Row{@code} parent component. A {@code}FieldGroup{@code} is
     * an entire JPanel that contains multiple text fields.
     * 
     * @param fieldLabels is an arbitrary number of String arguments
     * representing a field label in a form.
     */
    public FieldGroup(String[] fieldLabels) {
        super();
        this.fieldLabels = fieldLabels;
        this.initialize();
        this.addFields();
    }

    /**
     * Constructor for a {@code}FieldGroup{@code} instance, intended to be used
     * with a {@code}Row{@code} parent component. A {@code}FieldGroup{@code} is
     * an entire JPanel that contains multiple text fields.
     * 
     * @param label - a label that does not contain a text field under it,
     * serving as the label for the entire group.
     * @param fieldLabels - an arbitrary number of String arguments
     * representing a field label in a form.
     */
    public FieldGroup(String groupLabel, String[] fieldLabels) {
        super();
        this.groupLabel = groupLabel;
        this.fieldLabels = fieldLabels;
        this.initialize();
        this.addFields();
    }

    /**
     * Initializes the instance with the given properties and actions inside
     * the method. Use this method to serve as a "common" constructor when using
     * multiple constructors.
     */
    protected void initialize() {
        this.setBackground(Colors.WHITE);
        this.setBorder(new MatteBorder(1, 1, 1, 1, Colors.GRAY));
        this.setLayout(new GridBagLayout());

        this.gbc.insets = new Insets(7, 7, 2, 7);
        this.gbc.weightx = 1;
        this.gbc.weighty = 1;
        this.gbc.fill = GridBagConstraints.BOTH;

    }
    
    protected void addFields() {

        int gridx = 0;
        int gridy = 0;

        Util.setGrid(this.gbc, gridx, gridy);
        
        if(this.groupLabel != null) {
            JLabel label = new FieldGroupLabel(groupLabel);

            Util.setGrid(this.gbc, gridx, gridy);
            this.gbc.gridheight = 2;
            this.gbc.weightx = 0;
            this.add(label, gbc);

            this.gbc.gridheight = 1;
            this.gbc.weightx = 1;
            gridx++;
        }
        
        for(String labelString : this.fieldLabels) {
            FieldLabel label = new FieldLabel(labelString);
            
            Util.setGrid(this.gbc, gridx, gridy);
            this.add(label, this.gbc);
            gridx++;
        }
        
        gridy++;
        gridx = 0;

        this.gbc.insets = new Insets(2, 7, 7, 7);

        if(this.groupLabel != null) {
            gridx = 1;
        }
        
        for(int i = 0; i < this.fieldLabels.length; i++) {
            CTextField field = new CTextField();
            
            Util.setGrid(this.gbc, gridx, gridy);
            this.add(field, this.gbc);
            gridx++;
        }
    }
}