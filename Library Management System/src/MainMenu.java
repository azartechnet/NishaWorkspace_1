import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame implements ActionListener {

    JButton btnAdd, btnView, btnIssue, btnReturn, btnIssuedBooks, btnLogout;

    public MainMenu() {
        setTitle("Library Management Menu");
        setSize(400, 450);
        setLayout(new GridLayout(6, 1));

        JLabel title = new JLabel("Library Management Menu", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title);

        btnAdd = new JButton("1. Add New Book (Cataloging)");
        btnView = new JButton("2. View All Books (Reporting)");
        btnIssue = new JButton("3. Issue Book to Member (Lending)");
        btnReturn = new JButton("4. Return Book (Returning & Fines)");
        btnIssuedBooks = new JButton("5. View Issued Books (Reporting)");
        btnLogout = new JButton("6. Logout");

        add(btnAdd);
        add(btnView);
        add(btnIssue);
        add(btnReturn);
        add(btnIssuedBooks);
        add(btnLogout);

        btnLogout.addActionListener(this);
        btnAdd.addActionListener(e -> new AddBook());
        btnView.addActionListener(e -> new ViewBooks());
        btnIssue.addActionListener(e -> new IssueBook());
        btnReturn.addActionListener(e -> new ReturnBook());
        btnIssuedBooks.addActionListener(e -> new ViewIssuedBooks());

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogout) {
            JOptionPane.showMessageDialog(null, "Logged out successfully!");
            new Login();
            dispose();
        }
    }
}
