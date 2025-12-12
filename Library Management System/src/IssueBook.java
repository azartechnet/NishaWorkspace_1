import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDate;

public class IssueBook extends JFrame implements ActionListener {

    JTextField txtBookID, txtMember;
    JButton btnIssue;

    public IssueBook() {
        setTitle("Issue Book");
        setSize(350, 250);
        setLayout(null);

        JLabel lbl1 = new JLabel("Book ID:");
        lbl1.setBounds(30, 30, 120, 25);
        add(lbl1);

        txtBookID = new JTextField();
        txtBookID.setBounds(150, 30, 150, 25);
        add(txtBookID);

        JLabel lbl2 = new JLabel("Member Name:");
        lbl2.setBounds(30, 70, 120, 25);
        add(lbl2);

        txtMember = new JTextField();
        txtMember.setBounds(150, 70, 150, 25);
        add(txtMember);

        btnIssue = new JButton("Issue");
        btnIssue.setBounds(150, 120, 100, 30);
        add(btnIssue);

        btnIssue.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Connection con = DBConnection.getConnection();

            // Reduce book quantity
            PreparedStatement pst1 = con.prepareStatement(
                "UPDATE books SET quantity = quantity - 1 WHERE book_id=? AND quantity > 0"
            );
            pst1.setInt(1, Integer.parseInt(txtBookID.getText()));
            int updated = pst1.executeUpdate();

            if (updated == 0) {
                JOptionPane.showMessageDialog(null, "Book not available!");
                return;
            }

            // Insert into issued_books
            PreparedStatement pst2 = con.prepareStatement(
                "INSERT INTO issued_books(book_id, member_name, issue_date) VALUES (?,?,?)"
            );
            pst2.setInt(1, Integer.parseInt(txtBookID.getText()));
            pst2.setString(2, txtMember.getText());
            pst2.setDate(3, java.sql.Date.valueOf(LocalDate.now()));
            pst2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Book Issued!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
