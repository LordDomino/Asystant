package projectfiles.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JFrame;

import projectfiles.gui.styles.Colors;

public class Screen extends JFrame {

  private String title;
  private Image icon;

  GridBagConstraints gbc = new GridBagConstraints();

  public Screen(String title, Image icon) {
    super();
    this.title = title;
    this.icon = icon;
    this.setLayout(new GridBagLayout());
    this.setBackground(Colors.BACKGROUND_ACCENT_LIGHT);
  }

  public final void finalizeAndShow(double sizex, double sizey) {
    this.setMinimumSize(new Dimension(520, 700));
    this.setTitle(title);
    this.setIconImage(icon);
    this.setSize((int) sizex, (int) sizey);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
}
