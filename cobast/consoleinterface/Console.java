package cobast.consoleinterface;

/**
 * Console class for instantiating an entire console object.
 * 
 * A console object handles all console interface (conint) operations.
 */
public class Console {
	/* All private, usually finals, variables below. These are the base defaults
	 * that are internally hard-coded in the program. Hence, these variables are
	 * specified as "private" variables.
	*/

	/** Default console length; is static and immutable */
	public static final int _def_console_length = 75;

	/** Default header length, which is the same length as the default console length */
	public static final String _def_header = new String(new char[_def_console_length]).replace("\0", "=");

	/* All public, mutable variables below */

	public static int console_length = _def_console_length;
	public static String header = _def_header;

	/** Boolean that determines running state of the program. */
	public static boolean mainloop = false;

	/** Boolean that prevents screen state from reloading. Use this for screens
	 * that require reloading and screen updates.
	*/
	public static boolean mainhold = true;
	
	/** Boolean that indicates invalidity in program. This can be used as a flag
	 * to trigger warnings and errors.
	*/
	public static boolean invalid = false;

	/** Set the console length.
	 * @param length The length of the console interface; default length is 50
	 */
	public static void setConsoleLength(int length) {
		console_length = length;
	}

	/** Creates a string of header.
	 * @param decor The decoration character to be used as the header border
	 * @param text Title text of the header
	 * @param text_indent Amount of characters to indent the text. Use 0 for
	 * no idention
	*/
	public static void setHeader(char decor, String text, int text_indent) {
		// create string of decor chars with length based on console length
		String temp_header = new String(new char[console_length]).replace("\0", String.valueOf(decor));

		// checks if text indention is beyond the length of header
		if (text_indent >= temp_header.length()) {
			text_indent = temp_header.length() - 1;
		}

		if (text.length() >= temp_header.length()) {
			header = text;
		} else {
			header = temp_header.substring(0, text_indent)
						+ text
						+ temp_header.substring(text_indent + text.length() - 1);
		}
	}

	/** @return Returns console length. If no console length is set using the
	 * {@code setConsoleLength()}, the default console length is 50.
	 */
	public static int getConsoleLength() {
		return console_length;
	}

	/** @return Returns header string. If no header string is set using the
	 * {@code setHeader()}, the default header string is a string of fifty '='.
	 */
	public static String getHeader() {
		return header;
	}

	/** Clears the console screen. */
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	/** Starts the mainloop of the console. Synonymous to "running" the program. */
	public static void startloop() {
		mainloop = true;
	}

	public static void stoploop() {
		mainloop = false;
	}

	/** Updates console state to defaults. Works with {@code collapse()} when
	 * attempting to reload the program.
	 */
	public static void update() {
		mainhold = true;
		invalid = false;
	}

	/** Collapses loop to allow reloading. */
	public static void collapse() {
		mainhold = false;
	}

	public static void reassure() {
		invalid = false;
	}

	/** Flags boolean {@code invalid} as true, allowing error triggers and
	 * warning flags.
	*/
	public static void invalidate() {
		invalid = true;
	}
}