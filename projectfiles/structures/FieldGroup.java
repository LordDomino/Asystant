package projectfiles.structures;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

import projectfiles.Util;
import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

public class FieldGroup extends JPanel {
    
    private String groupLabel; // This is the label of the field group.
    private String[] fieldLabels;

    /**
     * Constructor for a {@code}FieldGroup{@code} instance, intended to be used
     * with a {@code}Row{@code} parent component. A {@code}FieldGroup{@code} is
     * an entire JPanel that contains multiple text fields.
     * 
     * @param fieldLabels is an arbitrary number of String arguments
     * representing a field label in a form.
     */
    public FieldGroup(String[] fieldLabels) {
        super();
        this.groupLabel = "";
        this.fieldLabels = fieldLabels;
        this.initialize();
    }

    /**
     * Constructor for a {@code}FieldGroup{@code} instance, intended to be used
     * with a {@code}Row{@code} parent component. A {@code}FieldGroup{@code} is
     * an entire JPanel that contains multiple text fields.
     * 
     * @param label is a label that does not contain a text field under it,
     * serving as the label for the entire group.
     * @param fieldLabels is an arbitrary number of String arguments
     * representing a field label in a form.
     */
    public FieldGroup(String groupLabel, String[] fieldLabels) {
        this.groupLabel = groupLabel;
        this.fieldLabels = fieldLabels;
        this.initialize();
    }

    /**
     * Initializes the instance with the given properties and actions inside
     * the method. Use this method to serve as a "common" constructor when using
     * multiple constructors.
     */
    private void initialize() {
        this.setBackground(Colors.white);
        this.setBorder(new MatteBorder(1, 1, 1, 1, Colors.black));
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(7, 7, 5, 7);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;

        int gridx = 0;
        int gridy = 0;

        Util.setGrid(gbc, gridx, gridy);
        
        if(this.groupLabel != "") {
            FieldLabel label = new FieldLabel(groupLabel);

            Util.setGrid(gbc, gridx, gridy);
            this.add(label, gbc);
            gridx++;
        }
        
        for(String labelString : this.fieldLabels) {
            FieldLabel label = new FieldLabel(labelString);
            
            Util.setGrid(gbc, gridx, gridy);
            this.add(label, gbc);
            gridx++;
        }
        
        gridy++;
        gridx = 0;

        gbc.insets = new Insets(5, 7, 7, 7);

        if(this.groupLabel != "") {
            gridx = 1;
        }
        
        for(String labelString : this.fieldLabels) {
            Field field = new Field();
            
            Util.setGrid(gbc, gridx, gridy);
            this.add(field, gbc);
            gridx++;
        }
    }
}