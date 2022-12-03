package ATM;
import java.util.Scanner;
class ATM
 {
     int PIN= 5678;
     Float Balance= 50000f;
      public void checkpin() {
          Scanner ob = new Scanner(System.in);
          System.out.println("Enter the PiN");
          int PIN1 = ob.nextInt();
          if(PIN == PIN1) {
              Menu();
          }
          else {
              System.out.print("Enter a valid PIN");
          }
     }
     public void Menu() {
         System.out.println("1:Check Balance");
         System.out.println("2:Withdraw Balance");
         System.out.println("3:Deposit Balance");
         System.out.println("4: Exit ");
         Scanner ob = new Scanner(System.in);
         int opt = ob.nextInt();
         if (opt == 1) {
             checkBalance();
         }
         if (opt == 2) {
             withdrawl();
         }
         if (opt == 3) {
             Deposit();
         }

     }
         void checkBalance()
         {
             System.out.println(" Your Balance is :"+ Balance);
             Menu();
         }
         void  withdrawl()
         {
             Scanner ob= new Scanner(System.in);
             System.out.println("Enter the Money to be withdrawn ");
             Float Amount= ob.nextFloat();
             if (Amount>Balance)
             {
                 System.out.println("Balance Insufficient ");
             }
             else {
                 Balance= Balance-Amount;
                 System.out.println("Amount Withdrawn Successfully");
             }
             Menu();
         }
         void Deposit()
         {
             Scanner ob= new Scanner(System.in);
             System.out.println("Enter the Money to be Deposited ");
             Float Amount= ob.nextFloat();
             Balance= Balance+Amount;
             System.out.println("Money Deposited Successfully");
             Menu();
         }

 }
public class Main {
    public static void main(String[] args) {
        ATM obj= new ATM();
        obj.checkpin();
    }
}