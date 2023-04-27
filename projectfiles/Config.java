package projectfiles;

import java.awt.Font;

public class Config {
    public static Font defaultFont = new Font("Arial", 0, 18);
    private static boolean debug = false;

    /**
     * @return {@code}true{@code} if debug is on, otherwise returns
     * {@code}false{@code}.
     */
    public static boolean isDebugOn() {
        return Config.debug;
    }

    /**
     * Sets the boolean flag {@code}debug{@code} to whether or not to show debug
     * information.
     * @param b is the boolean to whether or not to show debug information.
     */
    public static void setDebug(boolean b) {
        Config.debug = b;
    }
}
