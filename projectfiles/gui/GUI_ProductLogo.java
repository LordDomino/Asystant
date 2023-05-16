package projectfiles.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_ProductLogo extends JPanel {
  
  GridBagConstraints gbc = new GridBagConstraints();
  public int width;

  public GUI_ProductLogo(int width) throws Exception {
    super();
    this.width = width;
    this.setLayout(new GridBagLayout());
    this.setOpaque(false);

    // Reading the image logo using BufferedReader
    BufferedImage originalImage = ImageIO.read(new File("projectfiles/gui/graphics/productLogo_with_name.png"));
    Image image = originalImage.getScaledInstance(this.width, -1, Image.SCALE_SMOOTH);

    JLabel imageComponent = new JLabel(new ImageIcon(image));

    this.add(imageComponent);
  }
}
