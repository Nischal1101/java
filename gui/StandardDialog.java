package gui;
import javax.swing.JOptionPane;

public class StandardDialog {
  public static void main(String[] args) {
   int num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your first number"));
   int num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your second number"));
   int sum=num1+num2;
   JOptionPane.showMessageDialog(null,  "The sum is "+sum);

   

  } 
}
