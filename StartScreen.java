import javax.swing.*;
import java.awt.*;

public class StartScreen extends JFrame{

    public StartScreen(){
        JFrame jf = new JFrame();
        JLabel info = new JLabel("Welcome to Class - Control - Center");
        JButton register = new JButton("Register");
        JButton logIn = new JButton("Log in");
        JButton close = new JButton("Close and go");

        jf.setSize(350, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("Start");
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new GridLayout(4,3));

        info.setHorizontalAlignment(SwingConstants.CENTER);
        info.setVerticalAlignment(SwingConstants.CENTER);

        register.addActionListener(e -> {
            Register reg = new Register();
            reg.setVisible(true);
            reg.dispose();
            jf.dispose();
        });
        logIn.addActionListener(e -> {
            LogIn log = new LogIn();
            log.setVisible(true);
            log.dispose();
            jf.dispose();
        });
        close.addActionListener(e -> {
            System.out.println("Goodbye");
            jf.dispose();
        });

        jf.add(info);
        jf.add(register);
        jf.add(logIn);
        jf.add(close);
        jf.setVisible(true);
    }
}
