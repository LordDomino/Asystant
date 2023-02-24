package cobast.consoleinterface.menusys;

import java.util.ArrayList;

public class Screen extends ContainerWidget {

	public static ArrayList<Screen> screen_list = new ArrayList<Screen>();

	public Screen() {
		super();
		screen_list.add(this);
	}
}
