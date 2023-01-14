package cobast.consoleinterface.menusys.widgets;

import cobast.consoleinterface.menusys.ConsoleObject;

public class Header extends ElementWidget{

	char decor_char = '=';
	int widget_length = this.parent.place_length;
	int indent_length = 5;

	public Header(ConsoleObject parent, String text, char decor_char) {
		super(parent, text);
		this.decor_char = decor_char;
	}

	public Header(ConsoleObject parent, String text, char decor_char, int length) {
		super(parent, text);
		this.decor_char = decor_char;
		this.widget_length = length;
	}

	public Header(ConsoleObject parent, String text, char decor_char, int length, int indent) {
		super(parent, text);
		this.decor_char = decor_char;
		this.widget_length = length;
		this.indent_length = indent;
	}

	@Override
	public String rendertext(String str) {
		int strlen = str.length();
		String header = new String(new char[this.widget_length]).replace("\0", Character.toString(this.decor_char));
		System.out.print(header);
		
		return "Abx";
	}
}
