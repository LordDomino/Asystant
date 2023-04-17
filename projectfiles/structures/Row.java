/*
 * Written by Loui Dominic Naquita
 */

package projectfiles.structures;

import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Row {

    JFrame mainframe; // create mainframe for future instance

    public Row() {
        mainframe = new JFrame(); // instantiate JFrame class
        mainframe.setSize(500, 100);
        mainframe.setLayout(new FlowLayout(FlowLayout.LEFT)); // set layout as FlowLayout to align left to right
        mainframe.pack();
        mainframe.setResizable(false);
    }

    public void createPartition(String fields[], String label) {
        Font defaulFont = new Font("Arial", 0, 18);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // container panel for all fields
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

        panel.setSize(300, 100);
        panel.setBorder(border);
        mainframe.add(panel);
        mainframe.pack();
    }

    public void wrap() {
        mainframe.setVisible(true);
    }
}
