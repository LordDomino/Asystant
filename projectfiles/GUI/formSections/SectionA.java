package projectfiles.gui.formSections;

import javax.swing.JSeparator;

import projectfiles.components.CRow;
import projectfiles.components.CSection;
import projectfiles.components.CSeparator;
import projectfiles.components.CTextFieldGroup;

public final class SectionA extends CSection {

    public SectionA() throws Exception {
        super("A. PERSONAL INFORMATION");
        
        CTextFieldGroup r1_g1 = new CTextFieldGroup("Name", new String[]{"Last name", "First name", "Middle initial"});
        CTextFieldGroup r1_g2 = new CTextFieldGroup(new String[]{"Level and Section"});
        CTextFieldGroup r2_g1 = new CTextFieldGroup(new String[]{"Address"});

        CRow row1 = new CRow(r1_g1, r1_g2);
        CRow row2 = new CRow(r2_g1);

        this.add(row1);
        this.add(new CSeparator(JSeparator.HORIZONTAL));
        this.add(row2);
    }
}