package projectfiles.components;

import java.awt.Insets;

/**
 * {@code}CheckboxGroup{@code} is a container for multiple
 * {@code}CCheckbox{@code} components and a {@code}CLabel{@code} header.
 * 
 * @author Loui Dominic Naquita
 */
public class CCheckboxGroup extends CFieldGroup {

  /**
   * The text string displayed as the header of the group.
   */
  String header;

  /**
   * The placement side of the header.
   */
  int headerPlacement;

  /**
   * The placement orientation of the header.
   */
  int choicesOrientation;

  /**
   * The array of text string to be displayed as checkbox labels.
   */
  String[] choices;

  /**
   * The component object for the header.
   */
  CLabel headerComponent;

  /**
   * The {@code}CFieldGroup{@code} component object to contain the choices.
   */
  CFieldGroup choicesGroupComponent;

  /**
   * Creates a {@code}CCheckboxGroup{@code} object with the specified header,
   * details label, and choices.
   * 
   * @param header - the text string displayed as the header of the group
   * @param headerPlacement - the placement side of the header, which can either
   * be {@code}LEFT{@code}, {@code}RIGHT{@code}, {@code}TOP{@code}, or
   * {@code}BOTTOM{@code}
   * @param choicesOrientation - the placement orientation of the choices, which
   * can only be either {@code}HORIZONTAL{@code} or {@code}VERTICAL{@code}
   * @param choices - the array of text string to display as checkbox labels
   * @throws Exception
   */
  public CCheckboxGroup(String header, int headerPlacement,
  int choicesOrientation, String ... choices) throws Exception {
    super();
    this.header = header;
    this.headerPlacement = headerPlacement;
    this.choicesOrientation = choicesOrientation;
    this.choices = choices;

    try {
      this.headerPlacement = (int) matchValue(headerPlacement, CFieldGroup.LEFT, CFieldGroup.RIGHT, CFieldGroup.TOP, CFieldGroup.BOTTOM);
      if (this.headerPlacement == CFieldGroup.LEFT || this.headerPlacement == CFieldGroup.RIGHT) {
        this.orientation = CFieldGroup.HORIZONTAL;
      } else if (this.headerPlacement == CFieldGroup.TOP || this.headerPlacement == CFieldGroup.BOTTOM) {
        this.orientation = CFieldGroup.VERTICAL;
      }
    } catch (Exception e) {
      throw new IllegalAccessException("Invalid headerPlacement value!");
    }

    try {
      this.choicesOrientation = (int) matchValue(choicesOrientation, CFieldGroup.HORIZONTAL, CFieldGroup.VERTICAL);
    } catch (Exception e) {
      throw new IllegalAccessException("Invalid choicesOrientation value!");
    }

    setGridBagConstraintValues();
    constructComponents();
    paintGroup();
  }

	private void constructComponents() throws Exception {
		this.headerComponent = new CLabel(this.header);
		this.choicesGroupComponent = new CFieldGroup(this.choicesOrientation);

		for (String choice : this.choices) {
			CCheckbox choiceComponent = new CCheckbox(choice);
			this.choicesGroupComponent.add(choiceComponent);
		}

		if (this.headerPlacement == CFieldGroup.LEFT || this.headerPlacement == CFieldGroup.TOP || this.headerPlacement == CFieldGroup.HORIZONTAL || this.headerPlacement == CFieldGroup.VERTICAL) {
			this.gbc.weightx = 0; this.gbc.weighty = 1;
			this.add(this.headerComponent);
			this.add(this.choicesGroupComponent);
			this.gbc.weightx = 1; this.gbc.weighty = 1;
		} else if (this.headerPlacement == CFieldGroup.RIGHT || this.headerPlacement == CFieldGroup.BOTTOM) {
			this.gbc.weightx = 0; this.gbc.weighty = 1;
			this.add(this.choicesGroupComponent);
			this.add(this.headerComponent);
			this.gbc.weightx = 1; this.gbc.weighty = 1;
		}
	}

  void setGridBagConstraintValues() {
		this.gbc.insets = new Insets(5, 5, 5, 5);
	} 
}
