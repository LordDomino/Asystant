package projectfiles;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Util {
    public static void debugRandomColor(Component c) {
        int[] color = randomColor();
        c.setBackground(new Color(color[0], color[1], color[2]));
    }
    
    public static int[] randomColor() {
        int randomR = ThreadLocalRandom.current().nextInt(0, 255);
        int randomG = ThreadLocalRandom.current().nextInt(0, 255);
        int randomB = ThreadLocalRandom.current().nextInt(0, 255);
        
        int[] rgb = new int[]{randomR, randomG, randomB};
        return rgb;
    }
    
    /**
     * Creates an ArrayList directly from String arguments.
     */
    public static ArrayList<String> newArray(String ... args) {
        return new ArrayList<String>(Arrays.asList(args));
    }

    public static void setGrid(GridBagConstraints gbc, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
    }
}
