
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class KeyboardHandling {

    private JFrame frame;
    private JTextField userIdField;
    private JPasswordField passwordField;
    private JButton okButton;
    private JButton cancelButton;

    public KeyboardHandling() {
        frame = new JFrame("Login Form");
        userIdField = new JTextField(15);
        passwordField = new JPasswordField(15);
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");

        frame.setLayout(new GridLayout(3, 2));

        frame.add(new JLabel("User ID:"));
        frame.add(userIdField);
        frame.add(new JLabel("Password:"));
        frame.add(passwordField);
        frame.add(okButton);
        frame.add(cancelButton);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        okButton.addActionListener(e -> login());
        cancelButton.addActionListener(e -> clearFields());

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'l') {
                    login();
                } else if (e.getKeyChar() == 'c') {
                    clearFields();
                }
            }
        });

        userIdField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'c') {
                    clearFields();
                }
            }
        });

        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'c') {
                    clearFields();
                }
            }
        });
    }

    private void login() {
        String userId = userIdField.getText();
        String password = new String(passwordField.getPassword());

// Connect to the database and verify user credentials
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "username", "password"); PreparedStatement ps = conn.prepareStatement("SELECT * FROM user WHERE Uid = ? AND Password = ?")) {
            ps.setString(1, userId);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(frame, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Database error: " + e.getMessage());
        }
    }

    private void clearFields() {
        userIdField.setText("");
        passwordField.setText("");
        userIdField.requestFocus();
    }

    public static void main(String[] args) {
        new Practice1();
    }
}
