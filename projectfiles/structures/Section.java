package projectfiles.structures;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.border.Border;

public class Section {

    JFrame sectionFrame;
    String sectionTitle;
    int rowCount;

    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
        this.sectionFrame = new JFrame(this.sectionTitle);
        this.sectionFrame.setLayout(new GridBagLayout());
    }

    public void addRow(Row row) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3, 0, 3, 0);
        gbc.gridy = rowCount;
        gbc.weightx = gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.rowCount++;
        this.sectionFrame.add(row.mainframe, gbc);
    }

    public void wrap() {
        this.sectionFrame.pack();
        this.sectionFrame.setResizable(false);
        this.sectionFrame.setVisible(true);
    }
}
