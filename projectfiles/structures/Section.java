package projectfiles.structures;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import projectfiles.gui.styles.Colors;

public class Section extends JPanel {

    GridBagConstraints gbc = new GridBagConstraints();
    String label = null;

    public Section() {
        super();
        this.initialize();
    }

    public Section(String label) {
        super();
        this.label = label;
        this.initialize();
    }

    private void initialize() {
        this.setBackground(Colors.white);
        this.setLayout(new GridBagLayout());

        gbc.weightx = 1;
        gbc.weighty = 1;
    }
}