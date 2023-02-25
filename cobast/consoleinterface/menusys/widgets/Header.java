package cobast.consoleinterface.menusys.widgets;

import java.util.ArrayList;

import cobast.consoleinterface.menusys.ContainerWidget;
import cobast.consoleinterface.menusys.ElementWidget;

public class Header extends ElementWidget {

	ContainerWidget parent;
	int header_indent;
	char decor_char;

	public Header(ContainerWidget parent, String prompt_str, int header_indent) {
		super(parent, prompt_str);
		this.prompt_str = prompt_str;
		this.header_indent = header_indent;
		this.render_str = renderString();

		sendToParent();
	}

	@Override
	public ArrayList<String> extractWidgetStyle() {
		ArrayList<String> output_list = new ArrayList<String>();

		output_list.add(this.renderString());
		return output_list;
	}

	@Override
	public String renderString() {
		String header = "";
		String front_indent = new String(new char[this.header_indent]).replace("\0", "=");

		header += front_indent + this.prompt_str;

		if (header.length() > this.widget_space) {
			this.render_str = header.substring(0, widget_length);
		} else {
			String back_indent = new String(new char[this.widget_space - header.length()]).replace("\0", "=");
			header += back_indent;
			this.render_str = header;
		}

		return this.render_str;
	}
}