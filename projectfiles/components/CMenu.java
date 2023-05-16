package projectfiles.components;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JMenu;

import projectfiles.gui.styles.Colors;

public class CMenu extends JMenu {
  public CMenu(String text) {
    super(text);

    int padding = 3;

    this.setFont(new Font("Arial", Font.PLAIN, 13));
    this.setBackground(Colors.BACKGROUND_ACCENT_DARK);
    this.setForeground(Colors.TEXT_ACCENT1);
    this.setOpaque(true);
    this.setBorder(BorderFactory.createEmptyBorder(padding, 7, padding, 7));
  }
}
