package projectfiles.components;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JFrame;

public class CFrame extends JFrame {
  
  GridBagConstraints gbc = new GridBagConstraints();
  
  public CFrame() {
    super();
    this.initialize();
  }

  public CFrame(String title) {
    super(title);
    this.initialize();
  }

  void initialize() {
    this.gbc.weightx = 1;
    this.gbc.weighty = 1;
    this.gbc.fill = GridBagConstraints.BOTH;
    this.gbc.insets = new Insets(3, 3, 3, 3);
  }
}
