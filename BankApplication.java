import java.util.*;

public class BankApplication {
    public static void main(String args[]){
            Scanner n =new Scanner(System.in);
            System.out.println("Enter Your Name ");
            String cname = n.next();
            System.out.println("Enter Your Customer Id");
            String Cid = n.next();

            BankAccount obj1 = new BankAccount(cname, Cid);
            obj1.showMenu();

    }
}
class BankAccount
{
    int balance;
    int previousTransaction;
    String CustomerName;
    String CustomerId;
    BankAccount(String cname, String Cid){
        CustomerName = cname;
        CustomerId = Cid;
    }
    void deposit(int amount)
    {
        if(amount !=0){
            balance = balance + amount;
            previousTransaction =amount;
        }
    }
    void withdraw(int amount)
    {
        if(amount !=0){
            balance = balance -amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction()
    {
        if(previousTransaction>0){
            System.out.println("Deposited : " +previousTransaction);
        }
        else if (previousTransaction<0){
            System.out.println("Withdraw: "+Math.abs(previousTransaction));
        }
        else{
            System.out.println("No transaction Occure");
        }
    }
    void showMenu()
    {
        char option ='\0';
        Scanner n = new Scanner(System.in);

        System.out.println("Welcome " +CustomerName);
        System.out.println("Your Id is "+CustomerId);
        System.out.println("\n");
        System.out.println("A . Check Balance");
        System.out.println("B . Deposite");
        System.out.println("C . Withdraw");
        System.out.println("D . Previous Transaction");
        System.out.println("E . Exit");

        do{
            System.out.println("==========================================");
            System.out.println("Enter an Option : ");
            System.out.println("==========================================");
            option = n.next().charAt(0);
            System.out.println("\n");

            switch(option){
                case 'A':
                   System.out.println("==========================================");
                   System.out.println("Balance " +balance);
                   System.out.println("==========================================");
                   System.out.println("\n");
                   break;

                case 'B':
                   System.out.println("==========================================");
                   System.out.println("Enter an amount to be deposite");
                   System.out.println("==========================================");
                   int amount = n.nextInt();
                   deposit(amount);
                   System.out.println("\n");
                   break;
                case 'C':
                    System.out.println("==========================================");
                    System.out.println("Enter amount to be withdraw");
                    System.out.println("==========================================");
                    int amount2 = n.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("==========================================");
                    getPreviousTransaction();
                    System.out.println("==========================================");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("==========================================");
                    break;
                default:
                    System.out.println("Invalid Option ! Please Enter Again");
                    break;

            }
        }while(option!='E');
            System.out.println("ThankYou for using our Service");
    }
}
