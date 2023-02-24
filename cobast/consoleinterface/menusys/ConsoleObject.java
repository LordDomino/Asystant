package cobast.consoleinterface.menusys;

import java.util.ArrayList;

import cobast.consoleinterface.Utils;



/**
 * Base class for all console elements.
 */
public class ConsoleObject {
	
	public ConsoleObject parent;
	public ArrayList<ConsoleObject> children = new ArrayList<ConsoleObject>();

	ConsoleObject() {}

	ConsoleObject(ConsoleObject parent) {
		this.parent = parent;
		sendToParent();
	}

	void sendToParent() {
		if (this.parent == null) {
			Utils.printdebug("Cannot send " + this + " to a null parent!");
		} else {
			this.parent.children.add(this);
		}
	}
}