/**
 * Written by Loui Dominic Naquita
 */
package projectfiles.GUI;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import projectfiles.formSections.*;
import projectfiles.structures.Section;

public final class SectionTab extends JTabbedPane {
    
    public void wrap() {
        Section secA = new SectionA();
        Section secB = new SectionB();

        add(secA);
        add(secB);

        setTitleAt(0, "Section A");
        setTitleAt(1, "Section B");
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