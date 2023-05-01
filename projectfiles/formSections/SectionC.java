package projectfiles.formSections;

import projectfiles.structures.Row;
import projectfiles.structures.Section;

public class SectionC extends Section {
    public SectionC() {
        super("C. HEALTH AND SAFETY CONDITIONS");
        Row row1 = new Row();
        Row row2 = new Row();

        row1.createBinaryChoiceField("Yes", "No", "Is your child subject to seizures, fainting, epilepsy, bleeding, asthma or any other condition that may affect his or her safety?");
        row2.createFieldGroup("If \"Yes\", please specify details", new String[]{"Name of drug/medication use"});

        this.add(row1);
        this.add(row2);
    }
}
