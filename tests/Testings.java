package tests;

import cobast.consoleinterface.menusys.Screen;
import cobast.consoleinterface.menusys.widgets.Header;

public class Testings {
	public static void main(String[] args) {
		Screen main_menu = new Screen();

		Header header1 = new Header(main_menu, "asdsad", 67);
		header1.renderString();

		System.out.println(header1.render_str);
	}
}