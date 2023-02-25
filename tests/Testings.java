package tests;

import cobast.consoleinterface.menusys.ContainerWidget;
import cobast.consoleinterface.menusys.Screen;
import cobast.consoleinterface.menusys.widgets.Header;

public class Testings {
	public static void main(String[] args) {
		Screen main_menu = new Screen();

		ContainerWidget test = new ContainerWidget(main_menu);

		Header header1 = new Header(test, " asdsad ", 15);

		test.extractWidgetStyle();
	}
}