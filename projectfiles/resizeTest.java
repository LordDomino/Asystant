package projectfiles;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;

import projectfiles.formSections.SectionA;

public class resizeTest {
    public static void main(String[] args) {
        JFrame mainframe = new JFrame();        
        mainframe.setLayout(new GridBagLayout());
        mainframe.setBackground(new Color(0, 0, 125));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.weightx = gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        
        SectionA secA = new SectionA();

        mainframe.add(secA, gbc);

        mainframe.pack();
        mainframe.setMinimumSize(mainframe.getSize());
        mainframe.setVisible(true);
    }
}
