package projectfiles.components;

import javax.swing.JSeparator;

import projectfiles.gui.styles.Colors;

public class CSeparator extends JSeparator {
  public CSeparator(int orientation) {
    super(orientation);
    this.setBackground(Colors.BLACK);
    this.setForeground(Colors.BLACK);
  }
}
