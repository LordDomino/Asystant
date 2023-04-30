package projectfiles.structures;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import projectfiles.gui.styles.Colors;

public class BinaryChoiceField extends JPanel {

    String choice1;
    String choice2;
    String question = null;
    GridBagConstraints gbc = new GridBagConstraints();

    public BinaryChoiceField(String choice1, String choice2) {
        super();
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.initialize();
    }

    public BinaryChoiceField(String choice1, String choice2, String question) {
        super();
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.initialize();
    }

    protected void initialize() {
        this.setBackground(Colors.WHITE);
        this.setLayout(new GridBagLayout());
        
        this.gbc.weightx = 1;
        this.gbc.weighty = 1;
        this.gbc.fill = GridBagConstraints.BOTH;
    }
}
