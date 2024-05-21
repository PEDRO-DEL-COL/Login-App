package GUI;

import constants.CommonConstants;

import javax.swing.*;

public class LoginGUI extends JFrame{
    public LoginGUI(){
        super(CommonConstants.APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(CommonConstants.FRAME_SIZE[0], CommonConstants.FRAME_SIZE[1]);
        setLocationRelativeTo(null);
        
        addGUIComponents();
    }

    public void addGUIComponents(){
        SpringLayout springLayout = new SpringLayout();
        JPanel LoginPanel = new JPanel();
        LoginPanel.setLayout(springLayout);

        //username
        JLabel usernamLabel = new JLabel("Username: ");
        JTextField usernameField = new JTextField(CommonConstants.TEXTFIELD_SIZE);

        LoginPanel.add(usernamLabel);
        LoginPanel.add(usernameField);

        this.getContentPane().add(LoginPanel);

        //password
        
    }
}
