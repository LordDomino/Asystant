package projectfiles.components;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

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
    final GridBagConstraints gbc = new GridBagConstraints();

    /**
     * The object's {@code}GridBagLayout{@code} providing the layout for every
     * component.
     */
    final GridBagLayout layout = new GridBagLayout();

    /**
     * This object's {@code}Inset{@code} providing the side insets of every
     * component.
     */
    final Insets insets = new Insets(0, 0, 0, 0); // replace this instantiation with reference to a future 'default' margin

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
    }

    /**
     * This is a convenience method for modifying {@code}this.gbc{@code}'s
     * grid bag constraint values. This shall be called inside the current
     * class' constructor.
     */
    public void setGridBagConstraintValues() {
        this.gbc.insets = this.insets;
    }

    /** Add's the specified component with this object's
     * {@code}GridBagConstraints{@code}. */
    @Override
    public Component add(Component c) {
        this.add(c, this.gbc);
        return c;
    }
}
