package cobast.consoleinterface.menusys;

import java.util.ArrayList;

import cobast.consoleinterface.Console;

public class Widget extends ConsoleObject {

	public ArrayList<Widget> children = new ArrayList<Widget>();
	public int widget_length = Console.console_length;
	public int widget_margin;
	public int widget_padding;
	public int widget_space = this.widget_length - (this.widget_padding * 2);
	public ArrayList<String> render_str_list;
	public String render_str;

	Widget() {}

	Widget(ConsoleObject parent) {
		super(parent);
		this.render_str_list = extractWidgetStyle();
	}

	public ArrayList<String> extractWidgetStyle() {
		ArrayList<String> output_list = new ArrayList<String>();

		for (Widget obj : this.children) {
			output_list.addAll(obj.extractWidgetStyle());
		}
		
		return output_list;
	}

	public String renderString() {
		return this.render_str;
	}
}
