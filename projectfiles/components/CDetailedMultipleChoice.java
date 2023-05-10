package projectfiles.components;

public class CDetailedMultipleChoice extends CFieldGroup {

  String header;
  int headerPlacement;
  String detailsLabel;
  int detailsPlacement;
  int choicesOrientation;
  String[] choices;

  CMultipleChoice multipleChoiceComponent;
  CFormField detailsComponent;

  /**
   * 
<<<<<<< HEAD
   * @param header - the header text string to be displayed at the top
   * @param headerPlacement - the placement side of the header
   * @param detailsLabel - the label for the details text field
   * 
   * @param choicesOrientation - the placement orientation of the choices
   * @param choices - the multiple choices
=======
   * @param header
   * @param detailsLabel
   * @param headerPlacement
   * @param choicesOrientation
   * @param choices
>>>>>>> 003ab95b4aa51397bfefae3ea3254b5914ba87e2
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
<<<<<<< HEAD
      this.setFollowOrientation(true);

      try {
		  	this.headerPlacement = (int) matchValue(headerPlacement, CFieldGroup.LEFT, CFieldGroup.RIGHT, CFieldGroup.TOP, CFieldGroup.BOTTOM);
		  } catch (Exception e) {
		  	throw new IllegalArgumentException("Invalid orientation value!");
		  }

      try {
		  	this.detailsPlacement = (int) matchValue(detailsPlacement, CFieldGroup.LEFT, CFieldGroup.RIGHT, CFieldGroup.TOP, CFieldGroup.BOTTOM);
        if (this.detailsPlacement == CFieldGroup.LEFT || this.detailsPlacement == CFieldGroup.RIGHT) {
          this.orientation = CFieldGroup.HORIZONTAL;
        } else if (this.detailsPlacement == CFieldGroup.TOP || this.detailsPlacement == CFieldGroup.BOTTOM) {
          this.orientation = CFieldGroup.VERTICAL;
        }
=======
      // this.setFollowOrientation(true);

      try {
		  	this.headerPlacement = (int) matchValue(headerPlacement, CFieldGroup.LEFT, CFieldGroup.RIGHT, CFieldGroup.TOP, CFieldGroup.BOTTOM);
>>>>>>> 003ab95b4aa51397bfefae3ea3254b5914ba87e2
		  } catch (Exception e) {
		  	throw new IllegalArgumentException("Invalid headerPlacement value!");
		  }

<<<<<<< HEAD
=======
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

>>>>>>> 003ab95b4aa51397bfefae3ea3254b5914ba87e2
      this.constructComponents();
    }
    
    public void constructComponents() throws Exception {
      this.multipleChoiceComponent = new CMultipleChoice(this.header, this.headerPlacement, this.choicesOrientation, this.choices);
      this.detailsComponent = new CFormField(this.detailsLabel, CFieldGroup.VERTICAL);
<<<<<<< HEAD
      this.detailsComponent.textFieldComponent.setRows(4);
=======
      this.detailsComponent.textFieldComponent.setRows(3);
>>>>>>> 003ab95b4aa51397bfefae3ea3254b5914ba87e2

      if (this.detailsPlacement == CFieldGroup.LEFT || this.detailsPlacement == CFieldGroup.TOP) {
        this.add(detailsComponent);
        this.add(multipleChoiceComponent);
      } else if (this.detailsPlacement == CFieldGroup.RIGHT || this.detailsPlacement == CFieldGroup.BOTTOM) {
        this.add(multipleChoiceComponent);
        this.add(detailsComponent);
      }
    }
}
