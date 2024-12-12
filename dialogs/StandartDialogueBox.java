package dialogs;
import javax.swing.*;

public class StandartDialogueBox  {
  StandartDialogueBox()
  {
     JOptionPane.showMessageDialog(null,"hi this is nischal");
     JOptionPane.showMessageDialog(null,"hi this is critical message","very critical title",JOptionPane.ERROR_MESSAGE);
    int choice=     JOptionPane.showConfirmDialog(null, "Do you reallay want to exit?");
    //choice can be 0,1 ,2.
    String name=JOptionPane.showInputDialog(null,"Please enter your name");
    String caste=JOptionPane.showInputDialog(null,"Please enter your caste");
    System.out.println("Fullname is "+name+caste);


  }
public static void main(String[] args) {
new StandartDialogueBox();
  
}
  
}
