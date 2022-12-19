package cobast.conint.menusys;

public class Header extends ConsoleObject {

	public String text;
	public char decoration;

	public Header(ConsoleObject parent, int layer, String text, char decoration) {
		super(parent, layer);
		this.parent = parent;
		this.layer = layer;
		this.text = text;
		this.decoration = decoration;

		sendToParent();
	}
}
