import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice_Swing {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("LEARNING SWING");
        frame1.setSize(700, 600);

        JLabel label1 = new JLabel("This is label");
        frame1.add(label1);
        label1.setBounds(100, 170, 100, 40);


        JButton button1 = new JButton("Click me");
        frame1.add(button1);
        button1.setBounds(100, 100, 100, 50);

        JTextField jt1 = new JTextField();
        frame1.add(jt1);
        jt1.setBounds(100, 240, 200, 40);



        JPanel panel1 = new JPanel();
        frame1.add(panel1);
        panel1.setBounds(0, 0, 350, 300);
        panel1.setBackground(Color.BLUE);




        JLabel label2 = new JLabel("This is label 2");
        frame1.add(label2);
        label2.setBounds(450, 170, 100, 40);

        JButton button2 = new JButton("Click me");
        frame1.add(button2);
        button2.setBounds(450, 100, 100, 50);

        JButton button3 = new JButton("Panel3");
        frame1.add(button3);
        button3.setBounds(350, 400, 100, 40);

        JPanel panel3 = new JPanel();
        frame1.add(panel3);
        panel3.setBounds(0, 300, 700, 300);

        JTextField jt2 = new JTextField();
        frame1.add(jt2);
        jt2.setBounds(400, 240, 200, 40);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt2.setText("Clicked from panel 1");
                panel3.setBackground(Color.BLUE);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt1.setText("Clicked from Panel 2.");
                panel3.setBackground(Color.green);
            }
        });

        JPanel panel2 = new JPanel();
        frame1.add(panel2);
        panel2.setBounds(350, 0, 350, 300);
        panel2.setBackground(Color.GREEN);




        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                panel3.setBackground(Color.MAGENTA);
            }
        });

        frame1.setLayout(null);
        frame1.setVisible(true);

    }
}
