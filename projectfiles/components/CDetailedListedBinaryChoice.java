package projectfiles.components;

import java.awt.GridBagConstraints;

public class CDetailedListedBinaryChoice extends CListedBinaryChoice {

	String detailsLabel;
	CLabel detailsLabelComponent;

	public CDetailedListedBinaryChoice(String choice1, String choice2, String detailsLabel, String ... prompts) throws Exception {
		super(choice1, choice2, prompts);
		this.detailsLabel = detailsLabel;

		this.setGridBagConstraintValues();
		this.constructComponents();
	}

	private void constructComponents() throws Exception {
		
		this.detailsLabelComponent = new CLabel(this.detailsLabel);

		for (int index = 1; index <= this.prompts.length; index++) {
			CFormField detailsFieldComponent = new CFormField("", CFieldGroup.HORIZONTAL);
			this.gbc.weightx = 1;
			this.gbc.fill = GridBagConstraints.BOTH;
			this.addOnGrid(detailsFieldComponent, 3, index);
		}
		
		this.gbc.weightx = 1;
		this.gbc.fill = GridBagConstraints.NONE;
		this.gbc.anchor = GridBagConstraints.WEST;
		this.addOnGrid(this.detailsLabelComponent, 3, 0);
	}

	void setGridBagConstraintValues() {
    this.gbc.fill = GridBagConstraints.NONE;
  }
}
