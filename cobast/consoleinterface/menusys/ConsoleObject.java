package cobast.consoleinterface.menusys;

import java.util.ArrayList;

public class ConsoleObject {
	
	public ConsoleObject parent;
	public ArrayList<ConsoleObject> children = new ArrayList<ConsoleObject>();

	ConsoleObject() {}

	ConsoleObject(ConsoleObject parent) {
		this.parent = parent;
		sendToParent();
	}

	public void sendToParent() {
		if (this.parent != null) {
			this.parent.children.add(this);
		}
	}
}