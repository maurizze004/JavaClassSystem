import java.awt.*;
import javax.swing.*;

public class LogIn extends JFrame{

    JFrame jf = new JFrame();
    JButton back = new JButton("Back");
    JButton logIn = new JButton("Log In now");
    JLabel passwdLabel = new JLabel("Password: ");
    JLabel userLabel = new JLabel("User: ");
    JPanel panel = new JPanel();
    JTextField userText = new JTextField(20);
    JPasswordField passWord = new JPasswordField(20);

    public LogIn() {

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(350, 180);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setTitle("Log in now");
        panel.setLayout(null);

        userLabel.setBounds(25, 30, 80, 25);
        userLabel.setForeground(Color.BLACK);
        userLabel.setFont(userLabel.getFont().deriveFont((float) 15));
        userText.setBounds(110, 30, 165, 25);

        passwdLabel.setBounds(25, 55, 80, 25);
        passwdLabel.setForeground(Color.BLACK);
        passwdLabel.setFont(passwdLabel.getFont().deriveFont((float) 15));
        passWord.setBounds(110, 55, 165, 25);

        logIn.setFont(logIn.getFont().deriveFont((float) 15.5));
        logIn.setOpaque(true);
        logIn.setBorderPainted(false);
        logIn.setForeground(Color.WHITE);
        logIn.setBackground(Color.BLUE);
        logIn.setBounds(20, 105, 150, 25);
        logIn.addActionListener(e -> {
            String un = userText.getText();
            char[] pw = passWord.getPassword();
            String pW = new String(pw);

            if (un.isEmpty() || pW.isEmpty()){
                if (un.isEmpty() && pW.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You have empty fields!", "Login error", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (un.equals("Hello")){
                InView iv = new InView();
                System.out.println("Welcome");
                iv.setVisible(true);
                iv.dispose();
                jf.dispose();
            }
        });

        back.setOpaque(true);
        back.setBorderPainted(false);
        back.setFont(back.getFont().deriveFont((float) 15.5));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLUE);
        back.setBounds(200, 105, 100, 25);
        back.addActionListener(e -> {
            System.out.println("Back - Button toggled");
            StartScreen startScreen = new StartScreen();
            startScreen.setVisible(true);
            startScreen.dispose();
            jf.dispose();
            System.out.println("Went back");
        });

        panel.add(userLabel);
        panel.add(logIn);
        panel.add(userText);
        panel.add(passwdLabel);
        panel.add(back);
        panel.add(passWord);
        jf.add(panel);
        jf.setVisible(true);
    }

}