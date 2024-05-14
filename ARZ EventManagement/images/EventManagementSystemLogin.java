import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventManagementSystemLogin extends JFrame implements ActionListener {
    private JTextField nameField, emailField, phoneField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton registerButton, nextButton;

    public EventManagementSystemLogin() {
        setTitle("Event Management System - Register");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Background Image
        ImageIcon backgroundImg = new ImageIcon("img2.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImg);
        backgroundLabel.setBounds(0, 0, 400, 350);
        add(backgroundLabel);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 80, 25);
        backgroundLabel.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 25);
        backgroundLabel.add(nameField);

        // Email
        JLabel emailLabel = new JLabel("Gmail ID:");
        emailLabel.setBounds(50, 70, 80, 25);
        backgroundLabel.add(emailLabel);
        emailField = new JTextField();
        emailField.setBounds(150, 70, 200, 25);
        backgroundLabel.add(emailField);

        // Phone Number
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(50, 110, 100, 25);
        backgroundLabel.add(phoneLabel);
        phoneField = new JTextField();
        phoneField.setBounds(150, 110, 200, 25);
        backgroundLabel.add(phoneField);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 150, 80, 25);
        backgroundLabel.add(passwordLabel);
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 150, 200, 25);
        backgroundLabel.add(passwordField);

        // Confirm Password
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(50, 190, 120, 25);
        backgroundLabel.add(confirmPasswordLabel);
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(180, 190, 170, 25);
        backgroundLabel.add(confirmPasswordField);

        // Register Button
        registerButton = new JButton("Register");
        registerButton.setBounds(150, 230, 100, 25);
        backgroundLabel.add(registerButton);
        registerButton.addActionListener(this);

        // Next Button
        nextButton = new JButton("Next");
        nextButton.setBounds(150, 270, 100, 25);
        backgroundLabel.add(nextButton);
        nextButton.setVisible(false); // Initially invisible
        nextButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            if (password.equals(confirmPassword)) {
                // Perform registration logic here
                JOptionPane.showMessageDialog(this, "Successfully Registered");
                registerButton.setVisible(false); // Hide the register button
                nextButton.setVisible(true); // Show the next button
            } else {
                JOptionPane.showMessageDialog(this, "Passwords do not match");
            }
        } else if (e.getSource() == nextButton) {
            // Open the next page
            new EventManagementSystem1();
            dispose(); // Close the login page
        }
    }

    public static void main(String[] args) {
        new EventManagementSystemLogin();
    }
}



