package projectfiles.structures;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Row {

    JFrame mainframe;

    public Row() {
        mainframe = new JFrame();
        mainframe.setSize(300, 100);
        mainframe.setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    public void createPartition(String fields[]) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        MatteBorder separator = new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
        

        for(String field : fields) {
            JLabel fieldLabel = new JLabel(field);
            panel.add(fieldLabel);
        }

        panel.setSize(300, 100);
        panel.setBorder(separator);
        mainframe.add(panel);
    }

    public void wrap() {
        mainframe.setVisible(true);
    }
}
