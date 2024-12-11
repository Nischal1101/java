package exceptions;

import java.util.Scanner;

public class Exceptions {
  public static void validateAge(int age) throws CustomCheckedExceptions 
  {
    if(age<18)
  {
    throw new CustomCheckedExceptions ("Cannot drive");
  }
  System.out.println("Registration successfull");
  }
 public static void main(String[] args) {
  System.out.println("Enter your age");
  Scanner sc=new Scanner(System.in);
  String ageS=sc.nextLine();
  int age=Integer.parseInt(ageS);
  try {
      validateAge(age);

  } catch (Exception e) {
   System.out.println(e.getMessage()); 
  }
  
  sc.close();
 } 

}
