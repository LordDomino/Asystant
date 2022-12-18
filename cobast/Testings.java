package cobast;

import cobast.conint.*;
import cobast.conint.menusys.*;

public class Testings {
	public static void main(String[] args) {

		Console console = new Console();

		Screen screen1 = new Screen(console, 0);
		Menu menu1 = new Menu(screen1, 0, "Blah");
		Menu menu2 = new Menu(screen1, 1, "BLAH");
		Menu menu3 = new Menu(screen1, 3, "TITLE");

		MenuOption menuopt1 = new MenuOption(menu3, 0, "456");

		System.out.println(screen1.children);
		System.out.println(menu3.children);

		console.run();
	}
}
