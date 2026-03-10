import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColorDemo implements ActionListener {

    JFrame f;
    JComboBox r,g,b;
    JPanel panel;
    JButton btn;

    RGBColorDemo(){

        f = new JFrame("RGB Color");

        Integer values[] = new Integer[256];
        for(int i=0;i<256;i++)
            values[i]=i;

        r = new JComboBox(values);
        g = new JComboBox(values);
        b = new JComboBox(values);

        r.setBounds(80,30,80,30);
        g.setBounds(80,70,80,30);
        b.setBounds(80,110,80,30);

        JLabel lr = new JLabel("Red");
        JLabel lg = new JLabel("Green");
        JLabel lb = new JLabel("Blue");

        lr.setBounds(20,30,50,30);
        lg.setBounds(20,70,50,30);
        lb.setBounds(20,110,50,30);

        btn = new JButton("Show Output");
        btn.setBounds(40,160,120,30);

        panel = new JPanel();
        panel.setBounds(200,30,200,200);

        btn.addActionListener(this);

        f.add(lr); f.add(lg); f.add(lb);
        f.add(r); f.add(g); f.add(b);
        f.add(btn);
        f.add(panel);

        f.setLayout(null);
        f.setSize(450,300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        int red = (int) r.getSelectedItem();
        int green = (int) g.getSelectedItem();
        int blue = (int) b.getSelectedItem();

        panel.setBackground(new Color(red,green,blue));
    }

    public static void main(String[] args){
        new RGBColorDemo();
    }
}