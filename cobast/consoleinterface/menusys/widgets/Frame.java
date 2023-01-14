package cobast.consoleinterface.menusys.widgets;

import cobast.consoleinterface.menusys.ConsoleObject;

public class Frame extends ElementWidget {
	
	public Frame(ConsoleObject parent) {
		super(parent);
	}

	public Frame(ConsoleObject parent, int framelength) {
		super(parent);
		this.widget_length = framelength;
	}
}
