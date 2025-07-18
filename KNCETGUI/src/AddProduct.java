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

public class AddProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 731, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AddProduct");
		lblNewLabel.setBounds(280, 30, 152, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ProductId");
		lblNewLabel_1.setBounds(75, 105, 116, 23);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(240, 107, 152, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ProductName");
		lblNewLabel_2.setBounds(75, 178, 100, 23);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(240, 180, 152, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ProductPrice");
		lblNewLabel_3.setBounds(75, 257, 100, 23);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(240, 259, 152, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("AddProduct");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String p1=textField.getText();
					String pn=textField_1.getText();
					String pp=textField_2.getText();
					
					String str1="insert into addproduct values('"+p1+"','"+pn+"','"+pp+"')";
					
					//Register the driver class
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//Creating a connection
					
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manojdb","root","root");
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnNewButton,"Inserted...");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton.setBounds(54, 350, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					String str1="select * from addproduct where pid='"+pid+"'";
					//Register the driver class
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//Creating a connection
					
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manojdb","root","root");
					Statement stmt=conn.createStatement();
					
					ResultSet rs=stmt.executeQuery(str1);
					rs.next();
					String r1=rs.getString(2);
					String r2=rs.getString(3);
					textField_1.setText(r1);
					textField_2.setText(r2);
					JOptionPane.showMessageDialog(btnNewButton_1,"Searching...");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton_1.setBounds(204, 350, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Updated");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String p1=textField.getText();
					String pn=textField_1.getText();
					String pp=textField_2.getText();
					
					String str1="update addproduct set pname='"+pn+"',pprice='"+pp+"' where pid='"+p1+"'";
					
					//Register the driver class
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//Creating a connection
					
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manojdb","root","root");
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnNewButton_2,"Updated...");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnNewButton_2.setBounds(359, 350, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setBounds(530, 350, 85, 21);
		contentPane.add(btnNewButton_3);
	}
}
