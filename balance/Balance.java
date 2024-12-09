class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class Balance{

  int yourBal;
  public Balance(int yourBal){
    this.yourBal=yourBal;
  }
  public void withdraw(int withdrawAmount) throws InsufficientBalanceException
  {
    if(withdrawAmount>yourBal)
    {
      throw new InsufficientBalanceException("insufficient balance");
    }
  else{
    System.out.println("Amount Withdrawn "+withdrawAmount);
  }
  }
  public static void main(String[] args)
  {
Balance bal=new Balance(3000);
try {
bal.withdraw(4000);
} catch (InsufficientBalanceException e) {
  System.out.println("Exception handled");
  System.out.println(e.getMessage());
}
  }
}
