package projectfiles.formSections;

import java.util.ArrayList;

import projectfiles.Util;
import projectfiles.structures.Row;
import projectfiles.structures.Section;

public class SectionC extends Section {
    public SectionC() {
        super("HEALTH AND SAFETY CONDITIONS");
        Row row1 = new Row(); row1.setShowTextfields(true);

        ArrayList<String> row1_fields1 = Util.newArray(new String[]{"YES / NO"});
        
        String row1_label = "Is your child subject to seizures, fainting, epilepsy, bleeding, asthma or any other condition that may affect his or her safety?";

        row1.createPartition(row1_fields1, row1_label);
        row1.wrap();

        addRow(row1);
    }
}
