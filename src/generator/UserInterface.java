package generator;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class UserInterface extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel btPanel;

    public UserInterface() {
        setTitle("Password Generator");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setBackground(new Color(1, 1, 1));

        // JPanels will be added here in the future for better organization of the UI components
       btPanel = new JPanel();

        // Adding the panel to the frame
        add(btPanel);

        // Here we'll call the method to add buttons
        buttons();

        setVisible(true);
    }

    private void buttons() {
        JButton generateButton = new JButton("Generate Password");
        generateButton.setBackground(new Color(255, 0, 0, 128));
        btPanel.add(generateButton);
    }

}
