package cobast.conint.menusys;

public class Menu extends ConsoleObject {
	
	public String title;

	public Menu(ConsoleObject parent, int layer, String title) {
		super(parent, layer);
		this.parent = parent;
		this.layer = layer;
		this.title = title;

		sendToParent();
	}
}
