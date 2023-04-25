package projectfiles.structures;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Section extends JPanel {
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
        add(titleLabel);
        this.setLayout(new GridBagLayout());
    }

    public void addRow(Row row) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3, 0, 3, 0);
        gbc.gridy = rowCount;
        gbc.weightx = gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.rowCount++;
        this.add(row.mainframe, gbc);
    }
}