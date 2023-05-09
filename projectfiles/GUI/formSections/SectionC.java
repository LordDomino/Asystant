package projectfiles.gui.formSections;

import projectfiles.components.BinaryChoiceField;
import projectfiles.components.FieldGroup;
import projectfiles.components.HeaderRow;
import projectfiles.components.CRow;
import projectfiles.components.Section;

public class SectionC extends Section {
    public SectionC() {
        super("C. HEALTH AND SAFETY CONDITIONS");
        CRow row1 = new CRow();
        CRow row2 = new CRow();
        CRow row3 = new HeaderRow("Is your child allergic to the following? If yes, please specify details.");

        FieldGroup fg = new FieldGroup();
        FieldGroup fg2 = new FieldGroup("If \"Yes\", please specify details", new String[]{"Name of drug/medication used"});
        BinaryChoiceField bcf = new BinaryChoiceField("Yes", "No", "Is your child subject to seizures, fainting, epilepsy, bleeding, asthma or any other condition that may affect his or her safety?");

        fg.add(bcf);

        // row1.createBinaryChoiceField("Yes", "No", "Is your child subject to seizures, fainting, epilepsy, bleeding, asthma or any other condition that may affect his or her safety?");
        row2.add(fg);
        row2.add(fg2);

        this.add(row1);
        this.add(row2);
        this.add(row3);
    }
}
