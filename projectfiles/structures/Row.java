/*
 * Written by Loui Dominic Naquita
 */

package projectfiles.structures;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;

import javax.swing.border.MatteBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.ArrayList;

import projectfiles.Config;


/**
 * A {@code}Row{@code} is a structure containing a horizontal array of fields.
 */
public class Row {

    JPanel mainframe; // create mainframe for future instance
    boolean showTextfields = false; // default flag to show textfields
    ArrayList<ArrayList<String>> partitionFieldsList = new ArrayList<ArrayList<String>>();
    ArrayList<String> partitionLabelsList = new ArrayList<String>();

    /**
     * Constructor for a {@code}Row{@code} instance.
     */
    public Row() {
        this.mainframe = new JPanel(); // instantiate JFrame class
        this.mainframe.setLayout(new GridBagLayout()); // set layout as FlowLayout to align left to right
    }

    /**
     * Creates a new split partition for the entire row.
     * @param fields - string array of fields
     * @param label - overall label for the entire partition
     */
    public void createPartition(ArrayList<String> fields, String ... label) {
        
        this.partitionFieldsList.add(fields);
        if (label.length > 0)  {
            this.partitionLabelsList.add(label[0]);
        } else {
            this.partitionLabelsList.add("");
        }
    }

    private void constructPartition(ArrayList<String> fields, String label) {
        JPanel panel = new JPanel(new GridBagLayout()); // container panel for all fields
        MatteBorder border = new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)); // border for the panel
        
        if (label != "") {
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 10, 5, 10);
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 1;
            gbc.weighty = 0;
            JTextArea panelLabel = new JTextArea(label);
            panelLabel.setFont(Config.defaultFont);
            panelLabel.setEditable(false);
            panel.add(panelLabel, gbc);
        } else {}

        for(String field : fields) {
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 10, 5, 10);
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1;
            gbc.weighty = 0;
            JTextArea fieldLabel = new JTextArea(field);
            fieldLabel.setFont(Config.defaultFont);
            fieldLabel.setEditable(false);
            panel.add(fieldLabel, gbc);
        }

        if(showTextfields) {
            for(int i = 1; i <= fields.size(); i++) {
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.insets = new Insets(0, 10, 5, 10);
                
                if(label != "") {
                    gbc.gridx = i;
                } else {
                    gbc.gridx = i - 1;
                }

                gbc.weightx = 1.0;
                gbc.weighty = 0.0;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                JTextField textField = new JTextField();
                textField.setFont(Config.defaultFont);
                panel.add(textField, gbc);
            }
        }

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 2, 0, 2);
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        panel.setBorder(border);
        this.mainframe.add(panel, gbc);
    }

    /**
     * Sets the boolean {@code}showTextfields{@code} to whether or not the text
     * fields under the labels will show.
     * @param b is the boolean to set the flag
     */
    public void setShowTextfields(boolean b) {
        this.showTextfields = b;
    }

    /**
     * Sets the current {@code}Row{@code} instance to be visible.
     */
    public void wrap() {
        int index = 0;
        for(ArrayList<String> partitionFieldSet : this.partitionFieldsList) {
            constructPartition(partitionFieldSet, this.partitionLabelsList.get(index));
            index++;
        }
    }
}