package cobast.consoleinterface.menusys.widgets;

import cobast.consoleinterface.menusys.ConsoleObject;

public class Text extends ElementWidget {

	int margin;
	int leftmargin = margin;
	int rightmargin = margin;

	public Text(ConsoleObject parent, String text) {
		super(parent, text);
	}

	public Text(ConsoleObject parent, String text, int margin) {
		super(parent, text);
		this.margin = margin;
		this.rendertext(text);
	}

	public Text(ConsoleObject parent, String text, int leftmargin, int rightmargin) {
		super(parent, text);
		this.leftmargin = leftmargin;
		this.rightmargin = rightmargin;
		this.rendertext(text);
	}

	@Override
	public String rendertext(String str) {
		return "TEST";
	}
}
