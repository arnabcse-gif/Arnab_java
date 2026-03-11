import java.awt.*;
import java.awt.event.*;

public class GUICalculator extends Frame implements ActionListener {

    TextField t;
    String num1="", num2="", op="";

    GUICalculator() {

        setLayout(new BorderLayout());

        t = new TextField();
        add(t, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(5,4));

        String btn[] = {
                "1","2","3","+",
                "4","5","6","-",
                "7","8","9","*",
                "/","0","%","=",
                "OFF"
        };

        for(String b : btn){
            Button bt = new Button(b);
            bt.addActionListener(this);
            p.add(bt);
        }

        add(p, BorderLayout.CENTER);

        setSize(300,300);
        setTitle("CALCULATOR");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();

        if(cmd.matches("[0-9]"))
            t.setText(t.getText()+cmd);

        else if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/") || cmd.equals("%")){
            num1 = t.getText();
            op = cmd;
            t.setText("");
        }

        else if(cmd.equals("=")){

            num2 = t.getText();

            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            double res=0;

            if(op.equals("+")) res = a+b;
            if(op.equals("-")) res = a-b;
            if(op.equals("*")) res = a*b;
            if(op.equals("/")) res = a/b;
            if(op.equals("%")) res = a%b;

            t.setText(""+res);
        }

        else if(cmd.equals("OFF")){
            System.exit(0);
        }
    }

    public static void main(String args[]){
        new GUICalculator();
    }
}