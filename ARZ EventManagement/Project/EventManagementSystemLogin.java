import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventManagementSystemLogin extends JFrame implements ActionListener {
    private JTextField nameField, emailField, phoneField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton registerButton, nextButton, adminLoginButton;

    public EventManagementSystemLogin() {
        setTitle("Event Management System - Register");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Background Image
        ImageIcon backgroundImg = new ImageIcon("img4.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImg);
        backgroundLabel.setBounds(0, 0, 500, 400);
        add(backgroundLabel);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 80, 25);
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        backgroundLabel.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(200, 30, 200, 25);
        backgroundLabel.add(nameField);

        // Email
        JLabel emailLabel = new JLabel("Gmail ID:");
        emailLabel.setBounds(50, 70, 80, 25);
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font("Arial", Font.BOLD, 16));
        backgroundLabel.add(emailLabel);
        emailField = new JTextField();
        emailField.setBounds(200, 70, 200, 25);
        backgroundLabel.add(emailField);

        // Phone Number
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(50, 110, 150, 25);
		phoneLabel.setForeground(Color.WHITE);
		phoneLabel.setFont(new Font("Arial", Font.BOLD, 16));
        backgroundLabel.add(phoneLabel);
        phoneField = new JTextField();
        phoneField.setBounds(200, 110, 200, 25);
        backgroundLabel.add(phoneField);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 150, 80, 25);
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 16));
        backgroundLabel.add(passwordLabel);
        passwordField = new JPasswordField();
        passwordField.setBounds(200, 150, 200, 25);
        backgroundLabel.add(passwordField);

        // Confirm Password
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(50, 190, 150, 25);
		confirmPasswordLabel.setForeground(Color.WHITE);
		confirmPasswordLabel.setFont(new Font("Arial", Font.BOLD, 16));
        backgroundLabel.add(confirmPasswordLabel);
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(200, 190, 200, 25);
        backgroundLabel.add(confirmPasswordField);

        // Register Button
        registerButton = new JButton("Register");
        registerButton.setBounds(190, 270, 100, 25);
		registerButton.setBackground(new Color(59, 89, 182));
		registerButton.setForeground(Color.WHITE);
		registerButton.setFont(new Font("Arial", Font.BOLD, 12));
        backgroundLabel.add(registerButton);
        registerButton.addActionListener(this);

        // Next Button
        nextButton = new JButton("Next");
        nextButton.setBounds(190, 270, 100, 25);
		nextButton.setBackground(new Color(59, 89, 182));
		nextButton.setForeground(Color.WHITE);
		nextButton.setFont(new Font("Arial", Font.BOLD, 12));
        backgroundLabel.add(nextButton);
        nextButton.setVisible(false); // Initially invisible
        nextButton.addActionListener(this);

        // Admin Login Button
        adminLoginButton = new JButton("Admin Page");
        adminLoginButton.setBounds(170, 310, 150, 25);
		adminLoginButton.setForeground(Color.WHITE);
		adminLoginButton.setBackground(new Color(59, 89, 182));
        backgroundLabel.add(adminLoginButton);
        adminLoginButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            // Register logic
            // Assuming registration is successful for demonstration
            registerButton.setVisible(false); // Hide the register button
            nextButton.setVisible(true); // Show the next button
            JOptionPane.showMessageDialog(this, "Successfully Registered", "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == nextButton) {
            // Next button logic
            // Open the next page after successful registration
            // Here, I'm assuming nextButton is meant for the next page after registration
            new ChoosingEvent();
            dispose(); // Close the login page
        } else if (e.getSource() == adminLoginButton) {
            // Open the admin page
            new AdminPage();
            dispose(); // Close the login page
        }
    }

    public static void main(String[] args) {
        new EventManagementSystemLogin();
    }
}




