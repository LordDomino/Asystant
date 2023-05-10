package projectfiles.gui.testings;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class TestFrame extends JFrame {

    GridBagConstraints gbc = new GridBagConstraints();

    public TestFrame() {
        super("TEST WINDOW for Cobast GUI Development");
        this.setLayout(new GridBagLayout());
        this.gbc.fill = GridBagConstraints.BOTH;
        this.gbc.gridx = 0;
        this.gbc.gridy = 0;
        this.gbc.weightx = 1;
        // this.gbc.weighty = 1;
    }
    
    @Override
    public Component add(Component component) {
        this.gbc.gridy++;
        this.add(component, this.gbc);
        return component;
    }

    public void packFinalize() {
        this.pack();
        // this.setResizable(false);
        this.setVisible(true);
    }
}
