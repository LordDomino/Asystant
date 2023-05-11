package projectfiles.components;

import javax.swing.JMenu;

import projectfiles.gui.styles.Fonts;

public class CMenu extends JMenu {
  public CMenu(String text) {
    super(text);
    this.setFont(Fonts.DEFAULT_LABEL);
  }
}
