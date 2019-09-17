package Projectregistration;

import javax.security.auth.Subject;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame implements ActionListener {
    //String Name,Mobile_no,Address,
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        Form form = new Form();
        JFrame frame = new JFrame();
        JMenu Enquiry,Admission,Subject;
        JMenuBar mb = new JMenuBar();
        Admission = new JMenu("Admission");
        Enquiry = new JMenu("Enquiry");
        Subject = new JMenu("Subject");
        JMenuItem java=new JMenuItem("Java");
        JMenuItem spring= new JMenuItem("Springboot");
        JMenuItem android = new JMenuItem("Android");
        Subject.add(java);
        Subject.add(spring);
        Subject.add(android);

        Enquiry.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                form.enquiry();
                frame.dispose();
                form.setVisible(true);

            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        mb.add(Enquiry);
        mb.add(Admission);
        mb.add(Subject);
        frame.add(mb);
        frame.setJMenuBar(mb);
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
