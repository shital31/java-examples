package javaproject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        JFrame framelogin = new JFrame();

        JTextField username = new JTextField();
        username.setBounds(180,180,180,30);
        JLabel usernamelable = new JLabel("Username");
        usernamelable.setBounds(50,180,180,30);

        JTextField password = new JTextField();
        password.setBounds(180,220,180,30);
        JLabel passwordlable = new JLabel("Password");
        passwordlable.setBounds(50,220,180,30);

        JButton loginbutton = new JButton("Login");
        loginbutton.setBounds(120,350,180,30);

        framelogin.add(usernamelable);
        framelogin.add(username);
        framelogin.add(passwordlable);
        framelogin.add(password);
        framelogin.add(loginbutton);

        framelogin.setSize(450,600);
        framelogin.setLayout(null);
        framelogin.setVisible(true);

    }
}
