package cobast.consoleinterface.menusys.widgets;

import java.util.ArrayList;

import cobast.consoleinterface.menusys.ConsoleObject;
import cobast.consoleinterface.menusys.ElementWidget;

public class Header extends ElementWidget {

	int header_indent;
	char decor_char;

	Header(ConsoleObject parent, String prompt_str, int header_indent) {
		super(parent, prompt_str);
		this.header_indent = header_indent;
	}

	@Override
	public ArrayList<String> extractWidgetStyle() {
		ArrayList<String> output_list = new ArrayList<String>();
		
		return output_list;
	}
}