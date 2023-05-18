package projectfiles.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import projectfiles.gui.formSections.*;

public class GUI_FormArea extends JPanel {

    GridBagConstraints gbc = new GridBagConstraints();

    public GUI_FormArea() {
        super();
        this.setLayout(new GridBagLayout());
        this.gbc.fill = GridBagConstraints.BOTH;
        this.gbc.gridx = 0;
        this.gbc.gridy = 0;
        this.gbc.insets = new Insets(10, 10, 10, 10);

        try {
            add(new SectionA());
            add(new SectionB());
            add(new SectionC());
            add(new SectionD());
            add(new SectionE());
            add(new SectionF());
            add(new SectionG());
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setSize(new Dimension(400, this.getPreferredSize().height));
    }

    @Override
    public Component add(Component component) {
        this.gbc.gridy++;
        this.add(component, this.gbc);
        return component;
    }
}
