/**
 * Written by Loui Dominic Naquita
 */
package projectfiles.gui;

import javax.swing.JTabbedPane;

import projectfiles.formSections.*;
import projectfiles.structures.Section;

public final class SectionTab extends JTabbedPane {

    public void wrap() {
        Section secA = new SectionA();
        Section secB = new SectionB();
        Section secC = new SectionC();
        
        add(secA);
        add(secB);
        add(secC);

        setTitleAt(0, "Section A");
        setTitleAt(1, "Section B");
        setTitleAt(2, "Section C");
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