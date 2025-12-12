import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class ViewIssuedBooks extends JFrame {

    JTable table;

    public ViewIssuedBooks() {
        setTitle("Issued Books");
        setSize(700, 400);

        String[] cols = {
            "Issue ID", "Book ID", "Member", "Issue Date", "Return Date"
        };

        DefaultTableModel model = new DefaultTableModel(cols, 0);

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM issued_books");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("issue_id"),
                    rs.getInt("book_id"),
                    rs.getString("member_name"),
                    rs.getDate("issue_date"),
                    rs.getDate("return_date")
                };
                model.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable(model);
        add(new JScrollPane(table));

        setVisible(true);
    }
}
