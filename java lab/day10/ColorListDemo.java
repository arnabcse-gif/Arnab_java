import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorListDemo implements ActionListener {

    JFrame f;
    JList list;
    JPanel panel;
    JButton btn;

    String colors[] = {"Red","Green","Blue","Yellow"};

    ColorListDemo(){

        f = new JFrame("Color Change");

        list = new JList(colors);
        list.setBounds(20,30,100,80);

        btn = new JButton("Change Color");
        btn.setBounds(20,120,120,30);

        panel = new JPanel();
        panel.setBounds(150,30,200,200);

        btn.addActionListener(this);

        f.add(list);
        f.add(btn);
        f.add(panel);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String c = (String) list.getSelectedValue();

        if(c.equals("Red"))
            panel.setBackground(Color.RED);

        if(c.equals("Green"))
            panel.setBackground(Color.GREEN);

        if(c.equals("Blue"))
            panel.setBackground(Color.BLUE);

        if(c.equals("Yellow"))
            panel.setBackground(Color.YELLOW);
    }

    public static void main(String[] args){
        new ColorListDemo();
    }
}