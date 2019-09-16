package Projectregistration;

        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;

public class Form extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }

     void enquiry() {
        JFrame enquiry = new JFrame();
        JTextField name = new JTextField();
        name.setBounds(180,100,180,30);
        JLabel lname = new JLabel("Name");
        lname.setBounds(50,100,180,30);

        JLabel lid = new JLabel("Mobile_no");
        lid.setBounds(50,140,180,30);
        JTextField Id = new JTextField();
        Id.setBounds(180,140,180,30);

        JButton submit = new JButton("Submit");
        submit.setBounds(250,350,180,30);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usernew", "root", "123shital");
                    String u1 = name.getText();
                    String u2=Id.getText();
                    PreparedStatement pst = con.prepareStatement("insert  into shital values(?,?)");
                    pst.setString(1,u1);
                    pst.setString(2,u2);
                    pst.executeUpdate();
                    ResultSet rs=pst.executeQuery("select * from shital");
                    while(rs.next()){
                        System.out.println( rs.getString(1));
                    }
                    con.close();

                }
                catch (Exception ea){

                }

            }
        });
        enquiry.add(lname);
        enquiry.add(name);
        enquiry.add(Id);
        enquiry.add(lid);
        enquiry.add(submit);

        enquiry.setSize(450,600);
        enquiry.setLayout(null);
        enquiry.setVisible(true);
        enquiry.setVisible(true);
    }

}
