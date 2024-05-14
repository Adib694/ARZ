import javax.swing.*;
import java.awt.*;

public class ThankYouPage extends JFrame {
    private JLabel messageLabel;

    public ThankYouPage() {
        setTitle("Thank You!");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setLayout(null); // Use null layout to manually position components

        // Background Image
        ImageIcon backgroundImg = new ImageIcon("img3.png");
        JLabel backgroundLabel = new JLabel(backgroundImg);
        backgroundLabel.setBounds(0, 0, 500, 400);
        add(backgroundLabel);

        // Create components
        messageLabel = new JLabel("Do Visit Again");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 14));
        messageLabel.setForeground(Color.WHITE); // Set font color to white for better visibility
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        messageLabel.setVerticalAlignment(SwingConstants.CENTER);
        messageLabel.setBounds(10, 320, 500, 50); // Adjust message label position
        backgroundLabel.add(messageLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ThankYouPage();
    }
}

