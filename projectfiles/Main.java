package projectfiles;

import projectfiles.gui.SLogin;

public class Main {

  static final int SCREEN_LOGIN_X = 960;
  static final int SCREEN_LOGIN_Y = 720;

  public static void main(String args[]) throws Exception {
    final SLogin SCREEN_LOGIN = new SLogin();
    SCREEN_LOGIN.finalizeAndShow(SCREEN_LOGIN_X, SCREEN_LOGIN_Y);
  }
}
