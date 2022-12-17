package cobast.conint.menusys;

public class Screen extends ConsoleObject {

	public Screen(ConsoleObject console, int layer) {
		this.parent = console;
		this.layer = layer;
		
		sendToParent();
	}
}
