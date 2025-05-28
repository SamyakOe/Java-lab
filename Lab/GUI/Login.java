package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Login Form");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel =new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel username=new JLabel("Enter Username:");
        JTextField usernameField=new JTextField(15);
        JLabel password=new JLabel("Enter Password:");
        JPasswordField passwordField=new JPasswordField(15);
        JButton submitBtn=new JButton("Submit");
        JLabel result=new JLabel();
        
        submitBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    
                        String user=usernameField.getText();
                        String pswd=new String(passwordField.getPassword());
                        if(user.equals("admin")&&pswd.equals("123")){
                            result.setText("Login Successfull");
                        }
                        else{
                            result.setText("Login not Successfull. Please try again");
                        }
                
                }
        });

        usernameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        passwordField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        username.setAlignmentX(Component.CENTER_ALIGNMENT);
        usernameField.setAlignmentX(Component.CENTER_ALIGNMENT);
        password.setAlignmentX(Component.CENTER_ALIGNMENT);
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);
        submitBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        result.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(username);
        panel.add(usernameField);
        panel.add(Box.createVerticalStrut(10)); 
        panel.add(password);
        panel.add(passwordField);
        panel.add(Box.createVerticalStrut(10));
        panel.add(submitBtn);
        panel.add(Box.createVerticalStrut(10));
        panel.add(result);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
