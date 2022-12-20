package com.Interface;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("enter the username and password");
        Scanner input=new Scanner(System.in);
        User.users(input.nextLine(),input.nextLine());
        if(User.auth()==true)
        {
            System.out.println("Entered Username and password is correct");
            int num;
            int k;
            int amount=0;
            int deposit=0;
            int withdraw=0;
            Scanner input1 = new Scanner(System.in);
            char trasction = 'y';

            int transaction[] = new int[20];
            int i=0;
            do
            {
                System.out.println("1. Trasaction History");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");
                System.out.println("\n\nEnter number : ");
                num = input1.nextInt();
                switch(num)
                {
                    case 1:
                        System.out.println("Transaction history: ");
                        for(int j=0;j<i;j++)
                        {
                            System.out.println(transaction[j]);
                        }
                        break;

                    case 2:

                        System.out.println("\nEnter the amount to Deposit: ");
                        int dep = input1.nextInt();
                        amount = amount + dep;
                        System.out.println("current balance: "+amount);
                        transaction[i]=amount;
                        i++;
                        break;
                    case 3:
                        System.out.println("Enter Withdraw Ammount: ");
                        int Withdraw = input1.nextInt();

                        if(Withdraw > amount)
                        {
                            System.out.println("Insufficent Balance:");
                        }
                        else
                        {
                            amount = amount - Withdraw;

                            System.out.println("Your current balance: "+amount);

                            transaction[i]=amount;
                            i++;
                        }
                        break;
                    case 4:

                    {
                        Scanner sc = new Scanner(System.in);
                        System.out.print("\nEnter Receipent's Name : ");
                        String receipent = sc.nextLine();
                        System.out.print("\nEnter amount you wish to transfer : ");
                        Float amount1 = sc.nextFloat();

                        try {
                            if ( amount >= amount1 ) {
                                trasction++;
                                amount -= amount1;
                                System.out.println("\nSuccessfully Transfered to " + receipent);
                                String str = amount1 + " Rs transfered to " + receipent + "\n";

                                transaction[i]=amount;
                                i++;


                            }
                            else {
                                System.out.println("\nInsufficient Balance");
                            }
                        }
                        catch ( Exception e)
                        {
                        }
                    }
                    case 5:
                        System.out.println("THANK YOU");

                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }while(num!=5);
        }
        else
        {
            System.out.println("Entered Username and Password is wrong");
        }
    }
}
