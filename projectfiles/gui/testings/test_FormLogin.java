package projectfiles.gui.testings;

import java.awt.FlowLayout;

import projectfiles.components.CFormLogin;

public class test_FormLogin {

    public static void main(String args[]) throws Exception {
        TestFrame mainFrame = new TestFrame();
        mainFrame.setLayout(new FlowLayout());

        //CFormLogin
        CFormLogin formLogin1 = new CFormLogin("Login", CFormLogin.VERTICAL);

        mainFrame.add(formLogin1);

        mainFrame.packFinalize();
    }
    
}
