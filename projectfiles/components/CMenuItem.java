package projectfiles.components;

import javax.swing.JMenuItem;

import projectfiles.gui.styles.Fonts;

public class CMenuItem extends JMenuItem {
  public CMenuItem(String text) {
    super(text);
    this.setFont(Fonts.DEFAULT_LABEL);
  }
}
