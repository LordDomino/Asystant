package cobast.consoleinterface.menusys;

import java.util.ArrayList;

import cobast.consoleinterface.Console;

public class Widget extends ConsoleObject {

	ArrayList<Widget> children;
	int widget_length = Console.console_length;
	int widget_margin;
	int widget_padding;
	int widget_space = this.widget_length - (this.widget_padding * 2);
	String prompt_str;
	ArrayList<String> render_str_list;
	String render_str;

	Widget(ConsoleObject parent) {
		super(parent);
		this.render_str_list = extractWidgetStyle();

		if (this instanceof ElementWidget) {
			this.render_str = renderString();
		}
	}

	public ArrayList<String> extractWidgetStyle() {
		ArrayList<String> output_list = new ArrayList<String>();

		for (Widget obj : this.children) {
			output_list.addAll(obj.extractWidgetStyle());
		}
		
		return output_list;
	}

	public String renderString() {
		return prompt_str;
	}
}
