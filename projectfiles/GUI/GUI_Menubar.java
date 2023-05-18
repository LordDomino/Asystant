package projectfiles.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projectfiles.components.CMenu;
import projectfiles.components.CMenuBar;
import projectfiles.components.CMenuItem;
import projectfiles.gui.styles.Colors;

public class GUI_Menubar extends CMenuBar {
  public GUI_Menubar() {
    super();
    this.setBackground(Colors.BACKGROUND_ACCENT_DARK);
    this.setForeground(Colors.TEXT_ACCENT1);

    CMenu menu1 = new CMenu("File");
    CMenu menu2 = new CMenu("Edit");
    CMenu menu3 = new CMenu("Record tools");
    CMenu menu4 = new CMenu("Database tools");
    CMenu menu5 = new CMenu("About");

    CMenuItem menu1_item1 = new CMenuItem("New record...");
    CMenuItem menu1_item2 = new CMenuItem("Edit record...");
    CMenuItem menu1_item3 = new CMenuItem("Logout");
    CMenuItem menu2_item1 = new CMenuItem("Logout");
    CMenuItem menu2_item2 = new CMenuItem("Logout");
    CMenuItem menu2_item3 = new CMenuItem("Logout");
    CMenuItem menu2_item3 = new CMenuItem("Logout");
    CMenuItem menu2_item3 = new CMenuItem("Logout");
    CMenuItem menu2_item3 = new CMenuItem("Logout");
    CMenuItem menu2_item3 = new CMenuItem("Logout");

    menu1_item3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        try {
          Screen newWindow = new SLogin();
          newWindow.finalizeAndShow(960, 720);
          SWorkWindow.self.dispose();
        } catch(Exception e) {}
      }
    });


    add(menu1);
    add(menu2);
    add(menu3);
    add(menu4);
    add(menu5);
    menu1.add(menu1_item1);
    menu1.add(menu1_item2);
    menu1.add(menu1_item3);
  }
}
