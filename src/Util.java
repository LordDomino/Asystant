package projectfiles;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * {@code}Util{@code} contains utility and helper methods for Cobast.
 * 
 * @author Loui Dominic Naquita
 */
public class Util {

    /**
     * Sets a random background color for the specified component and returns
     * the background color used.
     * 
     * @param c - the component to be set with a random background color
     */
    public static Color debugRandomColor(Component c) {
        int[] color = randomColor();
        Color componentColor = new Color(color[0], color[1], color[2]);
        c.setBackground(componentColor);
        return componentColor;
    }
    
    /**
     * Returns an {@code}ArrayList{@code} constructed from the array of given
     * String arguments.
     */
    public static ArrayList<String> newArray(String ... args) {
        return new ArrayList<String>(Arrays.asList(args));
    }

    /**
     * Returns an integer array containing three random values from a range of
     * 0 to 255 representing red, green, and blue values.
     */
    public static int[] randomColor() {
        int randomR = ThreadLocalRandom.current().nextInt(0, 255);
        int randomG = ThreadLocalRandom.current().nextInt(0, 255);
        int randomB = ThreadLocalRandom.current().nextInt(0, 255);
        int[] rgb = new int[]{randomR, randomG, randomB};
        return rgb;
    }

    /**
     * Sets the {@code}gridx{@code} and {@code}gridy{@code} of the specified
     * {@code}GridBagConstraints{@code} object given the specified x and y
     * integer values.
     * 
     * @param gbc - the {@code}GridBagConstraints{@code} object to be set with
     * the new {@code}gridx{@code} and {@code}gridy{@code} values
     * @param x - the horizontal position of the constraint across a row
     * @param y - the vertical position of the constraint across a column
     */
    public static void setGrid(GridBagConstraints gbc, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
    }
}
