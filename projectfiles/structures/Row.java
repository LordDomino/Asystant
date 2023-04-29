/*
 * Written by Loui Dominic Naquita
 */

package projectfiles.structures;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.border.MatteBorder;
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
        this.setBackground(Colors.white);
        // this.setBorder(new MatteBorder(1, 0, 1, 0, Colors.black));
        this.setLayout(new GridBagLayout());

        gbc.insets = new Insets(3, 5, 3, 5);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
    }

    /**
     * Creates a new split partition for the entire row.
     * @param fields - string array of fields
     * @param label - overall label for the entire partition
     */
    public void createPartition(String groupLabel, String[] fieldLabels) {
        FieldGroup fieldGroup = new FieldGroup(groupLabel, fieldLabels);

        this.add(fieldGroup, gbc);
    }

    public void createPartition(String[] fieldLabels) {
        FieldGroup fieldGroup = new FieldGroup(fieldLabels);
        this.add(fieldGroup, gbc);
    }
}