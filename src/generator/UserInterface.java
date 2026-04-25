package generator;

import java.awt.*;
import javax.swing.*;

/**
 * This class is responsible for creating the user interface of the password generator application.
 * It extends JFrame and sets up the main window, including a header panel with title/subtitle
 * labels, a button panel, and a method to add buttons to the interface.
 */
public class UserInterface extends JFrame {

    // Font size constants to avoid magic numbers and ease future maintenance

    private final JPanel northPanel, centerPanel, southPanel;

    public UserInterface() {
        setTitle("Password Generator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setBackground(Color.ORANGE);

        northPanel = new JPanel();
        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));
        northPanel.setBounds(20, 20, 360, 100);
        northPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));

        centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //centerPanel.setBounds(20, 20, 360, 100);
        centerPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));

        southPanel = new JPanel();
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.Y_AXIS));
        southPanel.setBounds(20, 20, 360, 100);
        southPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0));

        createLabel();
        createTextField();
        secondLabel();
        addButton();
        resultLabel();


        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void  createLabel() {
        JLabel label = new JLabel("Create your password", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setAlignmentX(CENTER_ALIGNMENT);
        label.setBounds(10, 10, 10, 10);

        northPanel.add(label);
    }

    public void createTextField() {
        JTextField passwordField = new JTextField(20);
        northPanel.add(passwordField);
    }
    public void secondLabel() {
        JLabel secundLabel = new JLabel("or click to generate a password", SwingConstants.CENTER);
        secundLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        secundLabel.setAlignmentX(CENTER_ALIGNMENT);
        secundLabel.setBounds(10, 30, 10, 10);

        northPanel.add(secundLabel);
    }

    public void addButton() {
        JButton button = new JButton("Generate");
        button.setAlignmentX(CENTER_ALIGNMENT);
        button.setBounds(10, 50, 10, 10);
        button.setBackground(new Color(123, 0, 153, 255));
        button.setForeground(Color.WHITE);

        JButton button2 = new JButton("Verify");
        button2.setAlignmentX(CENTER_ALIGNMENT);
        button2.setBounds(10, 50, 10, 10);
        button2.setBackground(new Color(123, 153, 0, 255));

        centerPanel.add(button);
        centerPanel.add(button2);
    }

    public void resultLabel() {
        JLabel resultLabel = new JLabel("Generated Password: ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        resultLabel.setAlignmentX(CENTER_ALIGNMENT);
        resultLabel.setBounds(10, 30, 10, 10);

        southPanel.add(resultLabel);
    }
}
