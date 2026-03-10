import javax.swing.*;
import java.awt.*;

public class RegistrationForm {

    public static void main(String[] args) {

        JFrame f = new JFrame("Registration Form");
        f.setSize(400,450);
        f.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30,30,100,30);

        JTextField t1 = new JTextField();
        t1.setBounds(150,30,150,30);

        JLabel l2 = new JLabel("Address:");
        l2.setBounds(30,80,100,30);

        JTextArea ta = new JTextArea();
        ta.setBounds(150,80,150,60);

        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(30,160,100,30);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(150,160,80,30);

        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(230,160,80,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l4 = new JLabel("Hobbies:");
        l4.setBounds(30,210,100,30);

        JCheckBox c1 = new JCheckBox("Reading");
        c1.setBounds(150,210,100,30);

        JCheckBox c2 = new JCheckBox("Sports");
        c2.setBounds(150,240,100,30);

        JButton b = new JButton("Submit");
        b.setBounds(150,300,100,30);

        ImageIcon img = new ImageIcon("logo.png");
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(300,10,80,80);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(ta);
        f.add(l3); f.add(r1); f.add(r2);
        f.add(l4); f.add(c1); f.add(c2);
        f.add(b);
        f.add(imgLabel);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}