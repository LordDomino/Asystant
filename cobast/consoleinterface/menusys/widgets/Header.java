package cobast.consoleinterface.menusys.widgets;

import java.util.ArrayList;

import cobast.consoleinterface.menusys.ContainerWidget;
import cobast.consoleinterface.menusys.ElementWidget;
import cobast.consoleinterface.menusys.Widget;

public class Header extends ElementWidget {

	ContainerWidget parent;
	int header_indent;
	char decor_char;

	public Header(ContainerWidget parent, String prompt_str, int header_indent) {
		super(parent, prompt_str);
		this.prompt_str = prompt_str;
		this.header_indent = header_indent;
	}

	@Override
	public ArrayList<String> extractWidgetStyle() {
		ArrayList<String> output_list = new ArrayList<String>();

		if (this.parent instanceof Widget) {
			String str = new String(new char[this.parent.widget_space]).replace("\0", "=");
		}
		return output_list;
	}
}