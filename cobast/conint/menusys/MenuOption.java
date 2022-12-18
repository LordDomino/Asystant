package cobast.conint.menusys;

public class MenuOption extends ConsoleObject {
	public String text;

	public MenuOption(ConsoleObject parent, int layer, String text) {
		super(parent, layer);
		this.parent = parent;
		this.layer = layer;
		this.text = text;

		sendToParent();
	}

	void executefinalize() {
		System.out.println(text);
	}
}
