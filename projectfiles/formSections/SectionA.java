package projectfiles.formSections;

import java.util.ArrayList;

import projectfiles.Util;
import projectfiles.structures.Row;
import projectfiles.structures.Section;

/**
 * Written by Loui Dominic Naquita
 */
public final class SectionA extends Section {

    public SectionA() {
        super("PERSONAL INFORMATION");
        Row row1 = new Row();
        Row row2 = new Row();
        Row row3 = new Row();
        Row row4 = new Row();
        Row row5 = new Row();

        ArrayList<String> row1_part1_fields = Util.newArray("(Last name)", "(First name)", "(Middle initial)");
        ArrayList<String> row1_part2_fields = Util.newArray("Level/Section");
        ArrayList<String> row2_part1_fields = Util.newArray("Address");
        ArrayList<String> row3_part1_fields = Util.newArray("(Mobile / Landline number)");
        ArrayList<String> row3_part2_fields = Util.newArray("Date of birth:");
        ArrayList<String> row3_part3_fields = Util.newArray("Age");
        ArrayList<String> row3_part4_fields = Util.newArray("Height (in ft.)");
        ArrayList<String> row3_part5_fields = Util.newArray("Weight (in kg.)");
        ArrayList<String> row4_part1_fields = Util.newArray("Name of Mother", "Occupation", "Contact number:", "Email");
        ArrayList<String> row5_part1_fields = Util.newArray("Name of Father", "Occupation", "Contact number:", "Email");
        
        row1.createPartition(row1_part1_fields, "Name:");
        row1.createPartition(row1_part2_fields);
        row2.createPartition(row2_part1_fields);
        row3.createPartition(row3_part1_fields, "Contact numbers:");
        row3.createPartition(row3_part2_fields);
        row3.createPartition(row3_part3_fields);
        row3.createPartition(row3_part4_fields);
        row3.createPartition(row3_part5_fields);
        row4.createPartition(row4_part1_fields);
        row5.createPartition(row5_part1_fields);

        row1.wrap();
        row2.wrap();
        row3.wrap();
        row4.wrap();
        row5.wrap();

        addRow(row1);
        addRow(row2);
        addRow(row3);
        addRow(row4);
        addRow(row5);
    }
}
