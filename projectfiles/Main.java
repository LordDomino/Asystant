package projectfiles;

import projectfiles.gui.SLoginScreen;
import java.awt.SplashScreen;

public class Main {
  public static void main(String args[]) throws Exception {

    SplashScreen ss = SplashScreen.getSplashScreen();

    final SLoginScreen SCREEN_LOGIN = new SLoginScreen();
    SCREEN_LOGIN.packFinalize();
  }
}
