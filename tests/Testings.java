package tests;

import cobast.consoleinterface.menusys.Screen;
import cobast.consoleinterface.menusys.widgets.Header;

public class Testings {
	public static void main(String[] args) {
		Screen main_menu = new Screen();

		Header header1 = new Header(main_menu, " asdsad ", 15);
		main_menu.executeScreen();
	}
}