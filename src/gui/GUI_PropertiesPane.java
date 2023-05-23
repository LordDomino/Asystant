package projectfiles.gui;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projectfiles.components.CFieldGroup;
import projectfiles.components.CLabel;
import projectfiles.components.CTextField;
import projectfiles.gui.styles.Colors;
import projectfiles.gui.styles.Fonts;

public class GUI_PropertiesPane extends JPanel {

    GridBagConstraints gbc = new GridBagConstraints();

    public GUI_PropertiesPane() throws Exception {
        super();
        setLayout(new GridBagLayout());
        setBackground(Colors.BACKGROUND_ACCENT_MID);
        setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
    
        // GridBagConstraints
        this.gbc.gridx = 0;
        this.gbc.weightx = 1;
        this.gbc.weighty = 0;
        this.gbc.fill = GridBagConstraints.BOTH;
        this.gbc.anchor = GridBagConstraints.NORTHWEST;
        this.gbc.insets = new Insets(3, 0, 3, 0);
        
        JLabel HEADER = new JLabel("Properties"); HEADER.setFont(new Font(Fonts.DEFAULT_FAMILY_HEADER, Font.BOLD, 16));
        
        CFieldGroup FIELDS = new CFieldGroup();
        FIELDS.setBackground(Colors.BACKGROUND_ACCENT_MID);
        FIELDS.gbc.gridx = 0;
        FIELDS.gbc.weightx = 1;
        FIELDS.gbc.weighty = 0;
        FIELDS.gbc.fill = GridBagConstraints.HORIZONTAL;
        FIELDS.gbc.anchor = GridBagConstraints.WEST;
    
        CLabel FIELDLABEL_1 = new CLabel("Record name");
        CLabel FIELDLABEL_2 = new CLabel("ID name");
        CLabel FIELDLABEL_3 = new CLabel("Student full name");
        CLabel FIELDLABEL_4 = new CLabel("Example field 1");
        CLabel FIELDLABEL_5 = new CLabel("Example field 2");
        CLabel FIELDLABEL_6 = new CLabel("Example field 3");
        CTextField TEXTFIELD_1 = new CTextField("RECORD0001");
        CTextField TEXTFIELD_2 = new CTextField("123456");
        CTextField TEXTFIELD_3 = new CTextField("Juan Dela Cruz");
        CTextField TEXTFIELD_4 = new CTextField("Example value 1");
        CTextField TEXTFIELD_5 = new CTextField("Example value 2");
        CTextField TEXTFIELD_6 = new CTextField("Example value 3");
    
        FIELDS.gbc.weightx = 0;
        FIELDS.addOnGrid(FIELDLABEL_1, 0, 1);
        FIELDS.addOnGrid(FIELDLABEL_2, 0, 2);
        FIELDS.addOnGrid(FIELDLABEL_3, 0, 3);
        FIELDS.addOnGrid(FIELDLABEL_4, 0, 4);
        FIELDS.addOnGrid(FIELDLABEL_5, 0, 5);
        FIELDS.addOnGrid(FIELDLABEL_6, 0, 6);
        
        FIELDS.gbc.weightx = 1;
        FIELDS.addOnGrid(TEXTFIELD_1, 1, 1);
        FIELDS.addOnGrid(TEXTFIELD_2, 1, 2);
        FIELDS.addOnGrid(TEXTFIELD_3, 1, 3);
        FIELDS.addOnGrid(TEXTFIELD_4, 1, 4);
        FIELDS.addOnGrid(TEXTFIELD_5, 1, 5);
        FIELDS.addOnGrid(TEXTFIELD_6, 1, 6);

        add(HEADER);
        add(FIELDS);
    }

    @Override
    public Component add(Component component) {
      super.add(component, this.gbc);
      return component;
    }
}
