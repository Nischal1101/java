package eventhandling;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterDemo extends JFrame {
  MouseAdapterDemo()
  {
    JButton jButton=new JButton("click me");
    jButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
          System.out.println("Mouse Clicked");        
        }

        @Override
        public void mousePressed(MouseEvent e) {
System.out.println("Mouse Pressed");              }
        }
);
    add(jButton);
    setVisible(true);
    setTitle("add");
    setSize(500,500);
    setDefaultCloseOperation(2);
  }
 public static void main(String[] args) {
  new MouseAdapterDemo();
 } 
}
