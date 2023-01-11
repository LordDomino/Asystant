package cobast.conint.menusys;

public class MenuObject extends ConsoleObject {
	public MenuObject(ConsoleObject parent, int layer) {
		super(parent, layer);

		parent.verifyChildren(this);
		sendToParent();
	}
}
