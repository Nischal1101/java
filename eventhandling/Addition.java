package eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Addition extends JFrame {

    Addition() {
        JTextField jTextField = new JTextField(20);
        JTextField jTextField2 = new JTextField(20);
        JTextField jTextField3 = new JTextField(20);
        JButton jButton = new JButton("sum");
        JLabel jLabel = new JLabel("Result is:   ");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(jTextField.getText());
                int num2 = Integer.parseInt(jTextField2.getText()
                );
                int result = num1 + num2;
                jLabel.setText("The result is " + result);
                jTextField3.setText(String.valueOf(result));
            }
        });
        add(jTextField);
        add(jTextField2);
        add(jTextField3);
        add(jButton);
        add(jLabel);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("add");
        setSize(500, 500);
        setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {
        new Addition();
    }
}
