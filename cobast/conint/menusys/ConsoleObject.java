package cobast.conint.menusys;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for all console elements.
 */
public class ConsoleObject {
	public ConsoleObject parent;
	public int layer;
	public List<ConsoleObject> children = new ArrayList<>();

	public ConsoleObject(ConsoleObject parent, int layer) {
		this.parent = parent;
		this.layer = layer;
	}

	public void sendToParent() {
		this.parent.children.add(this);
	}
}
