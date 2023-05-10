package projectfiles.components;

public class CDetailedCheckboxGroup extends CFieldGroup {

<<<<<<< HEAD
    String header;
    int headerPlacement;
    String detailsLabel;
    int detailsPlacement;
    int choicesOrientation;
    String[] choices;

    public CDetailedCheckboxGroup(String header, int headerPlacement,
    String detailsLabel, int detailsPlacement, int choicesOrientation,
    String ... choices) throws Exception {
        super();
        this.header = header;
        this.headerPlacement = headerPlacement;
        this.detailsLabel = detailsLabel;
        this.detailsPlacement = detailsPlacement;
        // this.choicesOrientation = choicesOrientation
    }
=======
  String header;
  int headerPlacement;
  String detailsLabel;
  int choicesOrientation;
  String[] choices;

  CLabel headerComponent;
  CLabel labelComponent;
  CFieldGroup choicesGroupComponent;

  public CDetailedCheckboxGroup(String header, int headerPlacement,
  String detailsLabel, int choicesOrientation, String ... choices) throws Exception {
    super();
    this.header = header;
    this.headerPlacement = headerPlacement;
    this.detailsLabel = detailsLabel;
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
    this.labelComponent = new CLabel(this.detailsLabel);
		this.choicesGroupComponent = new CFieldGroup(this.choicesOrientation);

    this.choicesGroupComponent.addOnGrid(this.labelComponent, 1, 0);
    this.choicesGroupComponent.gbc.gridx = 0;

		for (String choice : this.choices) {
			CCheckbox choiceComponent = new CCheckbox(choice);
      CTextField detailsTextField = new CTextField();
			this.choicesGroupComponent.add(choiceComponent);
      this.choicesGroupComponent.addHorizontal(detailsTextField);
      this.choicesGroupComponent.gbc.gridx = 0;
		}

		if (this.headerPlacement == CFieldGroup.LEFT || this.headerPlacement == CFieldGroup.TOP || this.headerPlacement == CFieldGroup.HORIZONTAL || this.headerPlacement == CFieldGroup.VERTICAL) {
			this.gbc.weightx = 1; this.gbc.weighty = 1;
			this.add(this.headerComponent);
			this.add(this.choicesGroupComponent);
			this.gbc.weightx = 1; this.gbc.weighty = 1;
		} else if (this.headerPlacement == CFieldGroup.RIGHT || this.headerPlacement == CFieldGroup.BOTTOM) {
			this.gbc.weightx = 1; this.gbc.weighty = 1;
			this.add(this.choicesGroupComponent);
			this.add(this.headerComponent);
			this.gbc.weightx = 1; this.gbc.weighty = 1;
		}
	}
>>>>>>> 003ab95b4aa51397bfefae3ea3254b5914ba87e2
}
