/**
 * Written by Loui Dominic Naquita
 */
package projectfiles.structures;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import projectfiles.formSections.*;

public final class SectionTab extends JTabbedPane {
    
    public static void main(String args[]) {
        JFrame mainFrame = new JFrame();
        SectionTab demo = new SectionTab();
        Section secA = new SectionA();
        Section secB = new SectionB();

        demo.add(secA);
        demo.add(secB);

        demo.setTitleAt(0, "Section A");
        demo.setTitleAt(1, "Section B");

        mainFrame.add(demo);
        mainFrame.setSize(100, 100);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    public SectionTab() {
        super();
        initialize(); // this is a special method for setting attributes of this instance
    }

    public SectionTab(int tabPlacement) {
        super(tabPlacement);
        initialize(); // this is a special method for setting attributes of this instance
    }

    protected void initialize() {
        this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        // this.setLayout(new GridBagLayout());
    }
}