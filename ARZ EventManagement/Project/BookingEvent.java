import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookingEvent extends JFrame implements ActionListener {
    private JLabel titleLabel, paymentMethodLabel, paymentOptionLabel;
    private JComboBox<String> paymentMethodComboBox, paymentOptionComboBox;
    private JButton submitButton, nextButton;

    public BookingEvent() {
        setTitle("Payment");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setLayout(null);

        // Background Image
        ImageIcon backgroundImg = new ImageIcon("img4.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImg);
        backgroundLabel.setBounds(0, 0, 500, 400);
        add(backgroundLabel);

        // Title Label
        titleLabel = new JLabel("Book Your Event");
		titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(150, 10, 300, 30);
        backgroundLabel.add(titleLabel);

        // Payment Method Label
        paymentMethodLabel = new JLabel("Payment Method:");
		paymentMethodLabel.setForeground(Color.WHITE);
		paymentMethodLabel.setFont(new Font("Arial", Font.BOLD, 16));
        paymentMethodLabel.setBounds(50, 100, 150, 20);
        backgroundLabel.add(paymentMethodLabel);

        // Payment Method ComboBox
        String[] paymentMethods = {"Mobile Banking", "Payment with Card"};
        paymentMethodComboBox = new JComboBox<>(paymentMethods);
		paymentMethodComboBox.setFont(new Font("Arial", Font.BOLD, 12));
        paymentMethodComboBox.setBounds(240, 100, 160, 20);
        backgroundLabel.add(paymentMethodComboBox);
        paymentMethodComboBox.addActionListener(this);

        // Payment Option Label
        paymentOptionLabel = new JLabel("Payment Option:");
		paymentOptionLabel.setForeground(Color.WHITE);
		paymentOptionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        paymentOptionLabel.setBounds(50, 140, 150, 20);
        backgroundLabel.add(paymentOptionLabel);

        // Payment Option ComboBox
        paymentOptionComboBox = new JComboBox<>();
		paymentOptionComboBox.setFont(new Font("Arial", Font.BOLD, 12));
        paymentOptionComboBox.setBounds(240, 140, 160, 20);
        backgroundLabel.add(paymentOptionComboBox);

        // Submit Button
        submitButton = new JButton("Submit");
		submitButton.setBackground(new Color(59, 89, 182));
		submitButton.setForeground(Color.WHITE);
        submitButton.setBounds(180, 200, 80, 30);
        backgroundLabel.add(submitButton);
        submitButton.addActionListener(this);

        // Next Button
        nextButton = new JButton("Next");
        nextButton.setBounds(180, 200, 100, 25);
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
            JOptionPane.showMessageDialog(this, "Payment processed successfully!");
			JOptionPane.showMessageDialog(this, "Event Booked Successfully");
            submitButton.setVisible(false); // Hide the submit button
            nextButton.setVisible(true); // Show the next button
        } else if (e.getSource() == nextButton) {
            // Open the next page
            new ThankYouPage();
            dispose(); // Close the current page
        } else if (e.getSource() == paymentMethodComboBox) {
            // Update payment options based on the selected payment method
            updatePaymentOptions();
        }
    }

    private void updatePaymentOptions() {
        // Get the selected payment method
        String selectedPaymentMethod = (String) paymentMethodComboBox.getSelectedItem();

        // Clear previous options
        paymentOptionComboBox.removeAllItems();

        // Add new options based on the selected payment method
        if (selectedPaymentMethod.equals("Mobile Banking")) {
            String[] mobileOptions = {"Nagad", "Bkash"};
            for (String option : mobileOptions) {
                paymentOptionComboBox.addItem(option);
            }
        } else if (selectedPaymentMethod.equals("Payment with Card")) {
            String[] cardOptions = {"Visa Card", "Master Card"};
            for (String option : cardOptions) {
                paymentOptionComboBox.addItem(option);
            }
        }
    }

    public static void main(String[] args) {
        new BookingEvent();
    }
}


