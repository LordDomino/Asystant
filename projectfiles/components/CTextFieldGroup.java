package projectfiles.components;

public class CTextFieldGroup extends CFieldGroup {

  String groupLabel = null;
  String[] fieldLabels;
  CLabel groupLabelComponent;

  public CTextFieldGroup(String[] fieldLabels) throws Exception {
    super();
    this.fieldLabels = fieldLabels;

    this.constructComponents();
  }

  public CTextFieldGroup(String groupLabel, String[] fieldLabels) throws Exception {
    super();
    this.groupLabel = groupLabel;
    this.fieldLabels = fieldLabels;

    this.constructComponents();
  }

  private void constructComponents() throws Exception {

    if (groupLabel != null) {
      this.groupLabelComponent = new CLabel(this.groupLabel);
      this.add(groupLabelComponent);
    }

    for (String fieldLabel : this.fieldLabels) {
      CFormField formField = new CFormField(fieldLabel, CFieldGroup.VERTICAL);
      this.add(formField);
    }
  }
}
