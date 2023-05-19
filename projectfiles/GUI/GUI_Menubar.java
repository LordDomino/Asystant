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

    // File
    CMenuItem menu1_item1 = new CMenuItem("New record...");
    CMenuItem menu1_item2 = new CMenuItem("Edit record...");
    CMenuItem menu1_item3 = new CMenuItem("Logout");

    // Edit
    CMenuItem menu2_item1 = new CMenuItem("Preferences");
  
    // Record tools
    CMenu menu3_sm1 = new CMenu("Go to section...");
      // Go to section...
      CMenuItem menu3_sm1_item1 = new CMenuItem("Section A");
      CMenuItem menu3_sm1_item2 = new CMenuItem("Section B");
      CMenuItem menu3_sm1_item3 = new CMenuItem("Section C");
      CMenuItem menu3_sm1_item4 = new CMenuItem("Section D");
      CMenuItem menu3_sm1_item5 = new CMenuItem("Section E");
      CMenuItem menu3_sm1_item6 = new CMenuItem("Section F");
      CMenuItem menu3_sm1_item7 = new CMenuItem("Section G");
    CMenuItem menu3_item2 = new CMenuItem("Edit properties");

    // Database tools
    CMenuItem menu4_item1 = new CMenuItem("Batch edit");
    CMenuItem menu4_item2 = new CMenuItem("Manage record groups");
    CMenuItem menu4_item3 = new CMenuItem("Go to records list");

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

    menu2.add(menu2_item1);

    menu3.add(menu3_sm1);
      menu3_sm1.add(menu3_sm1_item1);
      menu3_sm1.add(menu3_sm1_item2);
      menu3_sm1.add(menu3_sm1_item3);
      menu3_sm1.add(menu3_sm1_item4);
      menu3_sm1.add(menu3_sm1_item5);
      menu3_sm1.add(menu3_sm1_item6);
      menu3_sm1.add(menu3_sm1_item7);
    menu3.add(menu3_item2);

    menu4.add(menu4_item1);
    menu4.add(menu4_item2);
    menu4.add(menu4_item3);
  }
}
