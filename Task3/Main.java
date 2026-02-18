import java.util.Scanner;

class BankAccount {
    private double balance;

  
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            return true;
        } else {
            System.out.println("Insufficient Balance!");
            return false;
        }
    }

   
    public double getBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount account;

  
    public ATM(BankAccount account) {
        this.account = account;
    }

    
    public void showMenu() {
        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

   
    public void start() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Invalid Amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0) {
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid Amount!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

public class ATMInterfaceSaurav {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(10000);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
