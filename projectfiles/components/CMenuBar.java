package projectfiles.components;

import javax.swing.JMenuBar;

import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

public class CMenuBar extends JMenuBar {
  public CMenuBar() {
    super();
    this.setFont(Fonts.DEFAULT_LABEL);
    this.setBackground(Colors.WHITE);
  }
}
