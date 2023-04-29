package projectfiles;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projectfiles.structures.Row;

public class resizeTest {
    public static void main(String[] args) {
        JFrame mainframe = new JFrame();        
        mainframe.setLayout(new GridBagLayout());
        mainframe.setBackground(new Color(0, 0, 125));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        
        Row row1 = new Row();
        Row row2 = new Row();
        Row row3 = new Row();
        row1.createPartition("Name", new String[]{"(Last name)", "(First name)", "(Middle initial)"});
        row1.createPartition(new String[]{"Level/Section"});
        row2.createPartition(new String[]{"Address"});
        row3.createPartition(new String[]{"Mobile / Landline number"});

        gbc.gridx = 0; gbc.gridy = 0; mainframe.add(row1, gbc); 
        gbc.gridx = 0; gbc.gridy = 1; mainframe.add(row2, gbc); 
        gbc.gridx = 0; gbc.gridy = 2; mainframe.add(row3, gbc); 

        mainframe.pack();
        mainframe.setVisible(true);
    }
}
