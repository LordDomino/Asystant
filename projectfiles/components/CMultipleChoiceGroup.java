package projectfiles.components;


import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class CMultipleChoiceGroup extends CFieldGroup {

	/**
	 * The text string indicating the header of the multiple choices.
	 */
	String header;

	/**
	 * The integer indicating the placement orientation of the choices.
	 */
	int choicesOrientation;

	/** 
	 * The array of multiple choices.
	 */
	String[] choices;

	int headerPlacement;

	/**
	 * The component serving as the header of this multiple choice group.
	 */
	JLabel headerComponent;

	/**
	 * The component serving as the container of the radio buttons.
	 */
	CFieldGroup choicesGroupComponent;

	/**
	 * The button group containing the arbitrary number of radio buttons of this
	 * multiple choice group.
	 */
	ButtonGroup choicesGroup;

	/**
	 * Creates a {@code}CMultipleChoiceGroup{@code} object with the specified
	 * prompt header text and the multiple choices.
	 * 
	 * @param header - the text string indicating the header of the multiple
	 * choices
	 * @param headerOrientation - the value indicating the placement behavior of
	 * @param choices - the array of multiple choices
	 */
	public CMultipleChoiceGroup(String header, int headerOrientation,
	int choicesOrientation, String ... choices) throws Exception {
			super();
			this.header = header;
			this.choices = choices;
			
			try {
				this.headerPlacement = (int) matchValue(headerOrientation, CFormField.LEFT, CFormField.RIGHT, CFormField.TOP, CFormField.BOTTOM);
				if (this.headerPlacement == CFormField.LEFT || this.headerPlacement == CFormField.RIGHT) {
					this.orientation = CFormField.HORIZONTAL;
				} else if (this.headerPlacement == CFormField.TOP || this.headerPlacement == CFormField.BOTTOM) {
					this.orientation = CFormField.VERTICAL;
				}
			} catch (Exception e) {
				throw new IllegalArgumentException("Invalid headerOrientation value!");
			}
			
			try {
				this.choicesOrientation = (int) matchValue(choicesOrientation,
				CFormField.HORIZONTAL, CFormField.VERTICAL);
			} catch (Exception e) {
				throw new IllegalArgumentException("Invalid choicesOrientation value!");
			}
			
			this.setGridBagConstraintValues();
			this.constructComponents();
	}

	@Override
	void constructComponents() throws Exception {
		this.headerComponent = new JLabel(this.header);
		this.choicesGroupComponent = new CFieldGroup(this.choicesOrientation);
		this.choicesGroup = new ButtonGroup();

		for (String choice : this.choices) {
			CRadioButton choiceComponent = new CRadioButton(choice);
			this.choicesGroupComponent.add(choiceComponent);
			this.choicesGroup.add(choiceComponent);
		}

		if (this.headerPlacement == CFormField.LEFT || this.headerPlacement == CFormField.TOP) {
			this.add(this.headerComponent);
			this.add(this.choicesGroupComponent);
		} else if (this.headerPlacement == CFormField.RIGHT || this.headerPlacement == CFormField.BOTTOM) {
			this.add(this.choicesGroupComponent);
			this.add(this.headerComponent);
		}
	}

	void setGridBagConstraintValues() {
		this.gbc.insets = new Insets(5, 5, 5, 5);
	}
}
