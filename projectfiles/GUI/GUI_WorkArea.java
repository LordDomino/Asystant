package projectfiles.gui;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import projectfiles.components.CFieldGroup;
import projectfiles.components.CLabel;
import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

public class GUI_WorkArea extends JSplitPane {
  
  public JPanel recordsPane = new JPanel();
  public JPanel propertiesPane = new JPanel();
  
  public JSplitPane RIGHT_COMPONENT;

  public GUI_WorkArea() throws Exception {
    super();
    setBackground(Colors.BACKGROUND_ACCENT_LIGHT);
    this.setDividerSize(3);
    this.setDividerLocation(250);
    this.setLeftComponent(recordsPane);

    GUI_FormArea form = new GUI_FormArea();

    RIGHT_COMPONENT = new JSplitPane();
    RIGHT_COMPONENT.setDividerSize(3);

    JScrollPane leftComp = new JScrollPane(form);
    leftComp.setWheelScrollingEnabled(true);
    leftComp.getVerticalScrollBar().setUnitIncrement(18);

    RIGHT_COMPONENT.setLeftComponent(leftComp);
    RIGHT_COMPONENT.setRightComponent(propertiesPane);
    RIGHT_COMPONENT.setDividerLocation(leftComp.getPreferredSize().width);
    
    recordsPane.setBackground(Colors.BACKGROUND_ACCENT_MID);
    recordsPane.setLayout(new GridBagLayout());
    recordsPane.add(new GUI_RecordsPane(), new GridBagConstraints(0, 0, 1, 1, 1, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, getInsets(), 0, 0));
    
    CFieldGroup LIST = new CFieldGroup();
    LIST.setBackground(Colors.BACKGROUND_ACCENT_MID);
    LIST.setBorder(BorderFactory.createTitledBorder(new MatteBorder(1, 1, 1, 1, Colors.BACKGROUND_CONTRAST_ACCENT1), "Records list", TitledBorder.LEFT, TitledBorder.TOP, new Font(Fonts.DEFAULT_FAMILY_HEADER, Font.BOLD, 14), Colors.TEXT_ACCENT2));
    LIST.gbc.gridx = 0;
    LIST.gbc.weightx = 1;
    LIST.gbc.weighty = 1;
    LIST.gbc.fill = GridBagConstraints.HORIZONTAL;
    LIST.gbc.anchor = GridBagConstraints.NORTHWEST;

    CLabel SAMPLERECORD_1 = new CLabel("Student health profile record 1");
    CLabel SAMPLERECORD_2 = new CLabel("Student health profile record 2");
    CLabel SAMPLERECORD_3 = new CLabel("Student health profile record 3");
    CLabel SAMPLERECORD_4 = new CLabel("Student health profile record 4");
    CLabel SAMPLERECORD_5 = new CLabel("Student health profile record 5");
    CLabel SAMPLERECORD_6 = new CLabel("Student health profile record 6");
    CLabel SAMPLERECORD_7 = new CLabel("Student health profile record 7");
    CLabel SAMPLERECORD_8 = new CLabel("Student health profile record 8");
    CLabel SAMPLERECORD_9 = new CLabel("Student health profile record 9");
    CLabel SAMPLERECORD_10 = new CLabel("Student health profile record 10");

    CFieldGroup listPanel = new CFieldGroup();
    listPanel.setBackground(Colors.BACKGROUND_ACCENT_MID);
    listPanel.gbc.gridx = 0;
    listPanel.gbc.weightx = 1;
    listPanel.gbc.weighty = 1;
    listPanel.gbc.fill = GridBagConstraints.BOTH;
    listPanel.gbc.anchor = GridBagConstraints.NORTHWEST;

    listPanel.addVertical(SAMPLERECORD_1);
    listPanel.addVertical(SAMPLERECORD_2);
    listPanel.addVertical(SAMPLERECORD_3);
    listPanel.addVertical(SAMPLERECORD_4);
    listPanel.addVertical(SAMPLERECORD_5);
    listPanel.addVertical(SAMPLERECORD_6);
    listPanel.addVertical(SAMPLERECORD_7);
    listPanel.addVertical(SAMPLERECORD_8);
    listPanel.addVertical(SAMPLERECORD_9);
    listPanel.addVertical(SAMPLERECORD_10);

    LIST.add(listPanel);
    
    recordsPane.add(LIST, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(0, 10, 10, 10), 0, 0));

    propertiesPane.setBackground(Colors.BACKGROUND_ACCENT_MID);
    propertiesPane.setLayout(new GridBagLayout());
    propertiesPane.add(new GUI_PropertiesPane(), new GridBagConstraints(0, 0, 2, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, getInsets(), 0, 0));

    JButton prevButton = new JButton("Previous record");
    JButton nextButton = new JButton("Next record");

    propertiesPane.add(prevButton, new GridBagConstraints(0, 1, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 10, 5, 10), 0, 0));
    propertiesPane.add(nextButton, new GridBagConstraints(1, 1, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 10, 5, 10), 0, 0));

    this.setLeftComponent(recordsPane);
    this.setRightComponent(RIGHT_COMPONENT);
  }
}
