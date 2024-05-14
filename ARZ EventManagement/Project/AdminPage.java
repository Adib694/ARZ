import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class AdminPage extends JFrame {
    private JTable userTable;
    private DefaultTableModel tableModel;

    public AdminPage() {
        setTitle("Admin Page");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        // Create table model with columns
        String[] columns = {"Name", "Email", "Phone", "Password"};
        tableModel = new DefaultTableModel(columns, 0);

        // Create user table
        userTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(userTable);
        add(scrollPane, BorderLayout.CENTER);

        // Add dummy data for demonstration
        addDummyData();

        setVisible(true);
    }

    private void addDummyData() {
        // Add some dummy data for demonstration
        String[][] dummyData = {
            {"John Doe", "john.doe@example.com", "1234567890", "password123"},
            {"Jane Smith", "jane.smith@example.com", "9876543210", "abc123"},
            {"Alice Johnson", "alice.johnson@example.com", "5555555555", "password456"}
        };

        for (String[] rowData : dummyData) {
            tableModel.addRow(rowData);
        }
    }

    public static void main(String[] args) {
        new AdminPage();
    }
}
