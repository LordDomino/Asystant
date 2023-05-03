package projectfiles.gui;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainMenu extends JPanel {
    public MainMenu() {
        super();
        this.initialize();
    }

    public void initialize() {
        JButton button1 = new JButton("Start");
        this.add(button1);
    }
}
