class BankAccount {
    private String accountNumber;
    private String holderName;
    private int balance;
    BankAccount(String accountNumber, String holderName){
        this.accountNumber= accountNumber;
        this.holderName=holderName;
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("\nBalance Successfully Deposited.");
        System.out.println("Your New Balance: "+balance);
    }
    void withdraw(int amount){
        if(balance>=amount){
            System.out.println("\nWithdrawing...");
            balance-=amount;
            System.out.println("Your New Balance: "+balance);
        }
        else
            System.out.println("\nInsufficient Balance!");
    }
    void getInfo(){
        System.out.println("\nAccount Details:");
        System.out.println("Account Holder Name: "+holderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789","Samyak");
        account1.deposit(5000);
        account1.withdraw(1000);
        account1.getInfo();
    }
}

