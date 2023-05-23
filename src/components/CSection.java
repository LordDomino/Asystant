package projectfiles.components;

import java.awt.Component;

import projectfiles.gui.styles.Fonts;

public class CSection extends CFieldGroup {

  String label;
  CLabel labelComponent;

  public CSection(String label) {
    super();
    this.label = label;
    this.initialize();
  }

  public CSection(String label, Component ... components) throws Exception {
    super();
    this.label = label;
    this.initialize();

    for (Component component : components) {
      super.addVertical(component);
  }
  }

  private void initialize() {
    this.orientation = CFieldGroup.VERTICAL;
    this.setFollowOrientation(true);

    this.labelComponent = new CLabel(this.label);
    this.labelComponent.setFont(Fonts.DEFAULT_SECTIONLABEL);
    super.add(this.labelComponent);
  }

  @Override
  public Component add(Component component) {
    super.add(component);
    return component;
  }
}
