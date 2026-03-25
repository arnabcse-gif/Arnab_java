import javax.swing.*;
import java.awt.event.*;

class AnimationApp extends JFrame implements ActionListener, Runnable {

    JLabel imgLabel, msgLabel;
    JButton startBtn, stopBtn;

    Thread t;
    boolean running = false;

    String[] messages = {"Welcome", "Enjoy", "Thanks", "Visit Again"};
    int msgIndex = 0;

    public AnimationApp() {
        setTitle("Swing Animation");
        setSize(500, 500);
        setLayout(null);

        imgLabel = new JLabel(new ImageIcon("image.png")); // put your image here
        imgLabel.setBounds(50, 50, 100, 100);

        msgLabel = new JLabel("Welcome");
        msgLabel.setBounds(200, 50, 150, 30);

        startBtn = new JButton("Start Animation");
        stopBtn = new JButton("Stop Animation");

        startBtn.setBounds(100, 400, 150, 30);
        stopBtn.setBounds(260, 400, 150, 30);

        add(imgLabel);
        add(msgLabel);
        add(startBtn);
        add(stopBtn);

        startBtn.addActionListener(this);
        stopBtn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) {
            if (!running) {
                running = true;
                t = new Thread(this);
                t.start();
            }
        } else {
            running = false;
        }
    }

    public void run() {
        int x = 50, y = 50;

        while (running) {

            // Move Right
            for (int i = 0; i < 200; i++) {
                imgLabel.setLocation(x + i, y);
                updateMessage();
                sleep();
            }

            // Move Down
            for (int i = 0; i < 200; i++) {
                imgLabel.setLocation(x + 200, y + i);
                updateMessage();
                sleep();
            }

            // Move Left
            for (int i = 200; i > 0; i--) {
                imgLabel.setLocation(x + i, y + 200);
                updateMessage();
                sleep();
            }

            // Move Up
            for (int i = 200; i > 0; i--) {
                imgLabel.setLocation(x, y + i);
                updateMessage();
                sleep();
            }
        }
    }

    void updateMessage() {
        msgLabel.setText(messages[msgIndex]);
        msgIndex = (msgIndex + 1) % messages.length;
    }

    void sleep() {
        try {
            Thread.sleep(1000); // 10 ms gap
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        new AnimationApp();
    }
}