package practice;
import java.awt.*;
import javax.swing.*;


public class FlowLayoutDemos extends JFrame {
  FlowLayoutDemos()
  {
    JLabel label1=new JLabel("this is first");
    JLabel label2=new JLabel("this is second");
    JLabel label3=new JLabel("this is third");
    add(label1);
    add(label2);
    add(label3);
    setLayout(new FlowLayout());
    setTitle("hello");
    setDefaultCloseOperation(2);
    setSize(500,500);
    setVisible(true);


  }
  public static void main(String[] args) {
    new FlowLayoutDemos();
  }
  
}
