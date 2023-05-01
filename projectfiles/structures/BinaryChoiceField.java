package projectfiles.structures;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

public class BinaryChoiceField extends JPanel {

    String choice1;
    String choice2;
    String question = null;
    GridBagConstraints gbc = new GridBagConstraints();
    ButtonGroup buttonGroup = new ButtonGroup();
    JPanel buttonGroupPanel = new JPanel();

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
        this.question = question;
        this.initialize();
    }

    protected void initialize() {
        this.setBackground(Colors.WHITE);
        this.setLayout(new GridBagLayout());
        
        this.gbc.weightx = 1;
        this.gbc.weighty = 1;
        this.gbc.fill = GridBagConstraints.BOTH;

        if (this.question != null) {
            JLabel questionText = new FieldLabel(this.question);
            questionText.setFont(Fonts.DEFAULT_FORMQUESTION);
            this.add(questionText, gbc);
        }

        this.buttonGroupPanel.setBackground(Colors.WHITE);
        this.buttonGroupPanel.setLayout(new GridBagLayout());

        GridBagConstraints buttonGroup_gbc = new GridBagConstraints();
        buttonGroup_gbc.weightx = 1;
        buttonGroup_gbc.weighty = 1;
        buttonGroup_gbc.fill = GridBagConstraints.BOTH;

        JRadioButton choice1Button = new CobastRadioButton(this.choice1);
        JRadioButton choice2Button = new CobastRadioButton(this.choice2);

        choice1Button.setFont(Fonts.DEFAULT_FIELDLABEL);
        choice2Button.setFont(Fonts.DEFAULT_FIELDLABEL);

        this.buttonGroup.add(choice1Button);
        this.buttonGroup.add(choice2Button);

        this.buttonGroupPanel.add(choice1Button, buttonGroup_gbc);
        this.buttonGroupPanel.add(choice2Button, buttonGroup_gbc);
        this.add(buttonGroupPanel, gbc);
    }
}
