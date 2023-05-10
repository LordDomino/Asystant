package projectfiles.components;

import java.awt.CheckboxGroup;
import java.awt.Insets;

import javax.swing.JLabel;

public class CCheckboxGroup extends CFieldGroup {

    String header;
    int headerPlacement;
    int choicesOrientation;
    String[] choices;

    JLabel headerComponent;
    CFieldGroup choicesGroupComponent;

    public CCheckboxGroup(String header, int headerPlacement,
    int choicesOrientation, String ... choices) throws Exception {
        super();
        this.header = header;
        this.choices = choices;

        try {
            this.headerPlacement = (int) matchValue(headerPlacement,
                CFieldGroup.LEFT, CFieldGroup.RIGHT, CFieldGroup.TOP, CFieldGroup.BOTTOM,
                CFieldGroup.HORIZONTAL, CFieldGroup.VERTICAL);
                if (this.headerPlacement == CFieldGroup.LEFT || this.headerPlacement == CFieldGroup.RIGHT || this.headerPlacement == CFieldGroup.HORIZONTAL) {
					this.orientation = CFieldGroup.HORIZONTAL;
				} else if (this.headerPlacement == CFieldGroup.TOP || this.headerPlacement == CFieldGroup.BOTTOM || this.headerPlacement == CFieldGroup.VERTICAL) {
					this.orientation = CFieldGroup.VERTICAL;
				}
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid headerOrientation value!");
        }

        try {
            this.choicesOrientation = (int) matchValue(choicesOrientation,
            CFieldGroup.HORIZONTAL, CFieldGroup.VERTICAL);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid choicesOrientation value!");
        }

        this.setGridBagConstraintValues();
		this.constructComponents();
    }

    @Override
	public void constructComponents() throws Exception {
		this.headerComponent = new JLabel(this.header);
		this.choicesGroupComponent = new CFieldGroup(this.choicesOrientation);
		// this.choicesGroup = new CheckboxGroup(choices);

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
