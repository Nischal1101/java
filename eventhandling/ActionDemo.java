package eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionDemo extends JFrame {

    ActionDemo() {
        JButton jButton = new JButton("click me");
        JButton jButton2 = new JButton("Don't click me");
        jButton.addActionListener((e) -> {
            System.out.println("Clicked");
        });
        jButton2.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Not Clicked"
                        + e);

            }
        }
        );
        setLayout(new FlowLayout());
        add(jButton);
        add(jButton2);
        setTitle("Action Demo");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {
        new ActionDemo();
    }
}
