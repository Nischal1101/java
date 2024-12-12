package layouts;
import java.awt.*;
import javax.swing.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JButton button1 = new JButton("Button 1");
        gbc.gridx = 0; gbc.gridy = 0; // Position (0, 0)
        frame.add(button1, gbc);

        JButton button2 = new JButton("Button 2");
        gbc.gridx = 1; gbc.gridy = 0; // Position (1, 0)
        frame.add(button2, gbc);

        JButton button3 = new JButton("Button 3");
        gbc.gridx = 0; gbc.gridy = 1; // Position (0, 1)
        gbc.gridwidth = 2; // Span two columns
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(button3, gbc);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
