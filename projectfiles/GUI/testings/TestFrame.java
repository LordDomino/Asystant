package projectfiles.gui.testings;

import javax.swing.JFrame;

public class TestFrame extends JFrame {
    public TestFrame() {
        super("TEST WINDOW for Cobast GUI Development");
    }

    public void packFinalize() {
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }
}
