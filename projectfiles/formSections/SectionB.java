package projectfiles.formSections;

import java.util.ArrayList;

import projectfiles.Util;
import projectfiles.structures.Row;
import projectfiles.structures.Section;

public class SectionB extends Section {
    public SectionB() {
        super("CONTACT PERSON IN CASE OF EMERGENCY");
        Row row1 = new Row(); row1.setShowTextfields(true);
        
        ArrayList<String> row1_part1_fields = Util.newArray(new String[]{"(Last name)", "(First name)", "(Middle initial)"});;
        ArrayList<String> row1_part2_fields = Util.newArray(new String[]{"Relationship:"});
        ArrayList<String> row1_part3_fields = Util.newArray(new String[]{"Contact no.:"});
        
        row1.createPartition(row1_part1_fields, "Name:", "Name:");
        row1.createPartition(row1_part2_fields,"");
        row1.createPartition(row1_part3_fields, "");
        row1.wrap();

        addRow(row1);
    }
}
