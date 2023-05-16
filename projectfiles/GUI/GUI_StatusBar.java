package projectfiles.gui;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import projectfiles.Config;
import projectfiles.gui.styles.Colors;

public class GUI_StatusBar extends JLabel {
  public GUI_StatusBar() {
    super("Records Asystant " + Config.INFO_PRODUCT_STATUS + " v" + Config.INFO_VERSION);
    
    int padding = 5;

    setFont(new Font("Arial", Font.PLAIN, 12));
    setOpaque(true);
    setBackground(Colors.STATUSBAR);
    setForeground(Colors.STATUSBAR_TEXT);
    setBorder(BorderFactory.createEmptyBorder(padding, padding, padding, padding));    
  }
}
