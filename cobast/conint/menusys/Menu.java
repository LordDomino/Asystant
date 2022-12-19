package cobast.conint.menusys;

import java.util.List;
import java.util.ArrayList;

public class Menu extends ConsoleObject {
	
	public static final char def_header_decor = '-';
	public static final int indent = 2;
	public static final int flush = 3;
	public List<MenuObject> children = new ArrayList<MenuObject>();
	public String title;

	public Menu(ConsoleObject parent, int layer, String title) {
		super(parent, layer);
		this.parent = parent;
		this.layer = layer;
		this.title = title;

		this.setHeader();

		sendToParent();
	}

	void execute() {
		// Menu title is executed first before its children options
		executefinalize();

		for (MenuObject obj: this.children) {
			obj.execute();
		}
	}

	void executefinalize() {
		System.out.println(print_str);
	}

	public void setHeader() {
		// create string of decor chars with length based on console length
		String temp_header = new String(new char[this.max_render_length]).replace("\0", String.valueOf(def_header_decor));

		if (this.title.length() >= temp_header.length()) {
			print_str = "\n" + this.title;
		} else {
			print_str = "\n"
						+ temp_header.substring(0, flush)
						+ " " + this.title.toUpperCase() + " "
						+ temp_header.substring(flush + this.title.length() + 3);
		}
	}
}
