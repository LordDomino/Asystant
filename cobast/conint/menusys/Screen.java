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
		this.parent.children.add(this);
	}
}
