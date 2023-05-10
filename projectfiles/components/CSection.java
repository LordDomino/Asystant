package projectfiles.components;

import java.awt.Component;

import javax.swing.JSeparator;

import projectfiles.gui.styles.Colors;

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

    int index = 0;
    for (Component component : components) {
      super.addVertical(component);
      index++;
      if (index <= components.length - 1) {
          JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
          separator.setBackground(Colors.BLACK);
          separator.setForeground(Colors.BLACK);
          super.add(separator);
      }
  }
  }

  private void initialize() {
    this.orientation = CFieldGroup.VERTICAL;
    this.setFollowOrientation(true);

    this.labelComponent = new CLabel(this.label);
    super.add(this.labelComponent);
  }

  @Override
  public Component add(Component component) {
    JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
    separator.setBackground(Colors.BLACK);
    separator.setForeground(Colors.BLACK);
    super.add(separator);
    super.add(component);
    return component;
  }
}
