package projectfiles.structures;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

import projectfiles.Util;
import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

public class Section extends JPanel {

    GridBagConstraints gbc = new GridBagConstraints();
    String label = null;

    /**
     * Creates a {@code}Section{@code} object that contains no label.
     */
    public Section() {
        super();
        this.initialize();
    }

    /**
     * Creates a {@code}Section{@code} structure that contains a label rendered
     * at the top of the entire section.
     * @param label - the label written at the top of the entire section.
     */
    public Section(String label) {
        super();
        this.label = label;
        this.initialize();
    }

    private void initialize() {
        this.setBackground(Colors.WHITE);
        this.setBorder(new MatteBorder(1, 0, 1, 0, Colors.BLACK));
        this.setLayout(new GridBagLayout());

        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 10, 0, 10);
        
        Util.setGrid(gbc, 0, 0);
        
        if (this.label != null) {
            JTextArea sectionLabel = new JTextArea(this.label);
            sectionLabel.setFont(Fonts.DEFAULT_SECTIONLABEL);
            sectionLabel.setEditable(false);
            
            gbc.insets = new Insets(10, 10, 10, 10);
            
            this.add(sectionLabel, gbc);
            
            gbc.insets = new Insets(0, 10, 10, 10);
            Util.setGrid(gbc, 0, 1);
        }
    }
    
    @Override
    public Component add(Component c) {
        gbc.gridy++;
        this.add(c, gbc);
        gbc.insets = new Insets(0, 10, 10, 10);
        

        return this;
    }
}