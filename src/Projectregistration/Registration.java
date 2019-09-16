package Projectregistration;

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
        JMenu Enquiry,Admission;
        JMenuBar mb = new JMenuBar();
        Admission = new JMenu("Admission");
        Enquiry = new JMenu("Enquiry");
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
        frame.add(mb);
        frame.setJMenuBar(mb);
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
