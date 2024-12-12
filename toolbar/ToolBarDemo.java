package toolbar;
import java.awt.BorderLayout;
import javax.swing.*;
public class ToolBarDemo extends JFrame {
  ToolBarDemo()
  {
    JButton button =new JButton("pencil");
    JLabel label=new JLabel("hi");
    JCheckBox checkbox=new JCheckBox("ok");
    //0 for horizontal , 1 for vertical orientation
    JToolBar toolbar=new JToolBar("myToolbar",0);
    toolbar.add(button);
    toolbar.add(checkbox);
    toolbar.add(label);
    setLayout(new BorderLayout());
    add(toolbar,BorderLayout.NORTH);
    setTitle("Toolbar Demo");
    setSize(500,500);
    setDefaultCloseOperation(2);
    setVisible(true);
  }
 public static void main(String[] args) {
  new ToolBarDemo();
 } 
}
