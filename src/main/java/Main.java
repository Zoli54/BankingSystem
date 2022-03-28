
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //User accounts named by their nickname
        Account_Managing Balazs = new Account_Managing
                (1, "Balázs", "Mótyvai", "Mr");
        Account_Managing Tom = new Account_Managing
                (2, "Tom", "White", "Mr");

            Scanner sc = new Scanner(System.in);
            //Welcoming
            System.out.println("Welcome, please choose an account.");
            System.out.println("");
            System.out.println("1. Balazs");
            System.out.println("2. Tom");

            //The user enters the prefered account
            int accountPicker = sc.nextInt();
            do {
                if (accountPicker == 1) {
                    Balazs.Start();
                }
                if (accountPicker == 2) {
                    Tom.Start();
                }
            }
            while (accountPicker == 1 || accountPicker == 2);
            System.out.println("Please enter a valid number next time!");


        }
    }
