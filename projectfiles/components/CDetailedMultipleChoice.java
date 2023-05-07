package projectfiles.components;

public class CDetailedMultipleChoice extends CMultipleChoice {

  String detailsLabel;
  CFormField detailsComponent;

  /**
   * 
   * @param header
   * @param detailsLabel
   * @param orientation
   * @param choicesOrientation
   * @param choices
   * @throws Exception
   */
  public CDetailedMultipleChoice(String header, String detailsLabel,
    int orientation, int choicesOrientation, String ... choices) throws Exception {
      super(header, orientation, choicesOrientation, choices);
      this.detailsLabel = detailsLabel;
      // this.setFollowOrientation(true);

      try {
		  	this.orientation = (int) matchValue(orientation, CFormField.HORIZONTAL, CFormField.VERTICAL);
		  	if (this.orientation == CFormField.HORIZONTAL) {
		  		this.orientation = CFormField.HORIZONTAL;
		  	} else if (this.headerPlacement == CFormField.VERTICAL) {
		  		this.orientation = CFormField.VERTICAL;
		  	}
		  } catch (Exception e) {
		  	throw new IllegalArgumentException("Invalid orientation value!");
		  }

      super.constructComponents();
      this.constructComponents();
      
      this.add(this.detailsComponent);
    }
    
    public void constructComponents() throws Exception {
      this.detailsComponent = new CFormField(this.detailsLabel, CFormField.VERTICAL);
    } // leave this method as it is
}
