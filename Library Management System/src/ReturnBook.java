import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDate;

public class ReturnBook extends JFrame implements ActionListener {

    JTextField txtIssueID;
    JButton btnReturn;

    public ReturnBook() {
        setTitle("Return Book");
        setSize(350, 200);
        setLayout(null);

        JLabel lbl1 = new JLabel("Issue ID:");
        lbl1.setBounds(30, 30, 120, 25);
        add(lbl1);

        txtIssueID = new JTextField();
        txtIssueID.setBounds(150, 30, 150, 25);
        add(txtIssueID);

        btnReturn = new JButton("Return");
        btnReturn.setBounds(150, 80, 100, 30);
        add(btnReturn);

        btnReturn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            Connection con = DBConnection.getConnection();

            // Increase quantity of book
            PreparedStatement pst1 = con.prepareStatement(
                "UPDATE books SET quantity = quantity + 1 " +
                "WHERE book_id=(SELECT book_id FROM issued_books WHERE issue_id=?)"
            );
            pst1.setInt(1, Integer.parseInt(txtIssueID.getText()));
            pst1.executeUpdate();

            // Update return date
            PreparedStatement pst2 = con.prepareStatement(
                "UPDATE issued_books SET return_date=? WHERE issue_id=?"
            );
            pst2.setDate(1, java.sql.Date.valueOf(LocalDate.now()));
            pst2.setInt(2, Integer.parseInt(txtIssueID.getText()));
            pst2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Book Returned!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
