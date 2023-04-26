package projectfiles.structures;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import projectfiles.Config;

public class Section extends JPanel {

    JPanel container = new JPanel();
    String sectionTitle;
    int rowCount;

    public Section() {
        this.initialize();
    }

    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
        this.initialize();
    }

    public void initialize() {
        JTextArea titleLabel = new JTextArea(this.sectionTitle);
        titleLabel.setFont(Config.defaultFont);
        titleLabel.setEditable(false);
        
        container.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();

        this.setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.BOTH;

        this.add(titleLabel, gbc);

        gbc.gridy = 1;
        this.add(container, gbc);
    }

    public void addRow(Row row) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3, 0, 3, 0);
        gbc.gridy = rowCount;
        gbc.weightx = gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        this.rowCount++;
        container.add(row.mainframe, gbc);
    }
}