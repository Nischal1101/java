package layouts;

import javax.swing.*;

public class CardLayoutDemo extends JFrame {

    CardLayoutDemo() {
        JLabel jlabel = new JLabel("this is my jlabel");
        JLabel jlabel2 = new JLabel("this is my jlabel2");

        // JScrollPane scroll=new JScrollPane(new JTextArea(2,3));
        // jlabel.setBounds(10,20,90,40);
        // jlabel2.setBounds(20,30,40,50);
        add(new JTextArea(2, 3));
        add(jlabel);
        add(jlabel2);
        setTitle("Card Layout demo");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
