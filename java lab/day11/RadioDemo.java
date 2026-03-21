import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RadioDemo extends JFrame {

    JTextField t1;
    JButton b;
    JRadioButton r1, r2;
    JLabel l;

    public RadioDemo() {
        // Initializing components
        t1 = new JTextField(15);
        b = new JButton("Ok");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l = new JLabel("Greeting");

        // Grouping radio buttons so only one can be selected at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // Adding components to the JFrame
        add(t1);
        add(r1);
        add(r2);
        add(b);
        add(l);

        // Setting up the event listener for the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();

                if (r1.isSelected()) {
                    name = "Mr. " + name;
                } else {
                    name = "Ms. " + name;
                }

                l.setText(name);
            }
        });

        // Basic Window Settings
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new RadioDemo();
    }
}