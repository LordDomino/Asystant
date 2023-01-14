package cobast.consoleinterface.menusys.widgets;

import cobast.consoleinterface.menusys.ConsoleObject;

public class Header extends ElementWidget{

	public char decor_char = '=';
	public int widget_length = this.parent.place_length;
	public int indent_length = 5;

	public Header(ConsoleObject parent, String text, char decor_char) {
		super(parent, text);
		this.decor_char = decor_char;
		this.render_str = rendertext(text);
	}

	public Header(ConsoleObject parent, String text, char decor_char, int length) {
		super(parent, text);
		this.decor_char = decor_char;
		this.widget_length = length;
		this.render_str = rendertext(text);
	}

	public Header(ConsoleObject parent, String text, char decor_char, int length, int indent) {
		super(parent, text);
		this.decor_char = decor_char;
		this.widget_length = length;
		this.indent_length = indent;
		this.render_str = rendertext(text);
	}

	@Override
	public String rendertext(String str) {
		int strlen = str.length();
		String header = new String(new char[this.widget_length]).replace("\0", Character.toString(this.decor_char));
		
		this.render_str = header.substring(0, this.indent_length);
		this.render_str += str;
		
		if ((this.indent_length + strlen) < this.widget_length) {
			this.render_str += header.substring(this.indent_length + strlen);
			return this.render_str;
		} else {
			return this.render_str;
		}
	}
}
