
import javax.swing.*;
import java.awt.event.*;

public class AllEvents extends JFrame {

    public AllEvents() {
        super("Event Handling Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create components
        JButton button = new JButton("Click Me");
        JCheckBox checkBox = new JCheckBox("Check Me");
        JTextField textField = new JTextField(10);

        // Add components to the frame
        button.setBounds(50, 50, 100, 30);
        checkBox.setBounds(50, 90, 100, 30);
        textField.setBounds(50, 130, 100, 30);
        add(button);
        add(checkBox);
        add(textField);

        // Add event listeners
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });

        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox selected");
                } else {
                    System.out.println("Checkbox deselected");
                }
            }
        });

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("Text field gained focus");
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("Text field lost focus");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AllEvents();
    }
}
