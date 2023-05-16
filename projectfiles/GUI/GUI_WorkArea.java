package projectfiles.gui;

import javax.swing.JSplitPane;

import projectfiles.gui.styles.Colors;

public class GUI_WorkArea extends JSplitPane {
  

  public GUI_WorkArea() {
    super();
    setBackground(Colors.BACKGROUND_ACCENT_LIGHT);
    this.setDividerSize(5);
  }
}
