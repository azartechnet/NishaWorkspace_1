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

public class UserLogin extends JFrame {

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
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserLogin");
		lblNewLabel.setBounds(241, 25, 101, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setBounds(94, 104, 101, 24);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(241, 93, 188, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(94, 215, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(241, 204, 188, 35);
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
					
					String str1="select * from adduser where username='"+u1+"'";
					
					//Register the driver class
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//Creating a connection
					
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mrgnishadb","root","root");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str1);
					
					rs.next();
					
					String uname=rs.getString(1);
					String pass=rs.getString(2);
					
					if(u1.equals(uname)&&p1.equals(pass))
					{
						JOptionPane.showMessageDialog(btnNewButton,"LoginSuc!!!");
						new UserHomePage().setVisible(true);
					}
					
				}
				catch(Exception t)
				{
					JOptionPane.showMessageDialog(btnNewButton,"LoginFail!!!");
				}
			}
		});
		btnNewButton.setBounds(131, 304, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(296, 304, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
