package projectfiles;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class resizeTest {
    public static void main(String[] args) {
        JFrame mainframe = new JFrame();        
        mainframe.setLayout(new GridBagLayout());
        mainframe.setBackground(new Color(125, 125, 125));
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(new Color(255, 0, 0));

        JPanel subpanel1 = new JPanel();
        subpanel1.setLayout(new GridBagLayout());
        subpanel1.setBackground(new Color(0, 255, 0));

        JLabel label1 = new JLabel("Unwrapped label, long text blah blah blah blah");
        JTextArea label2 = new JTextArea("Wrapped label, long text blah blah blah blah");
        label2.setEditable(false);
        label2.setBackground(new Color(0, 0, 255));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;

        subpanel1.add(label1, gbc);
        subpanel1.add(label2, gbc);
        panel1.add(subpanel1, gbc);
        mainframe.add(panel1, gbc);

        mainframe.pack();
        mainframe.setVisible(true);
    }
}
