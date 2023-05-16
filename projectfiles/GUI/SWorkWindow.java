package projectfiles.gui;

import java.awt.Image;

import javax.swing.ImageIcon;

public class SWorkWindow extends Screen {

  private static final String title = "Asystant";
  private static final Image icon = new ImageIcon("projectfiles/gui/graphics/icon.png").getImage();

  public SWorkWindow() {
    super(title, icon);
  }
}
