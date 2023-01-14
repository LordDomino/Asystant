package cobast;

import cobast.consoleinterface.*;
import cobast.consoleinterface.menusys.*;
import cobast.consoleinterface.menusys.widgets.Header;

public class Testings {
	public static void main(String[] args) {

		Console console = new Console();

		ConsoleObject screen_1 = new ConsoleObject(null);
		ConsoleObject screen_2 = new ConsoleObject(null);

		Header head = new Header(screen_1, "This is a COBAST Header", '=', 70);
		System.out.println(head.execute());
	}
}