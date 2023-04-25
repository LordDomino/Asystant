package projectfiles;

import java.util.Arrays;
import java.util.ArrayList;

public class Util {
    /**
     * Creates an ArrayList directly from String arguments.
     */
    public static ArrayList<String> newArray(String ... args) {
        return new ArrayList<String>(Arrays.asList(args));
    }
}
