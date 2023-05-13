package projectfiles.gui.testings;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;

import projectfiles.gui.formSections.*;

public class test_Form {
  public static void main(String args[]) throws Exception {
    TestFrame mainFrame = new TestFrame();
    TestPanel form = new TestPanel();
    mainFrame.setLayout(new BorderLayout());
        
    form.add(new SectionA());
    form.add(new SectionB());
    form.add(new SectionC());
    form.add(new SectionD());
    form.add(new SectionE());
    form.add(new SectionF());
    form.add(new SectionG());
    
    JScrollPane scrollPane = new JScrollPane(form);

    mainFrame.add(scrollPane, BorderLayout.CENTER);
    mainFrame.packFinalize();
  }
}
