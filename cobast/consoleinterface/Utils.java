package cobast.consoleinterface;

public class Utils {

	static int printdebug_count = 0;

	/**
	 * Outputs a string as a customized Cobast print debug.
	 * @param str String to print
	 */
	public static void printdebug(String str) {
		System.out.println("COBAST Debug" + String.format("%03d", Utils.printdebug_count) + ": " + str);
		printdebug_count++;
	}
}
