package gui;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingDemo extends JFrame{
  SwingDemo(){
JButton button=new JButton("click me");
JButton button2=new JButton("click me hai");
  JPanel panel=new JPanel();
  panel.setBackground(Color.red);
  panel.add(button);
  panel.add(button2);
  add(panel);

  setTitle("nischal");
  setSize(500,500);
  setVisible(true);
  setDefaultCloseOperation(2);

  }
  public static void main(String[] args) {
    new SwingDemo();
  } 
}
