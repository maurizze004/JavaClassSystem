import javax.swing.*;
import java.awt.*;

public class Register extends JFrame {

    public Register(){

        JFrame jf = new JFrame();
        JButton register = new JButton("Register now");
        JButton back = new JButton("Back");
        JLabel password = new JLabel("Password");
        JLabel blank = new JLabel("  ");
        JLabel name = new JLabel("Full Name");
        JLabel className = new JLabel("Classname");
        JLabel size = new JLabel("Class-size");
        JLabel username = new JLabel("Username");
        JTextField name2 = new JTextField(20);
        JTextField classname2 = new JTextField(10);
        JTextField size2 = new JTextField(2);
        JTextField username2 = new JTextField(20);
        JPasswordField password2 = new JPasswordField(50);

        jf.setSize(400,325);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setTitle("Register");

        name.setBounds(30,15,75,25);
        name2.setBounds(150, 15, 200, 25);
        className.setBounds(30,60,75,25);
        classname2.setBounds(150, 60, 200, 25);
        size.setBounds(30,105,75,25);
        size2.setBounds(150, 105, 200, 25);
        username.setBounds(30,150,75,25);
        username2.setBounds(150, 150, 200, 25);
        password.setBounds(30, 195, 75, 25);
        password2.setBounds(150, 195, 200, 25);
        blank.setBounds(60, 15, 20,20);
        blank.setForeground(Color.WHITE);

        register.setFont(register.getFont().deriveFont((float) 15.5));
        register.setOpaque(true);
        register.setForeground(Color.WHITE);
        register.setBackground(Color.BLUE);
        register.setBorderPainted(false);
        register.setBounds(20, 250, 150, 25);
        register.addActionListener(e -> {
                System.out.println("Register-Button toggled");
                fieldHandling(name2, classname2, size2, username2, password2, jf);
        });

        back.setOpaque(true);
        back.setFont(back.getFont().deriveFont((float) 15.5));
        back.setBorderPainted(false);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLUE);
        back.setBounds(275, 250, 100, 25);
        back.addActionListener(e -> {
            System.out.println("Back - Button toggled");
            StartScreen startScreen = new StartScreen();
            startScreen.setVisible(true);
            startScreen.dispose();
            jf.dispose();
            System.out.println("Went back");
        });


        jf.add(name2);
        jf.add(classname2);
        jf.add(size2);
        jf.add(username2);
        jf.add(password2);
        jf.add(register);
        jf.add(name);
        jf.add(className);
        jf.add(back);
        jf.add(size);
        jf.add(username);
        jf.add(password);
        jf.add(blank);
        jf.setVisible(true);
    }

    public static void fieldHandling(JTextField t1, JTextField t2, JTextField t3, JTextField t4, JPasswordField t5, JFrame jf) {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();

        char[] e = t5.getPassword();
        String pw = new String(e);


        if (a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty() || pw.isEmpty()){
            if (pw.isEmpty() && d.isEmpty()){
                JOptionPane.showMessageDialog(null, "You have empty fields!", "Login error", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            InView iv = new InView();
            System.out.println("Welcome");
            iv.setVisible(true);
            iv.dispose();
            jf.dispose();
        }
    }
}