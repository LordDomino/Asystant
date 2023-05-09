package projectfiles.components;

public class CDetailedCheckboxGroup extends CFieldGroup {

  String header;
  int headerPlacement;
  String detailsLabel;
  int detailsPlacement;
  int choicesOrientation;
  String[] choices;

  CLabel headerComponent;
  CFieldGroup choicesGroupComponent;

  public CDetailedCheckboxGroup(String header, int headerPlacement,
  String detailsLabel, int detailsPlacement, int choicesOrientation,
  String ... choices) throws Exception {
    super();
    this.header = header;
    this.headerPlacement = headerPlacement;
    this.detailsLabel = detailsLabel;
    this.detailsPlacement = detailsPlacement;
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

    this.constructComponents();
  }

  @Override
	public void constructComponents() throws Exception {
		this.headerComponent = new CLabel(this.header);
		this.choicesGroupComponent = new CFieldGroup(this.choicesOrientation);

		for (String choice : this.choices) {

      int detailsOrientation;

      if (this.detailsPlacement == CFieldGroup.LEFT || this.detailsPlacement == CFieldGroup.RIGHT) {
        detailsOrientation = CFieldGroup.HORIZONTAL;
      } else if (this.detailsPlacement == CFieldGroup.TOP || this.detailsPlacement == CFieldGroup.BOTTOM) {
        detailsOrientation = CFieldGroup.VERTICAL;
      } else {
        throw new Exception("detailsPlacement value could not be identified!");
      }

      CFieldGroup choiceAndDetail = new CFieldGroup(detailsOrientation);
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
}
