package projectfiles.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import projectfiles.Util;
import projectfiles.gui.styles.Colors;

/**
 * {@code}CFieldGroup{@code} is a container extending from Java Swing's
 * {@code}JPanel{@code} customized to group Cobast's form fields.
 * 
 * @author Loui Dominic Naquita
 * @see JPanel
 */
public class CFieldGroup extends JPanel {

	/**
	 * The horizontal orientation constant. This indicates a horizontal 
	 * orientation (from left to right) of the components.
	 */
	public static final int HORIZONTAL = 0;

	/**
	 * The vertical orientation constant. This indicates a vertical orientation
	 * (from top to bottom) of the components.
	 */
	public static final int VERTICAL = 1;
	
	/**
	 * The left side placement constant.
	 */
	public static final int LEFT = 2;

	/**
	 * The right side placement constant.
	 */
	public static final int RIGHT = 3;

	/**
	 * The top side placement constant.
	 */
	public static final int TOP = 4;

	/**
	 * The bottom side placement constant.
	 */
	public static final int BOTTOM = 5;

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
	public final Insets insets = new Insets(3, 3, 3, 3); // replace this instantiation with a reference to a future 'default' margin

	/**
	 * This object's {@code}Color{@code} providing the background color of it.
	 */
	public final Color bgColor = new Color(255, 255, 255);

	/**
	 * The default add component orientation if {@code}followOrientation{@code}
	 * is true.
	 */
	public int orientation = CFieldGroup.HORIZONTAL;

	/**
	 * The boolean that indicates whether or not the orientation is followed.
	 */
	public boolean followOrientation = false;

	public boolean isPaintGroup = false;

	/**
	 * Creates a {@code}CFieldGroup{@code} object.
	 * <p>
	 * During the construction of the object, the appropriate layout manager
	 * is set, calling the {@code}GridBagConstraints{@code} field
	 * {@code}gbc{@code}, along with {@code}gbc{@code}'s layout specifications
	 * such as insets and background color.
	 */
	public CFieldGroup() {
		super();
		this.initialize();
	}

	/**
	 * Creates a {@code}CFieldGroup{@code} object with the specified orientation
	 * of the components.
	 * <p>
	 * During the construction of the object, the appropriate layout manager
	 * is set, calling the {@code}GridBagConstraints{@code} field
	 * {@code}gbc{@code}, along with {@code}gbc{@code}'s layout specifications
	 * such as insets and background color.
	 */
	public CFieldGroup(int orientation) {
		super();
		this.initialize();

		if (orientation == CFieldGroup.HORIZONTAL) {
			this.orientation = orientation;
		} else if (orientation == CFieldGroup.VERTICAL) {
			this.orientation = orientation;
		} else {
			throw new IllegalArgumentException("Value " + orientation + " is not a valid integer value for the parameter \"orientation\"");
		}
	}

	public void initialize() {
		this.setLayout(this.layout);
		Util.setGrid(this.gbc, 0, 0);
		this.setGridBagConstraintValues();
		this.setBackground(this.bgColor);
		// this.setBorder(new MatteBorder(1, 1, 1, 1, Colors.BLACK));
	}

	/**
	 * This is a convenience method for modifying {@code}this.gbc{@code}'s
	 * grid bag constraint values. This shall be called inside the current
	 * class' constructor.
	 */
	private void setGridBagConstraintValues() {
		this.gbc.insets = this.insets;
		this.gbc.fill = GridBagConstraints.BOTH;
		this.gbc.weightx = 1;
		this.gbc.weighty = 1;
		this.gbc.anchor = GridBagConstraints.WEST;
	}

	/**
	 * Adds the specified component with this object's
	 * {@code}GridBagConstraints{@code}.
	 */
	@Override
	public Component add(Component component) {
		if (this.orientation == CFieldGroup.HORIZONTAL) {
			this.gbc.gridx++;
		} else if (this.orientation == CFieldGroup.VERTICAL) {
			this.gbc.gridy++;
		}
		this.add(component, this.gbc);

		return component;
	}

	/** 
	 * Adds the specified component to this object in a horizontal manner.
	 * 
	 * @param component - the component to add to this object horizontally
	 */
	public Component addHorizontal(Component component) throws Exception {
		if (this.followOrientation) {
			throw new Exception("Cannot add the component horizontally while the orientation is being followed!");
		} else {
			this.gbc.gridx++;
			this.add(component, this.gbc);
			return component;
		}
	}

	/** 
	 * Adds the specified component to this object in a vertical manner.
	 * 
	 * @param component - the component to add to this object vertically
	 */
	public Component addVertical(Component component) throws Exception {
		if (this.followOrientation) {
			throw new Exception("Cannot add the component vertically while the orientation is being followed!");
		} else {
			this.gbc.gridy++;
			this.add(component, this.gbc);
			return component;
		}
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
	public Component addOnGrid(Component component, int x, int y) throws Exception {
		if (this.followOrientation) {
			throw new Exception("Cannot add the component to a grid position while the orientation is being followed!");
		} else {
			Util.setGrid(this.gbc, x, y);
			this.add(component, this.gbc);
			return component;
		}
	}

	/**
	 * Sets the boolean flag to whether or not this container follows horizontal
	 * or vertical placement of components.
	 * 
	 * @param b - the boolean to whether or not this container follows
	 * horizontal and vertical placement of components
	 */
	public void setFollowOrientation(boolean b) {
		this.followOrientation = b;
		// this.gbc.gridy = 0;
		// this.gbc.gridx = 0;
	}

	/**
	 * This is a convenience method for adding the necessary children
	 * components of this container (if containing any subcomponents), intended
	 * to be called inside constructors of this class.
	 * <p>
	 * {@code}constructComponents(){@code} is used to manage custom field group
	 * layouts and must be overridden when extending this current class.
	 */
	public void constructComponents() throws Exception {}

	/**
	 * Returns the matching value if the specified value matched any of the
	 * given match values.
	 * 
	 * @param value - the value to check if it matches any of the match values
	 * @param matchValues - the expected desired value/s
	 * @return {@code}true{@code} if the value matches any of the match values,
	 * otherwise, {@code}false{@code}
	 * @throws Exception
	 */
	Object matchValue(Object value, Object ... matchValues) throws Exception {
		Object returnValue = null;
		for (Object matchValue : matchValues) {
			if (value == matchValue) {
				returnValue = matchValue;
			}
		}

		if (returnValue == null) {
			throw new Exception("The specified value \"" + value + "\" did not match any of the given match values!");
		} else {
			return returnValue;
		}
	}

	public void setPaintGroup(boolean b) {
    this.isPaintGroup = b;
  }

  void paintGroup() {
    if (isPaintGroup) {
      this.setBorder(new MatteBorder(1, 1, 1, 1, Colors.GRAY));
    }
  }
}
