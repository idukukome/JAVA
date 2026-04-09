import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        boolean infiniteLoop = true;
        double[] accountBalance = new double[1000]; //this array will contain the account the account balance
        String[] accountName = newString[1000]; //this array will contain the account holder's name
        int option, size = 100;//size will be the first account you want to begin from
        //infinite loop to keep our program running until we wish to end it.
        while (infiniteLoop) {
            System.out.println("Welcome to codingal banking Services");
            System.out.println("Banking Menu: ");
            System.out.println("Select any one option from below: ");
            System.out.println("1-> Add Customer");
            System.out.println("2-> Change Customer Name");
            System.out.println("3-> Check Account Balance");
            System.out.println("4-> Update Account Balance");
            System.out.println("5-> Summary of All Accounts");
            System.out.println("6-> Quit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your option to proceed ahead: ");
            option = sc.nextInt();
            //instead of if we can even use swith case here
            if (option == 1) {
                System.out.println("\nAdd customer \nMenu->");


                sc.nextLine();

                System.out.print("\nEnter Customer Name: ");
                String name = sc.nextLine();
                accountName[size] = name;
                System.out.print("Enter Opening Balance Account: ");
                double amt = sc.nextDouble();
                accountBalance[size] = amt;

                System.out.println("Account created successfully. \n");
                System.out.println("Account Details:- \n ");
                System.out.println("Account Number: " + (size));
                System.out.println("Account Name: " + accountName[size]);
                System.out.println("Account Balance: " + accountBalance[size] + "Rs \n");
                System.out.println("================================");
                size = size + 1;

            } else if (option == 2) {

                System.out.println("\nChamge Customer Name Menu");
                System.out.print("Enter Account Number: ");
                //this is infact the logic of swapping
                int accountIndex;
                String temp;

                accountIndex = sc.nextInt();
                sc.nextLine();

                if (accountIndex > size) {
                    System.out.println("Account not found.");
                };
            }
            }
        }
    }
}