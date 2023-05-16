package projectfiles.gui;

import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JFrame;

import projectfiles.gui.styles.Colors;

public class Screen extends JFrame {

  private String title;
  private Image icon;

  public Screen(String title, Image icon) {
    super();
    this.title = title;
    this.icon = icon;
    this.setLayout(new GridBagLayout());
    this.setBackground(Colors.BACKGROUND_ACCENT_LIGHT);
  }

  public final void finalizeAndShow(int sizex, int sizey) {
    this.setTitle(title);
    this.setIconImage(icon);
    this.setSize(sizex, sizey);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
}
