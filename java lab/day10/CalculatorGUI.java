import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI implements ActionListener {

    JFrame f;
    JTextField t1,t2,t3;
    JButton add,sub,mul,reset;

    CalculatorGUI(){

        f = new JFrame("Calculator");
        f.setLayout(null);
        f.setSize(350,300);

        JLabel l1 = new JLabel("Enter First Number");
        l1.setBounds(20,30,150,30);

        JLabel l2 = new JLabel("Enter Second Number");
        l2.setBounds(20,70,150,30);

        JLabel l3 = new JLabel("Result");
        l3.setBounds(20,110,150,30);

        t1 = new JTextField();
        t1.setBounds(170,30,100,30);

        t2 = new JTextField();
        t2.setBounds(170,70,100,30);

        t3 = new JTextField();
        t3.setBounds(170,110,100,30);

        add = new JButton("Add");
        sub = new JButton("Sub");
        mul = new JButton("Multiply");
        reset = new JButton("Reset");

        add.setBounds(20,160,70,30);
        sub.setBounds(100,160,70,30);
        mul.setBounds(180,160,90,30);
        reset.setBounds(120,200,80,30);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        reset.addActionListener(this);

        f.add(l1); f.add(l2); f.add(l3);
        f.add(t1); f.add(t2); f.add(t3);
        f.add(add); f.add(sub); f.add(mul); f.add(reset);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if(e.getSource()==add)
            t3.setText(String.valueOf(a+b));

        if(e.getSource()==sub)
            t3.setText(String.valueOf(a-b));

        if(e.getSource()==mul)
            t3.setText(String.valueOf(a*b));

        if(e.getSource()==reset){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String[] args){
        new CalculatorGUI();
    }
}