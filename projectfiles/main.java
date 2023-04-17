package projectfiles;

import projectfiles.structures.Row;

public class Main {
    public static void main(String args[]) {
        Row testRow = new Row();
        String[] fields1 = {"(Last name)", "(First name)", "(Middle initial)"};
        testRow.createPartition(fields1, "Name: ");
        String[] fields2 = {"Level and Section"};
        testRow.createPartition(fields2, "");
        testRow.wrap();
    }
}
