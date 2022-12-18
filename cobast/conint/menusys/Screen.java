package cobast.conint.menusys;

import cobast.conint.Console;

public class Screen extends ConsoleObject {

	Console parent;

	public Screen(Console console, int layer) {
		super(null, layer);
		this.parent = console;
		this.layer = layer;
		
		sendToParent();
	}

	public void sendToParent() {
		Console.children.add(this);
	}

	public void show() {
		for (ConsoleObject cobj: this.children) {
			cobj.execute();
		}
	}
}
