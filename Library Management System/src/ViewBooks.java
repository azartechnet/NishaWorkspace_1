import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class ViewBooks extends JFrame {

    JTable table;

    public ViewBooks() {
        setTitle("View All Books");
        setSize(600, 400);

        String[] columns = {"ID", "Title", "Author", "Category", "Quantity"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM books");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("book_id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("category"),
                    rs.getInt("quantity")
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        add(sp);

        setVisible(true);
    }
}
