package cobast;

import java.io.File;
import java.io.IOException;
import java.awt.Desktop;
import java.util.Scanner;

import static cobast.console.Console.*;
import cobast.config.Directory;
import cobast.console.Console;

public class Main {

    public static boolean console_is_mainloop = true;
    /** Reload boolean to allow the loop to be reloaded */
    public static boolean console_is_reload = true;
    public static boolean userin_is_invalid = false;

    /** Default console scanner */
    public static final Scanner console_in = new Scanner(System.in);
    public static void main(String[] args) {
       
        int userin_int;
        String userin_string;

        boolean is_submenu;
        
        Console.setConsoleLength(60);
        Console.setHeader('=', " CLINIC RECORDS MANAGER ", 5);
        Console.startloop();

        while (Console.mainloop == true) {

            // update the values
            update();

            // Menu variables
            String cprint_mainHeader = Console.getHeader() + "\n";
            String cprint_menu_MAIN = cprint_mainHeader
                                    + "  Service program provided through Cobast Pre-alpha 0.1\n\n"
                                    + "  MAIN MENU\n"
                                    + "     1  About Cobast\n"
                                    + "     2  Edit scan directory\n"
                                    + "     3  Begin scan query\n"
                                    + "     4  Report bugs\n\n"
                                    + "     5  Exit application";
                    
            String CPRINT_SUBMENU_ABOUT = cprint_mainHeader + "\n"
                                    + "  ABOUT " + Version._name + " " + Version._version + "\n"
                                    + "    The Cobast (Console-Based Records Tracker) service is\n"
                                    + "    a java application authored by Loui Naquita, Lance\n"
                                    + "    Resurreccion, Ryl Pangilinan, and Zeamon Cruz.\n\n"
                                    + "    Version name:    " + Version._name + "\n"
                                    + "    Version:         " + Version._version + "\n\n"
                                    + "     R  Return to main menu";

            String CPRINT_SUBMENU_DIR = cprint_mainHeader + "\n"
                                    + "  SCAN DIRECTORY\n"
                                    + "    This application uses a so-called \"scan directory\"\n"
                                    + "    where files are detected for data operations.\n\n"
                                    + "    Current scan directory:\n"
                                    + "    " + Directory.getScanDirectoryPath() + "\n\n"
                                    + "    Choose an action from below.\n\n"
                                    + "     R  Return to main menu\n\n"
                                    + "     1  Open scan directory in Explorer\n"
                                    + "     2  Change scan directory";

            String CPRINT_SUBMENU_DIR_FRESHDIR = cprint_mainHeader + "\n"
                                    + "  DIRECTORY: Initialization\n\n"
                                    + "    This application uses a so-called \"scan directory\"\n"
                                    + "    where files are detected for data operations.\n\n"
                         + ANSI_RED + "    It looks like your scan directory path is empty.\n\n" + ANSI_RESET
                                    + "    You should only see this section once to initialize\n"
                                    + "    your scan folder directory.";
            String CPRINT_SUBMENU_DIR_NEWDIR = cprint_mainHeader + "\n"
                                    + "  DIRECTORY\n\n"
                                    + "    This application uses a so-called \"scan directory\"\n"
                                    + "    where files are detected for data operations.\n\n"
                                    + "    Change scan directory?";

            String CPRINT_INTEGERPROMPT = ">> Type the digit of your choice from the menu: ";

            // Begin initial printing for menu
            while (Console.mainhold == true) {
                clear_console();

                System.out.println(cprint_menu_MAIN);
                userin_int = promptInputInteger(CPRINT_INTEGERPROMPT, console_in);
                
                if (userin_int >= 1 && userin_int <= 5) {

                    // Enable submenu
                    is_submenu = true;

                    switch (userin_int) {
                        case 1:
                            while (is_submenu == true) {
                                clear_console();
                                System.out.println(CPRINT_SUBMENU_ABOUT);
                                userin_string = promptInputString(">> Type \"R\" to go back to main menu: ", console_in, "");
                                
                                if (userin_string.equals("R")) {
                                    is_submenu = false;
                                }
                            }
                            break;
                        case 2:
                            while (is_submenu == true && Console.mainhold == true) {
                                clear_console();
                                
                                if (Directory.isScanDirectoryEmpty()) {
                                    do {
                                        clear_console();
                                        System.out.println(CPRINT_SUBMENU_DIR_FRESHDIR);
                                        
                                        userin_string = promptInputString("Enter the new scan folder directory. Type \"default\"\n"
                                                                        + "to use the default scan directory.\n"
                                                                        , console_in, "Directory does not exist!");

                                        if (userin_string == "") {
                                            continue;
                                        } else if (userin_string.equals("default")) {
                                            Directory.setToDefaultPath();
                                            collapse();
                                            continue;
                                        } else {
                                            if (new File(userin_string).exists()) {
                                                Directory.changePath(userin_string);
                                                collapse();
                                            } else {
                                                invalidate();
                                                continue;
                                            }
                                        }

                                    } while (Directory.isScanDirectoryEmpty());
                                } else {    
                                    clear_console();
                                    System.out.println(CPRINT_SUBMENU_DIR);
                                    userin_string = promptInputString(CPRINT_INTEGERPROMPT, console_in, "");
                                    
                                    switch (userin_string) {
                                        case "R":
                                                is_submenu = false;
                                                break;
                                        case "1":
                                                try {
                                                    Desktop.getDesktop().open(new File(Directory.directory));
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }
                                                break;
                                        case "2":
                                            do {
                                                clear_console();
                                                System.out.println(CPRINT_SUBMENU_DIR_NEWDIR);
                                            
                                                userin_string = promptInputString("Enter the new scan folder directory. Type \"default\"\n"
                                                                                + "to use the default scan directory.\n"
                                                                                , console_in, "Directory does not exist!");
                                                if (userin_string == "") {
                                                    continue;
                                                } else if (userin_string.equals("default")) {
                                                    Directory.setToDefaultPath();
                                                    collapse();
                                                    continue;
                                                } else {
                                                    if (new File(userin_string).exists()) {
                                                        Directory.changePath(userin_string);
                                                        collapse();
                                                        reassure();
                                                    } else {
                                                        invalidate();
                                                        continue;
                                                    }
                                                } 
                                            } while (Console.invalid == true);
                                            break;        
                                        }
                                   
                                }
                            }
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            exit(); // do exit() first; program leaves "watermarks" of console
                            clear_console(); // do clear_console() to clear the leftover watermarks
                            break;
                    }
                }
            }
        }
    }

    public static void exit() {
        Main.console_is_mainloop = false;
        Main.console_is_reload = false;
        System.out.println("Exited");
    }

    public static void clear_console() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int promptInputInteger(String prompt_text, Scanner scanner) {
        System.out.print("\n" + ANSI_YELLOW + prompt_text + ANSI_RESET + ANSI_BOLD);
        if (scanner.hasNextInt()) {
            int _userin_int = scanner.nextInt();
            System.out.println(ANSI_RESET);
            return _userin_int;
        } else {
            scanner.nextLine();
            System.out.println(ANSI_RESET);
            return -1;
        }
    }

    public static String promptInputString(String prompt_text, Scanner scanner, String error_text) {
        System.out.print("\n" + ANSI_YELLOW + prompt_text + ANSI_RESET);
        if (userin_is_invalid == true){
            System.out.println(ANSI_RED + "!! BAD INPUT: " + error_text + ANSI_RESET);
        }
        System.out.print(ANSI_YELLOW + ">> " + ANSI_BOLD);
        String _userin_str = scanner.nextLine();
        System.out.print(ANSI_RESET);
        return _userin_str;
    }
}