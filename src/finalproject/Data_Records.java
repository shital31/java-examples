
package finalproject;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Data_Records extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    Home_Page homep=new Home_Page();
    JFrame Record=new JFrame("Administratve Page");

    void data(){


        JButton Update=new JButton("Update");
        Update.setBounds(150,365,100,30);
        Update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "123shital");
                    PreparedStatement pstu = con.prepareStatement("update admission set name=? where id = ?");
                    /*pstu.setString(1,name.getText());
                    pstu.setString(2, Id.getText());*/
                    pstu.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Updated Successfully");
                    con.close();

                }
                catch (Exception eu){
                    JOptionPane.showMessageDialog(null,eu);

                }

            }
        });

        JButton Delete=new JButton("Delete");
        Delete.setBounds(330,365,100,30);
        Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabse", "root", "123shital");
                    PreparedStatement pstd = con.prepareStatement("delete from Enquiry  where id = ?");
                    //pstd.setInt(1,Integer.parseInt(Id.getText()));
                    pstd.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
                    con.close();

                }
                catch (Exception ed){
                    JOptionPane.showMessageDialog(null,ed);

                }

            }
        });

        JButton Main=new JButton("Home");
        Main.setBounds(230,460,100,30);
        Main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd=e.getActionCommand();
                if(cmd.equals("Home")){
                    Record.dispose();
                    homep.Home.setVisible(true);

                }
            }
        });

        JButton Excel=new JButton("Export to Excel");
        Excel.setBounds(500,650,150,30);
        Excel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Record.add(Update);
        Record.add(Delete);
        Record.add(Main);
        Record.add(Excel);
        Record.setSize(800,900);
        Record.setLayout(null);
        Record.setVisible(true);
    }

}
