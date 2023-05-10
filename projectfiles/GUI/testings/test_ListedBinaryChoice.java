package projectfiles.gui.testings;

import projectfiles.components.CDetailedFormField;
import projectfiles.components.CDetailedListedBinaryChoice;
import projectfiles.components.CListedBinaryChoice;

public class test_ListedBinaryChoice {
  public static void main(String args[]) throws Exception {
    TestFrame tf = new TestFrame();

    CListedBinaryChoice lbc = new CListedBinaryChoice("Choice 1", "Choice 2",
      "Questions are called \"prompts\"",
      "Each question is aligned with a choice 1 vs choice 2 component",
      "Is Java coding easy?", "Another question in here!");

    CDetailedListedBinaryChoice dlbc = new CDetailedListedBinaryChoice("Choice 1", "Choice 2",
      "Details label",
      "Each question is aligned with a choice 1 vs choice 2 component",
      "Is Java coding easy?", "Another question in here!");

    dlbc.overrideField(0, new CDetailedFormField("Label 1", "Label 2"));

    tf.add(lbc);
    tf.add(dlbc);
    tf.packFinalize();
  }
}
