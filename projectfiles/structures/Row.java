/*
 * Written by Loui Dominic Naquita
 */

package projectfiles.structures;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import projectfiles.gui.styles.Colors;


/**
 * A {@code}Row{@code} is a structure containing a horizontal array of fields.
 */
public class Row extends JPanel {

    GridBagConstraints gbc = new GridBagConstraints();

    /**
     * Constructor for a {@code}Row{@code} instance.
     */
    public Row() {
        super();
        this.initialize();
    }
    
    public void initialize() {
        this.setBackground(Colors.WHITE);
        // this.setBorder(new MatteBorder(1, 0, 1, 0, Colors.black));
        this.setLayout(new GridBagLayout());

        this.gbc.insets = new Insets(3, 5, 3, 5);
        this.gbc.weightx = 1;
        this.gbc.weighty = 1;
        this.gbc.fill = GridBagConstraints.BOTH;
    }

    public void createFieldGroup(String[] fieldLabels) {
        FieldGroup fieldGroup = new FieldGroup(fieldLabels);
        this.add(fieldGroup, this.gbc);
    }

    /**
     * Creates a new field group belonging to the current row.
     * @param fields - the string array of fields
     * @param label - the overall label for the entire field group
     */
    public void createFieldGroup(String groupLabel, String[] fieldLabels) {
        FieldGroup fieldGroup = new FieldGroup(groupLabel, fieldLabels);
        this.add(fieldGroup, this.gbc);
    }

    public void createBinaryChoiceField(String choice1, String choice2, String question) {
        BinaryChoiceField bcf = new BinaryChoiceField(choice1, choice2, question);
        this.add(bcf, this.gbc);
    }

    @Override
    public Component add(Component c) {
        this.add(c, this.gbc);
        return c;
    }
}