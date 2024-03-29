package projectfiles.gui;

import java.awt.GridBagConstraints;
import java.awt.Image;

import javax.swing.ImageIcon;

public class SWorkWindow extends Screen {

  private static final String title = "Asystant";
  private static final Image icon = new ImageIcon("projectfiles/gui/graphics/icon.png").getImage();

  public GUI_WorkArea WORKAREA;

  public static Screen self;

  public SWorkWindow() {
    super(title, icon);
    SWorkWindow.self = this;
    
    GUI_Menubar menubar = new GUI_Menubar();
    GUI_StatusBar statusBar = new GUI_StatusBar();
    
    try {
      WORKAREA = new GUI_WorkArea();
      gbc.weightx = 1;
      gbc.weighty = 1;
      gbc.gridx = 0; gbc.gridy = 0;
      gbc.fill = GridBagConstraints.BOTH;
      add(WORKAREA, gbc);

    } catch(Exception e) {
      e.printStackTrace();
    }
    
    setJMenuBar(menubar);
    
    gbc.weighty = 0;
    gbc.weightx = 1;
    gbc.gridx = 0; gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.SOUTH;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    add(statusBar, gbc);
  }
}
