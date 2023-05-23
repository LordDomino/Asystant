package projectfiles.gui.testings;

import java.awt.FlowLayout;

import projectfiles.gui.GUI_LoginBox;

public class test_FormLogin {

    public static void main(String args[]) throws Exception {
        TestFrame mainFrame = new TestFrame();
        mainFrame.setLayout(new FlowLayout());
        
        // GUI_LoginBox
        GUI_LoginBox formLogin1 = new GUI_LoginBox("Login to Asystant", "Password", "Submit", new String[]{"Access name"});

        mainFrame.add(formLogin1);

        mainFrame.packFinalize();
    }
    
}
