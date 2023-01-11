package cobast.consoleinterface.menusys;

public class MenuExit extends MenuObject {
	public MenuExit(Menu parent, int layer) {
		super(parent, layer);

		sendToParent();
	}

	@Override
	void sendToParent() {
		this.parent.children.add(-1, this);
	}
}
