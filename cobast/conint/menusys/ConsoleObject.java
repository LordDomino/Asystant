package cobast.conint.menusys;

import java.util.ArrayList;
import java.util.List;
import cobast.conint.Console;

/**
 * Base class for all console elements.
 */
public class ConsoleObject {
	
	public ConsoleObject parent;
	public int layer;
	public List<ConsoleObject> children = new ArrayList<>();
	public int indent;
	public String print_str;
	int max_render_length = Console.console_length;

	public ConsoleObject(ConsoleObject parent, int layer) {
		this.parent = parent;
		this.layer = layer;
	}

	void sendToParent() {
		this.parent.children.add(this);
	}

	void execute() {
		if (children.size() == 0) {
			this.executefinalize();
		} else {
			for (ConsoleObject cobj: this.children) {
				cobj.execute();
			}
		}
	}

	void executefinalize() {}
}
