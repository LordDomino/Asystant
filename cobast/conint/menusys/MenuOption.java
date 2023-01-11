package cobast.conint.menusys;

public class MenuOption extends MenuObject {
	public String text;

	public MenuOption(Menu parent, int layer, String text) {
		super(parent, layer);
		this.parent = parent;
		this.layer = layer;
		this.text = text;

		sendToParent();
	}

	@Override
	void executefinalize() {
		System.out.println(text);
	}

	@Override
	void sendToParent() {
		this.parent.children.add(this);
	}
}
