import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account[] ATM = new Account[10];
        for (int i = 0; i < 10; i++) {
            ATM[i] = new Account(i, 100, 0);
        }

        int UID;
        System.out.println("Enter an ID:");
        UID = input.nextInt();
        if (UID <= 9 && UID >= 0) {
        while (true) {
            int choice;
            double withdraw, deposit;


            System.out.println("Main menu \n " +
                "1: check balance\n" +
                "2: withdraw\n" +
                "3: deposit\n" +
                "4: exit");
                System.out.println("");
                System.out.println("Enter choice: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The balance is: " + ATM[UID].getBalance());
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        withdraw = input.nextDouble();
                        ATM[UID].withdraw(withdraw);
                        break;
                    case 3:
                        System.out.println("Enter an amount to deposit: ");
                        deposit = input.nextDouble();
                        ATM[UID].deposit(deposit);
                        break;
                    case 4:
                        System.exit(0);
                }
            }

        }

        else {
            System.out.println("Incorrect id");
        }
    }
}
