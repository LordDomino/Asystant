package cobast.consoleinterface.menusys;

public class ElementWidget extends Widget {

	public String prompt_str;

	public ElementWidget() {}

	public ElementWidget(ContainerWidget parent, String prompt_str) {
		super(parent);
		this.prompt_str = prompt_str;
	}
}
