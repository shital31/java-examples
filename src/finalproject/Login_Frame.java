package finalproject;

import javafx.scene.control.DatePicker;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Login_Frame extends JFrame implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    Data_Records records=new Data_Records();
    Home_Page home=new Home_Page();
    JFrame admin=new JFrame();
    void log()  {


                        JTextField User = new JTextField();
                       User.setBounds(150, 100, 200, 30);

                       JLabel UserName = new JLabel("UserName");
                       UserName.setBounds(50, 100, 150, 30);

                       JPasswordField Pass = new JPasswordField();
                       Pass.setEchoChar('*');
                       Pass.setBounds(150, 140, 200, 30);
                       JLabel passwordLabel = new JLabel("Password");
                       passwordLabel.setBounds(50, 140, 200, 30);
        JButton BackButton=new JButton("<<");
        BackButton.setBounds(50,200,80,30);
        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd=e.getActionCommand();
                if(cmd.equals("<<")){
                    admin.dispose();
                    home.Home.setVisible(true);



                }
            }
        });

                       JButton Login=new JButton("Login");
                       Login.setBounds(200,200,150,30);
                       Login.addActionListener(new ActionListener() {
                           @Override
                           public void actionPerformed(ActionEvent e) {

                               String user=User.getText();
                               String password=Pass.getText();
                               if (user.equals("sagar")&& password.equals("123456"))
                               {
                                   JOptionPane.showMessageDialog(admin, "Welcome");
                                   records.data();
                                   admin.dispose();



                               } else {
                                   JOptionPane.showMessageDialog(admin, "Invalid User!!");
                               }
                           }
                       });

                        admin.getContentPane().add(Login);
                        admin.getContentPane().add(BackButton);
                       admin.add(User);
                       admin.add(UserName);
                       admin.add(Pass);
                       admin.add(passwordLabel);
                       admin.add(Login);
                        admin.setSize(400,400);
                        admin.setLayout(null);
                        admin.setVisible(true);



    }
}
