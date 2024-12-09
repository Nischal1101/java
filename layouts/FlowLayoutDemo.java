package layouts;

import java.awt.FlowLayout;
import javax.swing.*;
public class FlowLayoutDemo extends JFrame {
  FlowLayoutDemo()
  {
    JLabel jlabel=new JLabel("this is my jlabel");
    JLabel jlabel2=new JLabel("this is my jlabel2");
    JLabel jlabel3=new JLabel("this is my jlabel2");
    JLabel jlabel4=new JLabel("this is my jlabel2");
    JLabel jlabel5=new JLabel("this is my jlabel2");
    setLayout(new FlowLayout());
    add(jlabel);
    add(jlabel2);
    add(jlabel3);
    add(jlabel4);
    add(jlabel5);
      setTitle("Flow Layout demo");
      setVisible(true);
      setSize(500,500);
      setDefaultCloseOperation(2);
  }
 public static void main(String[] args) {
 new FlowLayoutDemo(); 
 } 
}
