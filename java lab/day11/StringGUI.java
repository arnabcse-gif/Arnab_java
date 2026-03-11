import java.awt.*;
import java.awt.event.*;

public class StringGUI extends Frame implements ActionListener {

    TextField t1,t2;
    Button caps, small, reverse, vowels, words, letters, reset;

    StringGUI(){

        setLayout(null);

        Label l1 = new Label("Enter the string:");
        l1.setBounds(50,80,120,30);

        t1 = new TextField();
        t1.setBounds(200,80,300,30);

        Label l2 = new Label("String in upper case:");
        l2.setBounds(50,140,150,30);

        t2 = new TextField();
        t2.setBounds(200,140,300,30);

        caps = new Button("IN CAPS");
        caps.setBounds(50,250,80,30);

        small = new Button("IN SMALL");
        small.setBounds(150,250,80,30);

        reverse = new Button("REVERSE");
        reverse.setBounds(250,250,80,30);

        vowels = new Button("VOWELS");
        vowels.setBounds(350,250,80,30);

        words = new Button("WORDS");
        words.setBounds(450,250,80,30);

        letters = new Button("LETTERS");
        letters.setBounds(550,250,80,30);

        reset = new Button("RESET");
        reset.setBounds(300,320,80,30);

        caps.addActionListener(this);
        small.addActionListener(this);
        reverse.addActionListener(this);
        vowels.addActionListener(this);
        words.addActionListener(this);
        letters.addActionListener(this);
        reset.addActionListener(this);

        add(l1); add(l2);
        add(t1); add(t2);
        add(caps); add(small); add(reverse);
        add(vowels); add(words); add(letters);
        add(reset);

        setSize(700,450);
        setTitle("My Frame");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String s = t1.getText();

        if(e.getSource()==caps)
            t2.setText(s.toUpperCase());

        if(e.getSource()==small)
            t2.setText(s.toLowerCase());

        if(e.getSource()==reverse)
            t2.setText(new StringBuffer(s).reverse().toString());

        if(e.getSource()==vowels){

            int count=0;
            for(char c:s.toLowerCase().toCharArray())
                if("aeiou".indexOf(c)>=0)
                    count++;

            t2.setText("Vowels = "+count);
        }

        if(e.getSource()==words)
            t2.setText("Words = "+s.split("\\s+").length);

        if(e.getSource()==letters)
            t2.setText("Letters = "+s.replace(" ","").length());

        if(e.getSource()==reset){
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String args[]){
        new StringGUI();
    }
}