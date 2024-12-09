package eventhandling;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo extends JFrame{
  KeyEventDemo()
  {
    JTextField jTextField=new JTextField(20);
    jTextField.addKeyListener(new KeyAdapter() {
     @Override 
     public void keyTyped(KeyEvent e)
     {
      System.out.println("Key typed");
     }
      
      @Override 
     public void keyReleased(KeyEvent e)
     {
     System.out.println("key released"); 
     }
    });
    add(jTextField);
    setVisible(true);
    setTitle("Key event");
    setSize(500,500);
    setDefaultCloseOperation(2);
  }
  public static void main(String[] args) {
    new KeyEventDemo();
  }
}
