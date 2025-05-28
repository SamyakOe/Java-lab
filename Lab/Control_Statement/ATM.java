import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int balance=5000;
        int choice, amount;
        do{
            System.out.println("\nWelcome to KBC ATM");
            System.out.println("\nChoose Options from 1-4");
            System.out.println("1:  Balance Inquiry");
            System.out.println("2:  Withdraw Balance");
            System.out.println("3:  Deposit Balance");
            System.out.println("4:  Exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("\nYour Balance is: "+balance);
                }  
                    break;
                 case 2:{
                    System.out.println("\nEnter amount to Withdraw:");
                    amount=sc.nextInt();
                    if(amount>balance){
                        System.out.println("\nInsufficient Balance");
                    }
                    else{
                        balance-=amount;
                        System.out.println("\nYour new Balance is: "+balance);
                    }
                }
                    break;
                 case 3:{
                    System.out.println("\nEnter the amount to deposit");
                    amount=sc.nextInt();
                    balance+=amount;
                    System.out.println("\nYour new Balance is: "+balance);
                }  
                    break;
                case 4:{
                    System.out.println("\nThank you for banking with KBC ATM");
                }
                    break;
                default:{
                    System.out.println("\nInvalid Option");
                }
                    break;
            }
        }while(choice!=4);
        sc.close();
    }
}
