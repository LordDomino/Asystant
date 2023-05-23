package projectfiles.gui.testings;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class TestPanel extends JPanel {
  GridBagConstraints gbc = new GridBagConstraints();

  public TestPanel() {
    super();
    this.setLayout(new GridBagLayout());
    this.gbc.fill = GridBagConstraints.BOTH;
    this.gbc.gridx = 0;
    this.gbc.gridy = 0;
    this.gbc.weightx = 1;
    this.gbc.insets = new Insets(10, 10, 10, 10);
  }
  
  @Override
  public Component add(Component component) {
      this.gbc.gridy++;
      this.add(component, this.gbc);
      return component;
  }
}
