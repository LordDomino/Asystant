/*
 * Written by Loui Dominic Naquita
 */

package projectfiles.structures;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



/**
 * A {@code}Row{@code} is a structure containing a horizontal array of fields.
 */
public class Row {

    JFrame mainframe; // create mainframe for future instance
    boolean showTextfields = false; // default flag to show textfields

    /**
     * Constructor for a {@code}Row{@code} instance.
     */
    public Row() {
        this.mainframe = new JFrame(); // instantiate JFrame class
        // mainframe.setSize(500, 100);
        this.mainframe.setLayout(new FlowLayout(FlowLayout.LEFT)); // set layout as FlowLayout to align left to right
        this.mainframe.pack();
        this.mainframe.setResizable(false);
    }

    /**
     * Creates a new split partition for the entire row.
     * @param fields - string array of fields
     * @param label - overall label for the entire partition
     */
    public void createPartition(String fields[], String label) {
        Font defaulFont = new Font("Arial", 0, 18);
        JPanel panel = new JPanel(new GridBagLayout()); // container panel for all fields
        MatteBorder border = new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)); // border for the panel
        
        if (label != "") {
            JTextArea panelLabel = new JTextArea(label);
            panelLabel.setFont(defaulFont);
            panelLabel.setLineWrap(true);
            panelLabel.setEditable(false);
            panel.add(panelLabel);
        } else {}

        for(String field : fields) {
            JTextArea fieldLabel = new JTextArea(field);
            // fieldLabel.setLineWrap(true);
            fieldLabel.setEditable(false);
            fieldLabel.setFont(defaulFont);
            panel.add(fieldLabel);
        }

        // for(int i = 1; i <= fields.length; i++) {
        //     JTextField textField = new JTextField();
        //     textField.setFont(defaulFont);
        //     panel.add(textField);
        // }

        panel.setSize(300, 100);
        panel.setBorder(border);
        this.mainframe.add(panel);
        this.mainframe.pack();
    }

    /**
     * Sets the  
     * @param b
     */
    public void showTextfields(boolean b) {
        this.showTextfields = true;
    }

    /**
     * Sets the current {@code}Row{@code} instance to be visible.
     */
    public void wrap() {
        this.mainframe.setVisible(true);
    }
}
