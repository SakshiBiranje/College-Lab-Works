import java.awt.*;
import java.awt.event.*;

public class AWTApp extends Frame {
    AWTApp() {
        
        // Create labels
        JLabel firstNameLabel = new JLabel("First Name");
        firstNameLabel.setBounds(50, 50, 80, 20);

        JLabel lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setBounds(50, 80, 80, 20);

        JLabel dobLabel = new JLabel("Date of Birth");
        dobLabel.setBounds(50, 110, 80, 20);

        // Create text fields
        JTextField firstNameTF = new JTextField();
        firstNameTF.setBounds(200, 50, 100, 20);

        JTextField lastNameTF = new JTextField();
        lastNameTF.setBounds(200, 80, 100, 20);

        JTextField dobTF = new JTextField();
        dobTF.setBounds(200, 110, 100, 20);

        // Create buttons
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(50, 160, 100, 30);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(250, 160, 100, 30);

        // Add components to the frame
        add(firstNameLabel);
        add(lastNameLabel);
        add(dobLabel);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(submitButton);
        add(resetButton);

        // Set frame properties
        setSize(400, 250);
        setLayout(null);
        setVisible(true);

        // Handle window close event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose(); // Close the window
            }
        });
    }

    public static void main(String[] args) {
        new AWTApp();
    }
}
