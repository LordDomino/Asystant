package projectfiles.gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import projectfiles.Config;
import projectfiles.gui.styles.Colors;

public class SLogin extends Screen {

  private static final String title = "Login - Records Asystant";
  private static final Image icon = new ImageIcon("projectfiles/gui/graphics/icon.png").getImage();

  GridBagConstraints gbc = new GridBagConstraints();

  public SLogin() throws Exception {
    super(title, icon);

    // Login area
    JPanel loginArea = new JPanel();
    loginArea.setOpaque(true);
    loginArea.setBackground(Colors.BACKGROUND_ACCENT_LIGHT);
    loginArea.setLayout(new GridBagLayout());

    // Product logo
    GUI_ProductLogo loginLogo = new GUI_ProductLogo(400);
    
    // Product subtitle
    JLabel subtitle = new JLabel("A system assistant for health profile records management");
    subtitle.setFont(new Font("Arial", Font.PLAIN, 14));
    
    // Entire login box
    GUI_LoginBox loginBox = new GUI_LoginBox("Login", "Password", "Submit", new String[]{"Access name"});
    
    // The login card is the entire column to contain all the graphics
    JPanel loginCard = new JPanel();
    loginCard.setLayout(new GridBagLayout());
    loginCard.setBackground(Colors.BACKGROUND_ACCENT_MID);
    loginCard.setBorder(new MatteBorder(0, 2, 0, 2, Colors.WHITE));
    
    // The logoContainer contains both the product logo and the subtitle
    JPanel logoContainer = new JPanel();
    logoContainer.setOpaque(false);
    logoContainer.setLayout(new GridBagLayout());
    logoContainer.setBorder(BorderFactory.createEmptyBorder(0, 50, 50, 50));

    // The loginBoxContainer contains the horiztonal area of login
    JPanel loginBoxContainer = new JPanel();
    loginBoxContainer.setBackground(Colors.BACKGROUND_ACCENT_DARK);

    // Footer
    JLabel footer = new JLabel(Config.INFO_PRODUCT_STATUS + " v" + Config.INFO_VERSION + "  |  " + Config.INFO_CREDITS);
    footer.setFont(new Font("Arial", Font.PLAIN, 12));
    footer.setOpaque(true);
    footer.setBackground(Colors.FOOTER);
    footer.setForeground(Colors.FOOTER_TEXT);
    int footerPadding = 5;
    footer.setBorder(BorderFactory.createEmptyBorder(footerPadding, footerPadding, footerPadding, footerPadding));

    // Add all the components
    GridBagConstraints gbc_logoContainer = new GridBagConstraints();
    gbc_logoContainer.gridy = 0; gbc_logoContainer.insets.top = 10;
    logoContainer.add(loginLogo, gbc_logoContainer);
    gbc_logoContainer.gridy = 1;
    logoContainer.add(subtitle, gbc_logoContainer);

    loginBoxContainer.add(loginBox);

    GridBagConstraints gbc_loginCard = new GridBagConstraints();

    gbc_loginCard.anchor = GridBagConstraints.SOUTH;
    gbc_loginCard.gridy = 1;
    loginCard.add(logoContainer, gbc_loginCard);
    
    gbc_loginCard.fill = GridBagConstraints.HORIZONTAL;
    gbc_loginCard.anchor = GridBagConstraints.NORTH;
    gbc_loginCard.gridy = 2;
    loginCard.add(loginBoxContainer, gbc_loginCard);

    GridBagConstraints gbc_loginArea = new GridBagConstraints();

    gbc_loginArea.fill = GridBagConstraints.BOTH;
    gbc_loginArea.weighty = 1;
    loginArea.add(loginCard, gbc_loginArea);

    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1;
    gbc.weighty = 1;
    gbc.gridy = 0;
    add(loginArea, gbc);

    gbc.weighty = 0;
    gbc.gridy = 1;
    add(footer, gbc);
  }
}
