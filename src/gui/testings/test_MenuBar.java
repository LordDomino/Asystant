package projectfiles.gui.testings;

import projectfiles.components.CMenu;
import projectfiles.components.CMenuBar;
import projectfiles.components.CMenuItem;

public class test_MenuBar {
  public static void main(String args[]) {
    TestFrame mainFrame = new TestFrame();

    CMenuBar menubar = new CMenuBar();
    CMenu menu1 = new CMenu("Menu 1");
    CMenuItem item1 = new CMenuItem("Text");

    menu1.add(item1);
    menubar.add(menu1);

    mainFrame.setJMenuBar(menubar);    

    mainFrame.packFinalize();
  } 
}
