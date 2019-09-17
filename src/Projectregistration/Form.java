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
        JFrame enquiry = new JFrame("Enquiry");
        JTextField name = new JTextField();
        name.setBounds(180,100,180,30);
        JLabel lname = new JLabel("Name");
        lname.setBounds(50,100,180,30);

        JLabel lid = new JLabel("Id");
        lid.setBounds(50,140,180,30);
        JTextField Id = new JTextField();
        Id.setBounds(180,140,180,30);

        JButton delete = new JButton("Delete");
        delete.setBounds(310,350,100,30);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usernew", "root", "123shital");
                    PreparedStatement pst = con.prepareStatement("delete from shital  where id = ?");
                    pst.setInt(1,Integer.parseInt(Id.getText()));
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
                    con.close();

                }
                catch (Exception ed){
                    JOptionPane.showMessageDialog(null,ed);

                }

            }
        });



        JButton update = new JButton("Update");
        update.setBounds(180,350,100,30);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usernew", "root", "123shital");
                    PreparedStatement pst = con.prepareStatement("update shital set name=? where id = ?");
                    pst.setString(1,name.getText());
                    pst.setString(2, Id.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Updated Successfully");
                    con.close();

                }
                catch (Exception eu){
                    JOptionPane.showMessageDialog(null,eu);

                }

            }
        });

        JButton submit = new JButton("Submit");
        submit.setBounds(50,350,100,30);
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
                    JOptionPane.showMessageDialog(null,"Record Updated Successfully");

                    con.close();

                }
                catch (Exception ea){
                    JOptionPane.showMessageDialog(null,ea);

                }

            }
        });
        enquiry.add(lname);
        enquiry.add(name);
        enquiry.add(Id);
        enquiry.add(lid);
        enquiry.add(submit);
        enquiry.add(update);
        enquiry.add(delete);

        enquiry.setSize(450,600);
        enquiry.setLayout(null);
        enquiry.setVisible(true);
        enquiry.setVisible(true);
        enquiry.add(getName());
    }

}
