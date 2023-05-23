package projectfiles.components;

public class CDetailedMultipleChoice extends CFieldGroup {

  String header;
  int headerPlacement;
  String detailsLabel;
  int detailsPlacement;
  int choicesOrientation;
  String[] choices;

  CMultipleChoice multipleChoiceComponent;
  public CLabelledTextField detailsComponent;

  /**
   * 
   * @param header
   * @param detailsLabel
   * @param headerPlacement
   * @param choicesOrientation
   * @param choices
   * @throws Exception
   */
  public CDetailedMultipleChoice(String header, int headerPlacement, String detailsLabel,
    int detailsPlacement, int choicesOrientation, String ... choices) throws Exception {
      super();
      this.header = header;
      this.headerPlacement = headerPlacement;
      this.detailsLabel = detailsLabel;
      this.detailsPlacement = detailsPlacement;
      this.choicesOrientation = choicesOrientation;
      this.choices = choices;
      // this.setFollowOrientation(true);

      try {
		  	this.headerPlacement = (int) matchValue(headerPlacement, CFieldGroup.LEFT, CFieldGroup.RIGHT, CFieldGroup.TOP, CFieldGroup.BOTTOM);
		  } catch (Exception e) {
		  	throw new IllegalArgumentException("Invalid headerPlacement value!");
		  }

      try {
        this.detailsPlacement = (int) matchValue(detailsPlacement, CFieldGroup.LEFT, CFieldGroup.RIGHT, CFieldGroup.TOP, CFieldGroup.BOTTOM);
        if (this.detailsPlacement == CFieldGroup.LEFT || this.detailsPlacement == CFieldGroup.RIGHT) {
          this.orientation = CFieldGroup.HORIZONTAL;
        } else if (this.detailsPlacement == CFieldGroup.TOP || this.detailsPlacement == CFieldGroup.BOTTOM) {
          this.orientation = CFieldGroup.VERTICAL;
        }
      } catch (Exception e) {
        throw new IllegalAccessException("Invalid detailsPlacement value!");
      }

      this.constructComponents();
    }
    
    public void constructComponents() throws Exception {
      this.multipleChoiceComponent = new CMultipleChoice(this.header, this.headerPlacement, this.choicesOrientation, this.choices);
      this.detailsComponent = new CLabelledTextField(this.detailsLabel, CFieldGroup.VERTICAL);
      this.detailsComponent.textFieldComponent.setRows(3);

      if (this.detailsPlacement == CFieldGroup.LEFT || this.detailsPlacement == CFieldGroup.TOP) {
        this.add(detailsComponent);
        this.add(multipleChoiceComponent);
      } else if (this.detailsPlacement == CFieldGroup.RIGHT || this.detailsPlacement == CFieldGroup.BOTTOM) {
        this.add(multipleChoiceComponent);
        this.add(detailsComponent);
      }
    }
}
