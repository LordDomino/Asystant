package projectfiles;

import java.util.Arrays;
import java.util.ArrayList;

public class Utils {
    /**
     * Creates an ArrayList directly from a String[] array object.
     */
    public static ArrayList<String> newArray(String[] array) {
        return new ArrayList<String>(Arrays.asList(array));
    }
}
