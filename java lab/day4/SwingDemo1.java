 package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class SwingDemo1 {
    public static void main(String[] args) {
    JFrame f = new JFrame("Addition & Substraction");
        f.setVisible(true);
        f.setSize(800, 400);
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Enter 1st number");
        f.add(l1);
        JTextField t1 = new JTextField(10);
        f.add(t1);

        JLabel l2 = new JLabel("Enter 2nd number");
        f.add(l2);
        JTextField t2 = new JTextField(10);
        f.add(t2);

        JButton add = new JButton("Add");
        f.add(add);
        JButton Subs = new JButton("Sub");
        f.add(Subs);

        JLabel result = new JLabel("Result:");
        f.add(result);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;

                result.setText(" result = " + c);
            }

        });
        Subs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;

                result.setText("result = " + c);
            }

        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
