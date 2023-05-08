package projectfiles.gui.testings;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;

import projectfiles.gui.formSections.*;

public class sectionsTest {
    public static void main(String[] args) {
        JFrame mainframe = new JFrame();        
        mainframe.setLayout(new GridBagLayout());
        mainframe.setBackground(new Color(0, 0, 125));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 10, 0, 10);
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        
        final SectionA secA = new SectionA();
        final SectionB secB = new SectionB();
        final SectionC secC = new SectionC();

        Util.setGrid(gbc, 0, 0); mainframe.add(secA, gbc);
        Util.setGrid(gbc, 0, 1); mainframe.add(secB, gbc);
        Util.setGrid(gbc, 0, 3); mainframe.add(secC, gbc);
        
        
        mainframe.pack();
        mainframe.setMinimumSize(new Dimension(1000, mainframe.getHeight()));
        mainframe.setVisible(true);
    }
}
