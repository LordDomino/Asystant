package cobast.conint.menusys;

public class Menu extends ConsoleObject {
	
	public Menu(ConsoleObject parent, int layer) {
		this.parent = parent;
		this.layer = layer;
		
		sendToParent();
	}
}
