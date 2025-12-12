import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;

    public Login() {
        setTitle("Librarian Login");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(30, 30, 100, 25);
        add(lblUser);

        txtUser = new JTextField();
        txtUser.setBounds(130, 30, 150, 25);
        add(txtUser);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(30, 70, 100, 25);
        add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(130, 70, 150, 25);
        add(txtPass);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(130, 110, 80, 25);
        add(btnLogin);

        btnLogin.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String user = txtUser.getText();
        String pass = new String(txtPass.getPassword());

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(
                "SELECT * FROM librarian WHERE username=? AND password=?"
            );
            pst.setString(1, user);
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successful!");
                new MainMenu();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
