package projectfiles.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import projectfiles.gui.formSections.SectionA;
import projectfiles.gui.styles.Colors;

public class GUI_WorkArea extends JSplitPane {
  
  public GUI_RecordsPane recordsPane = new GUI_RecordsPane();
  public GUI_PropertiesPane propertiesPane = new GUI_PropertiesPane();

  public GUI_WorkArea() throws Exception {
    super();
    setBackground(Colors.BACKGROUND_ACCENT_LIGHT);
    this.setDividerSize(3);
    this.setDividerLocation(250);
    this.setLeftComponent(recordsPane);

    GUI_FormArea form = new GUI_FormArea();

    JSplitPane rightComp = new JSplitPane();
    rightComp.setDividerSize(3);

    JScrollPane leftComp = new JScrollPane(form);

    rightComp.setLeftComponent(leftComp);
    rightComp.setRightComponent(propertiesPane);
    rightComp.setDividerLocation(leftComp.getPreferredSize().width);
    System.out.println(leftComp.getPreferredSize());
    
    this.setLeftComponent(recordsPane);
    this.setRightComponent(rightComp);
  }
}
