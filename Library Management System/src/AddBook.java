import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddBook extends JFrame implements ActionListener {

    JTextField txtTitle, txtAuthor, txtCategory, txtQty;
    JButton btnSave;

    public AddBook() {
        setTitle("Add New Book");
        setSize(400, 300);
        setLayout(null);

        JLabel lbl1 = new JLabel("Title:");
        lbl1.setBounds(30, 30, 120, 25);
        add(lbl1);

        txtTitle = new JTextField();
        txtTitle.setBounds(150, 30, 200, 25);
        add(txtTitle);

        JLabel lbl2 = new JLabel("Author:");
        lbl2.setBounds(30, 70, 120, 25);
        add(lbl2);

        txtAuthor = new JTextField();
        txtAuthor.setBounds(150, 70, 200, 25);
        add(txtAuthor);

        JLabel lbl3 = new JLabel("Category:");
        lbl3.setBounds(30, 110, 120, 25);
        add(lbl3);

        txtCategory = new JTextField();
        txtCategory.setBounds(150, 110, 200, 25);
        add(txtCategory);

        JLabel lbl4 = new JLabel("Quantity:");
        lbl4.setBounds(30, 150, 120, 25);
        add(lbl4);

        txtQty = new JTextField();
        txtQty.setBounds(150, 150, 200, 25);
        add(txtQty);

        btnSave = new JButton("Save");
        btnSave.setBounds(150, 200, 100, 30);
        add(btnSave);

        btnSave.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(
                "INSERT INTO books(title, author, category, quantity) VALUES (?,?,?,?)"
            );
            pst.setString(1, txtTitle.getText());
            pst.setString(2, txtAuthor.getText());
            pst.setString(3, txtCategory.getText());
            pst.setInt(4, Integer.parseInt(txtQty.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Book Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
