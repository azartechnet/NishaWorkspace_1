import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AdminLogin");
		lblNewLabel.setBounds(213, 10, 94, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AdminID");
		lblNewLabel_1.setBounds(43, 103, 82, 25);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(181, 106, 149, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(43, 186, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 183, 149, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					 String u1=textField.getText();
					 String p1=textField_1.getText();
					 String str1="select * from admin1";
					 
					 //Register the driver class
					 
					 Class.forName("com.mysql.cj.jdbc.Driver");
					 //creating a connection
					 Connection conn=DriverManager.
							 getConnection("jdbc:mysql://localhost:3306/madhuradb","root","root");
					 Statement stmt=conn.createStatement();
					 ResultSet rs=stmt.executeQuery(str1);
					 
					 rs.next();
					 
					 String uname=rs.getString(1);
					 String pass=rs.getString(2);
					 
					 if(u1.equals(uname)&&p1.equals(pass))
					 {
						 JOptionPane.showMessageDialog(btnNewButton,"LoginSucess!!!");
						 new AdminHomePage().setVisible(true);
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(btnNewButton,"LoginFail!!!");
					 }
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnNewButton.setBounds(183, 280, 124, 32);
		contentPane.add(btnNewButton);

	}
}
