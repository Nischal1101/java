package layouts;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame {

    BorderLayoutDemo() {
        JLabel jlabel = new JLabel("this is my jlabel");
        JLabel jlabel2 = new JLabel("this is my jlabel2");
        JLabel jlabel3 = new JLabel("this is my jlabel3");
        JLabel jlabel4 = new JLabel("this is my jlabel4");
        JLabel jlabel5 = new JLabel("this is my jlabel5");
        setLayout(new BorderLayout());

        add(jlabel, BorderLayout.NORTH);
        add(jlabel2, BorderLayout.SOUTH);
        add(jlabel3, BorderLayout.EAST);
        add(jlabel4, BorderLayout.WEST);
        add(jlabel5, BorderLayout.CENTER);
        setTitle("Border Layout demo");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {

        new BorderLayoutDemo();
    }

}
