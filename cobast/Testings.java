package cobast;

import cobast.conint.*;
import cobast.conint.menusys.*;

public class Testings {
	public static void main(String[] args) {
		Screen screen1 = new Screen(new Console("test"), 0);
		Menu menu1 = new Menu(screen1, 0);
		Menu menu2 = new Menu(screen1, 1);
		Menu menu3 = new Menu(screen1, 3);


		System.out.println(screen1.children);
	}
}
