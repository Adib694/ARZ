import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage extends JFrame implements ActionListener {
    private JButton nextButton;

    public WelcomePage() {
        setTitle("Welcome");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Background Image
        ImageIcon backgroundImg = new ImageIcon("img.png");
        JLabel backgroundLabel = new JLabel(backgroundImg);
        backgroundLabel.setBounds(0, 0, 750, 500);
        add(backgroundLabel);

        // Next Button
        nextButton = new JButton("Next");
        nextButton.setBounds(310, 400, 150, 50);
		nextButton.setBackground(new Color(59, 89, 182));
		nextButton.setForeground(Color.WHITE);
		nextButton.setFocusPainted(false);
		nextButton.setFont(new Font("Arial", Font.BOLD, 14));
		nextButton.setBorder(BorderFactory.createEmptyBorder());
		nextButton.setOpaque(true);
        nextButton.setBorderPainted(false);
        backgroundLabel.add(nextButton);
        nextButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            // Open the login page or any other action you want to perform
            new EventManagementSystemLogin();
            dispose(); // Close the welcome page
        }
    }

    public static void main(String[] args) {
        new WelcomePage();
    }
}
