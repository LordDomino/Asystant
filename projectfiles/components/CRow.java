/*
 * Written by Loui Dominic Naquita
 */

package projectfiles.components;

import java.awt.Component;
import java.awt.GridBagConstraints;

import javax.swing.JSeparator;

import projectfiles.gui.styles.Colors;


/**
 * A {@code}Row{@code} is a structure containing a horizontal array of fields.
 */
public class CRow extends CFieldGroup {

    public CRow() {
        super();
        this.initialize();
    }
    
    public CRow(Component ... components) {
        super();
        this.initialize();

        int index = 0;
        for (Component component : components) {
            super.add(component);
            index++;
            if (index <= components.length - 1) {
                JSeparator separator = new JSeparator(JSeparator.VERTICAL);
                separator.setBackground(Colors.BLACK);
                separator.setForeground(Colors.BLACK);
                this.gbc.weightx = 0;
                super.add(separator);
                this.gbc.weightx = 1;
            }
        }
    }

    private void initialize() {
        this.setFollowOrientation(true);
    }

    @Override
    public Component add(Component component) {
        JSeparator separator = new JSeparator(JSeparator.VERTICAL);
        separator.setBackground(Colors.BLACK);
        separator.setForeground(Colors.BLACK);
        this.gbc.weightx = 0;
        super.add(separator);
        this.gbc.weightx = 1;
        super.add(component);
        return component;
    }
}