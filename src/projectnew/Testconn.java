package projectnew;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static projectnew.Projectnew.connect;

public class Testconn extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        JFrame framelogin = new JFrame();

        JTextField username = new JTextField();
        username.setBounds(180, 180, 180, 30);
        JLabel usernamelable = new JLabel("Username");
        usernamelable.setBounds(50, 180, 180, 30);

        JTextField id = new JTextField();
        id.setBounds(180, 220, 180, 30);
        JLabel idlable = new JLabel("Id");
        idlable.setBounds(50, 220, 180, 30);

        JButton loginbutton = new JButton("Login");
        loginbutton.setBounds(30, 350, 100, 30);
        JButton editbutton = new JButton("Edit");
        editbutton.setBounds(250,350,100,30);
        editbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame editFrame=new JFrame();
                JTextField username = new JTextField();
                username.setBounds(180, 180, 180, 30);
                JLabel usernamelable = new JLabel("Username");
                usernamelable.setBounds(50, 180, 180, 30);

                JTextField id = new JTextField();
                id.setBounds(180, 220, 180, 30);
                JLabel idlable = new JLabel("Id");
                idlable.setBounds(50, 220, 180, 30);
                editFrame.add(username);
                editFrame.add(usernamelable);
                editFrame.add(id);
                editFrame.add(idlable);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usernew", "root", "123shital");
                    /*JButton search=new JButton("Search");
                    search.setBounds(50,260,180,30);
                    JTextField searchText=new JTextField();
                    searchText.setBounds(180,260,180,30);
                    editFrame.add(search);
                    editFrame.add(searchText);
                    Integer id1= Integer.valueOf(searchText.getText());
                    Statement st=con.createStatement();
                    st.executeUpdate();*/
                    String u1 = username.getText();
                    String u2=id.getText();
                    PreparedStatement pst = con.prepareStatement("insert  into shital values(?,?)");
                    pst.setString(1,u1);
                    pst.setString(2,u2);
                    pst.executeUpdate();
                    ResultSet rs=pst.executeQuery("select * from shital");
                    while(rs.next()){
                        System.out.println( rs.getString(1));
                    }
                    con.close();

                } catch (Exception em) {
                    System.out.println("not able to insert data");

                }
                editFrame.setSize(450, 600);
                editFrame.setLayout(null);
                editFrame.setVisible(true);
                framelogin.dispose();
            }
        });
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usernew", "root", "123shital");
                    String u1 = username.getText();
                    String u2=id.getText();
                    PreparedStatement pst = con.prepareStatement("insert  into shital values(?,?)");
                    pst.setString(1,u1);
                    pst.setString(2,u2);
                    pst.executeUpdate();
                    ResultSet rs=pst.executeQuery("select * from shital");
                    while(rs.next()){
                        System.out.println( rs.getString(1));
                    }
                    con.close();

                              } catch (Exception em) {
                    System.out.println("not able to insert data");

                }
            }
        });

        framelogin.add(usernamelable);
        framelogin.add(username);
        framelogin.add(id);
        framelogin.add(idlable);
        framelogin.add(loginbutton);
        framelogin.add(editbutton);
        framelogin.setSize(450, 600);
        framelogin.setLayout(null);
        framelogin.setVisible(true);


    }
}