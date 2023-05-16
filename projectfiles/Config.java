package projectfiles;

public class Config {

    public static final String INFO_PRODUCT_STATUS = "Pre-alpha";
    public static final String INFO_VERSION = "0.01";
    public static final String INFO_CREDITS = "Developed by Loui Naquita, Lance Resurreccion, Ryl Pangilinan, and Zeamon Cruz";
    
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
