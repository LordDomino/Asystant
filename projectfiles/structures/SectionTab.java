/**
 * Written by Loui Dominic Naquita
 */
package projectfiles.structures;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public final class SectionTab extends JTabbedPane {
    
    public static void main(String args[]) {
        JFrame mainFrame = new JFrame();
        SectionTab demo = new SectionTab();
        JTextArea label = new JTextArea("Hello world!");
        JTextArea label2 = new JTextArea("Hello world 2!");
        JTextArea label3 = new JTextArea("Hello world 3!");

        demo.add(label);
        demo.add(label2);
        demo.add(label3);
        demo.setTitleAt(0, "Tab 1");
        mainFrame.add(demo);
        mainFrame.setSize(100, 100);
        mainFrame.setVisible(true);
    }

    public SectionTab() {
        super();
        initialize(); // this is a special method for setting attributes of this instance
    }

    public SectionTab (int tabPlacement) {
        super(tabPlacement);
        initialize(); // this is a special method for setting attributes of this instance
    }

    protected void initialize() {
        this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
}