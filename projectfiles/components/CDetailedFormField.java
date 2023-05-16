package projectfiles.components;

import java.awt.FlowLayout;

public class CDetailedFormField extends CFieldGroup {

  String[] labels;

  public CDetailedFormField(String ... labels) throws Exception {
    this.labels = labels;
    this.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));

    for (String label : this.labels) {
      CLabelledTextField formField = new CLabelledTextField(label, CFieldGroup.HORIZONTAL);

      this.add(formField);
    }
  }
}
