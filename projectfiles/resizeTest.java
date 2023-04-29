package projectfiles;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projectfiles.structures.FieldGroup;

public class resizeTest {
    public static void main(String[] args) {
        JFrame mainframe = new JFrame();        
        mainframe.setLayout(new GridBagLayout());
        mainframe.setBackground(new Color(0, 0, 125));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        
        FieldGroup group = new FieldGroup(new String[]{"Field 1", "Field 2", "Field 3 long blah blah blah blah blah blah"});
        mainframe.add(group, gbc);

        mainframe.pack();
        mainframe.setVisible(true);
    }
}
