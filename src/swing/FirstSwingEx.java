package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSwingEx {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame 1");
        JFrame f2 = new JFrame("Frame 2");
        f.setSize(500, 500);
        JLabel label1 = new JLabel("This is Label 1");
        label1.setBounds(75, 62, 100, 30);

        f.add(label1);
        JButton b1 = new JButton("Change");
        b1.setBounds(75, 80, 100, 40); // set width, height
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s= label1.getText();
                Frame f2=new Frame();


            }
        });
        f2.setSize(500, 500);
        JLabel l1 = new JLabel("This is Label 1");
        label1.setBounds(75, 62, 100, 30);

        f.add(l1);
        JButton b2 = new JButton("Change");
        b1.setBounds(75, 80, 100, 40); // set width, height
        f2.add(b2);


        /*JPanel panel1 = new JPanel();
        f.add(panel1);
        panel1.setBounds(0, 0 , 250, 250);
        panel1.setBackground(Color.BLUE);*/
       f.setLayout(null);
       f2.setLayout(null);








    }
}
