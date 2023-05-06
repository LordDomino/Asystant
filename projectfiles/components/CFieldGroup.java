package projectfiles.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JPanel;

import projectfiles.Util;

/**
 * {@code}CFieldGroup{@code} is a container extending from Java Swing's
 * {@code}JPanel{@code} customized to group Cobast's form fields.
 * 
 * @author Loui Dominic Naquita
 * @see JPanel
 */
public class CFieldGroup extends JPanel {
    
    /**
     * This object's {@code}GridBagConstraints{@code} providing the constraints 
     * for every component.
     */
    public final GridBagConstraints gbc = new GridBagConstraints();

    /**
     * The object's {@code}GridBagLayout{@code} providing the layout for every
     * component.
     */
    public final GridBagLayout layout = new GridBagLayout();

    /**
     * This object's {@code}Inset{@code} providing the side insets of every
     * component.
     */
    public final Insets insets = new Insets(0, 0, 0, 0); // replace this instantiation with reference to a future 'default' margin

    /**
     * This object's {@code}Color{@code} providing the background color of it.
     */
    public final Color bgColor = new Color(255, 255, 255);

    /**
     * Creates a {@code}CFieldGroup{@code} object.
     * <p>
     * During the construction of the object, the appropriate layout manager
     * is set, calling the {@code}GridBagConstraints{@code} field
     * {@code}gbc{@code}, along with {@code}gbc{@code}'s layout specifications
     * such as insets.
     */
    public CFieldGroup() {
        super();
        this.setLayout(this.layout);
        this.setGridBagConstraintValues();

        this.setBackground(this.bgColor);
    }

    /**
     * This is a convenience method for modifying {@code}this.gbc{@code}'s
     * grid bag constraint values. This shall be called inside the current
     * class' constructor.
     */
    public void setGridBagConstraintValues() {
        this.gbc.insets = this.insets;
    }

    /**
     * Adds the specified component with this object's
     * {@code}GridBagConstraints{@code}.
     */
    @Override
    public Component add(Component component) {
        this.add(component, this.gbc);
        return component;
    }

    /** 
     * Adds the specified component to this object in a horizontal manner.
     * 
     * @param component - the component to add to this object horizontally
     */
    public Component addHorizontal(Component component) {
        this.add(component, this.gbc);
        this.gbc.gridx++;
        return component;
    }

    /** 
     * Adds the specified component to this object in a vertical manner.
     * 
     * @param component - the component to add to this object vertically
     */
    public Component addVertical(Component component) {
        this.add(component, this.gbc);
        this.gbc.gridy++;
        return component;
    }

    /**
     * Adds the specified component to this object at a specified row and
     * column.
     * 
     * @param component - the component to add to this object at column x and
     * row y
     * @param x - the horizontal position of the component across the row
     * @param y - the vertical position of the component across the column
     * @return the component argument
     */
    public Component addOnGrid(Component component, int x, int y) {
        Util.setGrid(this.gbc, x, y);
        this.add(component, this.gbc);
        return component;
    }

    /**
     * This is a convenience method for adding the necessary children
     * components of this container (if containing any subcomponents), intended
     * to be called on constructors of this class.
     */
    void constructComponents() {}
}
