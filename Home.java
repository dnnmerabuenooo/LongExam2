import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Container;

public class Home extends JFrame {

    private JPanel contentPane;
    private JTextField username;
    private JTextField password;
    private JLabel incorrectUser;
    private JLabel incorrectPass;
    private JLabel incorrectPassUser;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Home main = new Home();
                    main.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Home() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel examTxt = new JLabel("Finals Long Exam Grading System");
        examTxt.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        examTxt.setBounds(74, 66, 272, 29);
        contentPane.add(examTxt);

        JLabel userTxt = new JLabel("Username:");
        userTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        userTxt.setBounds(111, 106, 54, 20);
        contentPane.add(userTxt);

        JLabel passTxt = new JLabel("Password:");
        passTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        passTxt.setBounds(111, 148, 54, 20);
        contentPane.add(passTxt);

        username = new JTextField();
        username.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        username.setBounds(180, 106, 114, 20);
        contentPane.add(username);
        username.setColumns(10);

        password = new JTextField();
        password.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        password.setBounds(180, 148, 114, 20);
        contentPane.add(password);
        password.setColumns(10);

        JButton loginBtn = new JButton("Login");
        Container container = null;
        loginBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String user = username.getText();
                String pass = password.getText();
                incorrectUser.setVisible(false);
                incorrectPass.setVisible(false);
                incorrectPassUser.setVisible(false);
                if (user.equals("Admin-Java") && pass.equals("AdminJava123")) {
                    // Login successful
                    JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN!");
                    JOptionPane.showMessageDialog(null, "WELCOME!");
                    AdminPage adminPage = new AdminPage();
                    adminPage.setVisible(true);
                    dispose();
                } 
                else if (!user.equals("Admin-Java") && pass.equals("AdminJava123")) {
                    // Incorrect student username
                    incorrectUser.setVisible(true);  
                } 
                else if (user.equals("Admin-Java") && !pass.equals("AdminJava123")) {
                    // Incorrect password
                    incorrectPass.setVisible(true);
                } 
                else {
                    // Incorrect username and password
                    incorrectPassUser.setVisible(true);
                }
            }
        });

        loginBtn.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        loginBtn.setBounds(158, 198, 102, 23);
        contentPane.add(loginBtn);

        // Create the labels for error inputs
        incorrectUser = new JLabel("INCORRECT STUDENT USERNAME");
        incorrectUser.setForeground(new Color(255, 0, 0));
        incorrectUser.setFont(new Font("Times New Roman", Font.PLAIN, 9));
        incorrectUser.setBounds(158, 126, 150, 14);
        contentPane.add(incorrectUser);
        incorrectUser.setVisible(false);

        incorrectPass = new JLabel("INCORRECT PASSWORD");
        incorrectPass.setForeground(new Color(255, 0, 0));
        incorrectPass.setFont(new Font("Times New Roman", Font.PLAIN, 9));
        incorrectPass.setBounds(180, 168, 114, 14);
        contentPane.add(incorrectPass);
        incorrectPass.setVisible(false);

        incorrectPassUser = new JLabel("INCORRECT USERNAME and PASSWORD");
        incorrectPassUser.setForeground(new Color(255, 0, 0));
        incorrectPassUser.setFont(new Font("Times New Roman", Font.PLAIN, 9));
        incorrectPassUser.setBounds(158, 179, 176, 14);
        contentPane.add(incorrectPassUser);
        incorrectPassUser.setVisible(false);
    }
}
