package layouts;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class FlowLayoutDemo extends JFrame {
  @SuppressWarnings("unchecked")
  FlowLayoutDemo()
  {
    JLabel jlabel=new JLabel("this is my jlabel");
    JLabel jlabel2=new JLabel("this is my jlabel2");
    JCheckBox JcheckBox= new JCheckBox("food",true); 
    JCheckBox JcheckBox2= new JCheckBox("food",true); 
    JRadioButton rb1=new JRadioButton("male");
    JRadioButton rb2=new JRadioButton("female");
    ButtonGroup bg=new ButtonGroup();
    String[] countries={"nepal","spain","usa"};
    JComboBox comboBox=new JComboBox(countries);
    JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
    //Menubar,submenu and menuitems.
    JPasswordField password=new JPasswordField(20);
    password.setToolTipText("Enter your password");
    JMenuBar mb=new JMenuBar();
    JMenu menu=new JMenu("menu");
    menu.setMnemonic('M');
    JMenu submenu=new JMenu("submenu");
    JMenuItem i1=new JMenuItem("Item 1");
    i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
    JMenuItem i2=new JMenuItem("Item 2");
    JMenuItem i3=new JMenuItem("Item 3");
    JMenuItem i4=new JMenuItem("Item 4");
    submenu.add(i1);
    submenu.add(i2);
    submenu.add(i3);
    submenu.add(i4);
    menu.add(submenu);
    mb.add(menu);
    setJMenuBar(mb);

    bg.add(rb1);
    bg.add(rb2);
    setLayout(new FlowLayout());
    add(password);
    add(slider);
    add(comboBox);
    add(rb1);
    add(rb2);
    add(JcheckBox);
    add(JcheckBox2);
    add(jlabel);
    add(jlabel2);
  
      setTitle("Flow Layout demo");
      setVisible(true);
      setSize(500,500);
      setDefaultCloseOperation(2);
  }
 public static void main(String[] args) {
 new FlowLayoutDemo(); 
 } 
}
