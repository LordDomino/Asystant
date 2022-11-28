package cobast;

/**
 * Module to configure Java methods and functions and rephrase them to shorter
 * syntaxes.
 * 
 * Example:
 *  In Python 3, printing is done by stating
 *      print("fee")
 * 
 *  By implementing this less-worded functionality into Java, the Utils module
 *  simply parses the same arguments and passes them into methods with
 *  simplified names.
 */
public class Utils {
    public static void print(Object obj) {
        System.out.print(obj);
    }

    public static void println(Object obj) {
        System.out.println(obj);
    }

    public static void printf(Object obj) {
        
    }
}
