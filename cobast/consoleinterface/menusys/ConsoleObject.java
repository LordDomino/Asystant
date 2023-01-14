package cobast.consoleinterface.menusys;

import java.util.ArrayList;
import java.util.List;

import cobast.consoleinterface.Console;
import cobast.consoleinterface.Utils;



/**
 * Base class for all console elements.
 */
public class ConsoleObject {
	
	public ConsoleObject parent = null;
	public List<ConsoleObject> children = new ArrayList<>();
	public String render_str = "";
	public int widget_length = Console._def_console_length;
	public int margin_length = 0;
	public int place_length = widget_length - margin_length;

	public ConsoleObject(ConsoleObject parent) {
		this.parent = parent;
		sendToParent();
	}

	public ConsoleObject(ConsoleObject parent, String str) {
		this.parent = parent;
		sendToParent();
	}

	public ConsoleObject(ConsoleObject parent, int widget_length) {
		this.widget_length = widget_length;
		sendToParent();
	}

	public ConsoleObject(ConsoleObject parent, String str, int widget_length) {
		this.widget_length = widget_length;
		sendToParent();
	}

	public String execute() {
		return this.render_str;
	}

	public String rendertext(String str) {
		return str;
	}

	void sendToParent() {
		if (this.parent == null) {
			Utils.printdebug("Cannot send " + this + " to a null parent!");
		} else {
			this.parent.children.add(this);
		}
	}
}