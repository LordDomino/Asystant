package cobast;

import cobast.Version;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        boolean console_is_mainloop = true;
        Scanner console_in = new Scanner(System.in);
        
        int userin_int;
        String userin_string;

        boolean is_submenu;

        // Menu variables
        String cprint_mainHeader = "===== CLINIC RECORDS TRACKER ===============================\n";
        String cprint_menu_MAIN = cprint_mainHeader
                                + "  Service program provided through Cobast Pre-alpha 0.1\n\n"
                                + "  MENU\n"
                                + "     1  About Cobast\n"
                                + "     2  Edit scan directory\n"
                                + "     3  Begin scan query\n"
                                + "     4  Report bugs\n\n"
                                + "     5  Exit application";
        
        int cprint_menu_MAIN_start = 1;
        int cprint_menu_MAIN_stop = 5;
    
        String cprint_submenu_about = cprint_mainHeader + "\n"
                                + "  ABOUT " + Version._name + " " + Version._version + "\n"
                                + "    The Cobast (Console-Based Records Tracker) service is\n"
                                + "    a java application authored by Loui Naquita, Lance\n"
                                + "    Resurreccion, Ryl Pangilinan, and Zeamon Cruz.\n\n"
                                + "    Version name:    " + Version._name + "\n"
                                + "    Version:         " + Version._version;

        String cprint_submenu_dir = cprint_mainHeader + "\n"
                                + "  DIRECTORY\n"
                                + "    This application uses a so-called \"scan directory\" where"
                                + "    files are detected for data operations.\n\n"
                                + "    Choose an action from below.\n";

        String cprint_integerprompt = ">> Type the digit of your choice from the menu: ";

        // Begin initial printing for menu
        while (console_is_mainloop == true) {
            clear_console();

            System.out.println(cprint_menu_MAIN);
            userin_int = promptInputInteger(cprint_integerprompt, console_in);
            
            
            if (userin_int >= cprint_menu_MAIN_start && userin_int <= cprint_menu_MAIN_stop) {
                is_submenu = true;
                switch (userin_int) {
                    case 1:
                        while (is_submenu == true) {
                            clear_console();
                            System.out.println(cprint_submenu_about);
                            userin_string = promptInputString(">> Type \"R\" to go back to main menu: ", console_in);
                            
                            if (userin_string.equals("R")) {
                                is_submenu = false;
                            }
                        }
                        break;
                    case 2:
                        clear_console();
                        System.out.println(cprint_submenu_dir);
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
            }
        }
    }

    public static void clear_console() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int promptInputInteger(String prompt_text, Scanner scanner) {
        System.out.print("\n" + prompt_text);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            scanner.nextLine();
            return -1;
        }
    }

    public static String promptInputString(String prompt_text, Scanner scanner) {
        System.out.print("\n" + prompt_text);
        return scanner.nextLine();
    }
}