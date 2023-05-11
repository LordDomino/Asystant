package projectfiles.components;

import projectfiles.gui.styles.Fonts;

public class CQuestionLabel extends CLabel {
  public CQuestionLabel(String question) {
    super(question);
    this.setFont(Fonts.DEFAULT_FORMQUESTION);
  }
}
