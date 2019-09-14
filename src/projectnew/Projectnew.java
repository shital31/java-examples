package projectnew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Projectnew extends JFrame implements ActionListener {
    private static Connection con;

    @Override
    public void actionPerformed(ActionEvent e) {



    }

    public static void main(String args[]) {
        Projectnew r=new Projectnew();
        r.frame();
        r.connect();
    }
    public static void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/record", "root", "123shital");
            Statement st=con.createStatement();
           // Class.forName("jdbc.odbc.JdbcOdbcDriver");
            //con = DriverManager.getConnection("jdbc:odbc:sd","","monika");
            //Statement st = (Statement) con.createStatement();
            String str = "insert into record values('&userName','&passWord')";
            PreparedStatement pst = con.prepareStatement("insert into roll_call_list values(?,?,?)");
            pst.setString(1,"username");
            pst.setString(2,"password");
            //pst.setString(3,"BCS");
            pst.executeUpdate(String.valueOf(pst));
            st.executeUpdate(str);
        } catch (Exception ex) {
        }
    }
    public static void frame()
    {
        JFrame f=new JFrame ("Login");
        JTextField f1=new JTextField(30);
        JTextField f2=new JTextField(30);
        JLabel l1 = new JLabel("username");
       JLabel l2=new JLabel("password");
        JButton b1=new JButton("submit");
        f.setLayout(new GridLayout(3,2));
        f.add(l1);
        f.add(f1);
        f.add(l2);
        f.add(f2);
        f.add(b1);
        f.setVisible(true);
        f.pack();
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String userName=l1.getText();
                String passWord=l2.getText();
                connect();
            }
        });
    }
}
  /*  public static void main (String args[]){
        JFrame regi = new JFrame();
         JTextField name = new JTextField();
         name.setBounds(180,100,130,30);
         JLabel lname = new JLabel("Name");
         lname.setBounds(50,100,130,30);

         JTextField id = new JTextField();
         id.setBounds(180,140,130,30);
         JLabel lid = new JLabel("Id");
         lid.setBounds(50,140,130,30);

          regi.add(lname);
          regi.add(name);
          regi.add(lid);
          regi.add(id);
         regi.setSize(400,600);
         regi.setLayout(null);
         regi.setVisible(true);

    }*/

