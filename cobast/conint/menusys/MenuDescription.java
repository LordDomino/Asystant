package cobast.conint.menusys;

public class MenuDescription extends MenuObject {
	
	String text;

	public MenuDescription(Menu parent, int layer, String text) {
		super(parent, layer);
		this.text = text;

		sendToParent();
	}

	@Override
	void sendToParent() {
		this.parent.children.add(0, this);
	}
}
