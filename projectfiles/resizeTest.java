package projectfiles;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class resizeTest {
    public static void main(String[] args) {
        JFrame mainframe = new JFrame();        
        mainframe.setLayout(new GridBagLayout());
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

        JPanel subpanel1 = new JPanel();
        subpanel1.setLayout(new GridBagLayout());

        JTextArea label1 = new JTextArea("Label1");
        JTextArea label2 = new JTextArea("Label1");
        label1.setEditable(false);
        label2.setEditable(false);
        
        subpanel1.add(label1);
        subpanel1.add(label2);
        panel1.add(subpanel1);
        mainframe.add(panel1);

        mainframe.pack();
        mainframe.setVisible(true);
    }
}
