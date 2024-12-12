package eventhandling;

import java.awt.event.*;
import javax.swing.*;

public class MouseDemo extends JFrame {

    MouseDemo() {
        JButton jButton = new JButton("lick me");
        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited");
            }
        }
        );
        add(jButton);
        setVisible(true);
        setTitle("add");
        setSize(500, 500);
        setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {
        new MouseDemo();
    }
}
