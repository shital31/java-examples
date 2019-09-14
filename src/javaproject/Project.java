package javaproject;

import javax.naming.Name;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Project extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        JFrame register = new JFrame();
        String gender[] = {"Male", "Female", "Other"};

        JTextField name = new JTextField();
        name.setBounds(180, 100, 180, 30);
        JLabel namelable = new JLabel("Full Name");
        namelable.setBounds(50, 100, 180, 30);

        JTextField mobileno = new JTextField();
        mobileno.setBounds(180, 140, 180, 30);
        JLabel mobilenolable = new JLabel("Mobile No");
        mobilenolable.setBounds(50, 140, 180, 30);

        JTextField address = new JTextField();
        address.setBounds(180, 180, 180, 30);
        JLabel addresslable = new JLabel("Address");
        addresslable.setBounds(50, 180, 180, 30);

        JTextField pincode = new JTextField();
        pincode.setBounds(180, 220, 180, 30);
        JLabel pincodelable = new JLabel("Pincode");
        pincodelable.setBounds(50, 220, 180, 30);

        JTextField email_id = new JTextField();
        email_id.setBounds(180, 260, 180, 30);
        JLabel email_idlable = new JLabel("Email_id");
        email_idlable.setBounds(50, 260, 180, 30);

        JComboBox genderbox = new JComboBox(gender);
        genderbox.setBounds(180, 300, 180, 30);
        JLabel genderboxlable = new JLabel("Gender");
        genderboxlable.setBounds(50, 300, 180, 30);

        JTextField username = new JTextField();
        username.setBounds(180, 340, 180, 30);
        JLabel usernamelable = new JLabel("Username");
        usernamelable.setBounds(50, 340, 180, 30);

        JTextField password = new JTextField();
        password.setBounds(180, 380, 180, 30);
        JLabel passwordlable = new JLabel("Password");
        passwordlable.setBounds(50, 380, 180, 30);

        JTextField cpassword = new JTextField();
        cpassword.setBounds(180, 420, 180, 30);
        JLabel cpasswordlable = new JLabel("Confirm Password");
        cpasswordlable.setBounds(50, 420, 180, 30);

        JButton button = new JButton("Submit");
        button.setBounds(160, 460, 100, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
                register.dispose();
            }
        });

        register.add(namelable);
        register.add(name);
        register.add(mobilenolable);
        register.add(mobileno);
        register.add(addresslable);
        register.add(address);
        register.add(pincodelable);
        register.add(pincode);
        register.add(email_idlable);
        register.add(email_id);
        register.add(genderboxlable);
        register.add(genderbox);
        register.add(button);
        register.add(usernamelable);
        register.add(username);
        register.add(passwordlable);
        register.add(password);
        register.add(cpasswordlable);
        register.add(cpassword);


        register.setSize(450, 600);
        register.setLayout(null);
        register.setVisible(true);
    }

    public static void login() {
        JFrame login = new JFrame();
        JTextField username = new JTextField();
        username.setBounds(180, 180, 180, 30);
        JLabel usernamelable = new JLabel("Username");
        usernamelable.setBounds(50, 180, 180, 30);

        JTextField password = new JTextField();
        password.setBounds(180, 220, 180, 30);
        JLabel passwordlable = new JLabel("Password");
        passwordlable.setBounds(50, 220, 180, 30);

        JButton loginbutton = new JButton("Login");
        loginbutton.setBounds(120, 350, 180, 30);
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jdbcconn();
                //finalframe();
                login.dispose();
            }
        });

        login.add(usernamelable);
        login.add(username);
        login.add(passwordlable);
        login.add(password);
        login.add(loginbutton);

        login.setSize(450, 600);
        login.setLayout(null);
        login.setVisible(true);
    }

    public static void jdbcconn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "123shital");
            Statement st = con.createStatement();
            PreparedStatement pst = con.prepareStatement("insert into roll_call_list values(?,?,?)");
            pst.setInt(1, 3);
            pst.setString(2, "Sagar");
            pst.setString(3, "BCS");
            pst.executeUpdate();
            ResultSet rs = st.executeQuery("select * from roll_call_list");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /*public static void finalframe(){
            JFrame Finalframe = new JFrame();
            JButton EtoE = new JButton("Export to Excel");
            EtoE.setBounds(80, 240, 150, 30);
            Finalframe.add(EtoE);
            Finalframe.setSize(400, 600);
            Finalframe.setLayout(null);
            Finalframe.setVisible(true);

        }*/


    }
}

