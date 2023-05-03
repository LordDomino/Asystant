package projectfiles.gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {
    
    public MenuBar() {
        super();
        this.initialize();
    }

    public void initialize() {
        JMenu menu1 = new JMenu("Menu");
        JMenu menu2 = new JMenu("Menu");
        JMenu menu3 = new JMenu("Menu");
        JMenuItem menuItem1 = new JMenuItem("Test Item");
        JMenuItem menuItem2 = new JMenuItem("Test Item");
        JMenuItem menuItem3 = new JMenuItem("Test Item");
        JMenuItem menuItem4 = new JMenuItem("Test Item");
        JMenuItem menuItem5 = new JMenuItem("Test Item");
        JMenuItem menuItem6 = new JMenuItem("Test Item");
        JMenuItem menuItem7 = new JMenuItem("Test Item");
        JMenuItem menuItem8 = new JMenuItem("Test Item");
        JMenuItem menuItem9 = new JMenuItem("Test Item");

        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menuItem3);
        menu2.add(menuItem4);
        menu2.add(menuItem5);
        menu2.add(menuItem6);
        menu3.add(menuItem7);
        menu3.add(menuItem8);
        menu3.add(menuItem9);
        this.add(menu1);
        this.add(menu2);
        this.add(menu3);
    }
}
