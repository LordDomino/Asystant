package projectfiles.components;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JMenuItem;

import projectfiles.gui.styles.Colors;

public class CMenuItem extends JMenuItem {
  public CMenuItem(String text) {
    super(text);

    int padding = 3;

    this.setFont(new Font("Arial", Font.PLAIN, 13));
    this.setBackground(Colors.BACKGROUND_ACCENT_DARK);
    this.setForeground(Colors.TEXT_ACCENT1);
    this.setBorder(BorderFactory.createEmptyBorder(padding, padding, padding, padding));
  }
}
