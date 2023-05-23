package projectfiles.components;

import java.awt.GridBagConstraints;
import java.util.ArrayList;

import javax.swing.JComponent;

public final class CDetailedListedBinaryChoice extends CListedBinaryChoice {

	String detailsLabel;
	CLabel detailsLabelComponent;
	ArrayList<JComponent> detailFieldsList = new ArrayList<JComponent>();

	public CDetailedListedBinaryChoice(String choice1, String choice2, String detailsLabel, String ... prompts) throws Exception {
		super(choice1, choice2, prompts);
		this.detailsLabel = detailsLabel;

		this.setGridBagConstraintValues();
		this.constructComponents();
	}

	private void constructComponents() throws Exception {
		
		this.detailsLabelComponent = new CLabel(this.detailsLabel);

		for (int index = 1; index <= this.prompts.length; index++) {
			CLabelledTextField detailsFieldComponent = new CLabelledTextField("", CFieldGroup.HORIZONTAL);
			detailsFieldComponent.putClientProperty("gridx", 3);
			detailsFieldComponent.putClientProperty("gridy", index);
			this.detailFieldsList.add(detailsFieldComponent);
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

	public void overrideField(int index, JComponent newComponent) throws Exception {
		JComponent oldComponent = this.detailFieldsList.get(index);
		int gridx = (int) oldComponent.getClientProperty("gridx");
		int gridy = (int) oldComponent.getClientProperty("gridy");

		this.remove(this.detailFieldsList.get(index));
		this.gbc.weighty = 1;

		this.gbc.fill = GridBagConstraints.BOTH;
		this.addOnGrid(newComponent, gridx, gridy);
		this.revalidate();
		this.repaint();
	}
}
