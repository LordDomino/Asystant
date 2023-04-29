/*
 * Written by Loui Dominic Naquita
 */

package projectfiles.structures;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.border.MatteBorder;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.ArrayList;

import projectfiles.Config;
import projectfiles.Util;
import projectfiles.gui.styles.Colors;


/**
 * A {@code}Row{@code} is a structure containing a horizontal array of fields.
 */
public class Row extends JPanel {

    /**
     * Constructor for a {@code}Row{@code} instance.
     */
    public Row() {
        super();
        this.initialize();
    }
    
    public void initialize() {
        this.setBackground(Colors.white);
        this.setBorder(new MatteBorder(1, 0, 1, 0, Colors.black));
        this.setLayout(new FlowLayout());
    }

    /**
     * Creates a new split partition for the entire row.
     * @param fields - string array of fields
     * @param label - overall label for the entire partition
     */
    public void createPartition(String groupLabel, String[] fieldLabels) {
        FieldGroup fieldGroup = new FieldGroup(groupLabel, fieldLabels);
        this.add(fieldGroup);
    }

    public void createPartition(String[] fieldLabels) {

    }
}