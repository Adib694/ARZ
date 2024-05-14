import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChoosingEvent extends JFrame implements ActionListener {
    private JLabel titleLabel, eventLabel, destinationLabel, dateLabel;
    private JComboBox<String> eventComboBox, destinationComboBox;
    private JTextField dateField;
    private JButton submitButton, nextButton;

    public ChoosingEvent() {
        setTitle("Booking Event");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setLayout(null);

        // Background Image
        ImageIcon backgroundImg = new ImageIcon("img2.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImg);
        backgroundLabel.setBounds(0, 0, 500, 400);
        add(backgroundLabel);

        // Title Label
        titleLabel = new JLabel("Choose Your Event");
		titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(150, 10, 300, 30);
        backgroundLabel.add(titleLabel);

        // Event Label
        eventLabel = new JLabel("Event:");
		eventLabel.setForeground(Color.WHITE);
		eventLabel.setFont(new Font("Arial", Font.BOLD, 16));
        eventLabel.setBounds(50, 80, 80, 20);
        backgroundLabel.add(eventLabel);

        // Event ComboBox
        String[] events = {"Birthday", "Wedding", "Engagement", "Get Together"};
        eventComboBox = new JComboBox<>(events);
		eventComboBox.setFont(new Font("Arial", Font.BOLD, 11));
        eventComboBox.setBounds(160, 80, 200, 20);
        backgroundLabel.add(eventComboBox);

        // Destination Label
        destinationLabel = new JLabel("Destination:");
		destinationLabel.setForeground(Color.WHITE);
		destinationLabel.setFont(new Font("Arial", Font.BOLD, 16));
        destinationLabel.setBounds(50, 120, 150, 20);
        backgroundLabel.add(destinationLabel);

        // Destination ComboBox
        String[] destinations = {"Sheraton Hotel (200000tk)", "Le Meridian Hotel (150000tk)", "Inter Continental Hotel (300000tk)"};
        destinationComboBox = new JComboBox<>(destinations);
		destinationComboBox.setFont(new Font("Arial", Font.BOLD, 11));
        destinationComboBox.setBounds(160, 120, 200, 20);
        backgroundLabel.add(destinationComboBox);

        // Date Label
        dateLabel = new JLabel("Date:");
		dateLabel.setForeground(Color.WHITE);
		dateLabel.setFont(new Font("Arial", Font.BOLD, 16));
        dateLabel.setBounds(50, 150, 80, 20);
        backgroundLabel.add(dateLabel);

        // Date Field
        dateField = new JTextField();
        dateField.setBounds(160, 150, 200, 20);
        backgroundLabel.add(dateField);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(180, 230, 100, 30);
		submitButton.setBackground(new Color(59, 89, 182));
		submitButton.setForeground(Color.WHITE);
        backgroundLabel.add(submitButton);
        submitButton.addActionListener(this);

        // Next Button
        nextButton = new JButton("Next");
        nextButton.setBounds(180, 230, 100, 25);
		nextButton.setBackground(new Color(59, 89, 182));
		nextButton.setForeground(Color.WHITE);
        backgroundLabel.add(nextButton);
        nextButton.setVisible(false); // Initially invisible
        nextButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Perform submission logic here
            JOptionPane.showMessageDialog(this, "Event details submitted successfully!");
            submitButton.setVisible(false); // Hide the submit button
            nextButton.setVisible(true); // Show the next button
        } else if (e.getSource() == nextButton) {
            // Open the next page
            new BookingEvent();
            dispose(); // Close the current page
        }
    }

    public static void main(String[] args) {
        new ChoosingEvent();
    }
}


