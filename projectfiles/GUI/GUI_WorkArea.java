package projectfiles.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import projectfiles.gui.styles.Colors;

public class GUI_WorkArea extends JPanel {
  
  GridBagConstraints gbc = new GridBagConstraints();

  public GUI_WorkArea() {
    super();
    setLayout(new GridBagLayout());
    setBackground(Colors.BACKGROUND_ACCENT_LIGHT);
  }
}
