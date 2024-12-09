package eventhandling;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class ActionDemo extends JFrame implements ActionListener {
  ActionDemo() {
    JButton jButton=new JButton("click me");
    JButton jButton2=new JButton("Don't click me");
    jButton.addActionListener(this);
    jButton2.addActionListener(this);
    setLayout(new FlowLayout());
    add(jButton);
    add(jButton2);
    setTitle("Action Demo");
    setVisible(true);
    setSize(500,500);
    setDefaultCloseOperation(2);
  }
@Override
public void actionPerformed(ActionEvent e)
{
  System.out.println("Button clicked!");
}
  public static void main(String[] args) {
    new ActionDemo();
  }
}
