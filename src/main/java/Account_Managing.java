import java.util.Scanner;

public class Account_Managing {

    //Variables used by the managing program
    int currentBalance;
    int transaction;
    int customerID;
    String customerFirstName;
    String customerLastName;
    String prefix;

    //Account import cunstructor
    public Account_Managing (int cid, String cfnm, String clnm, String cpre){
        customerID = cid;
        customerFirstName=cfnm;
        customerLastName=clnm;
        prefix = cpre;
    }

    //Deposit function
    void deposit(int moneyd) {
        if (moneyd != 0) {
            currentBalance = currentBalance + moneyd;
        }
    }
    //Withdrawing function
    void withdraw(int moneyw) {
        if (moneyw != 0) {
            currentBalance = currentBalance - moneyw;
        }
    }

    //Interest calculation
    void calculateInterest() {
        Scanner in = new Scanner(System.in);
        Scanner yr = new Scanner(System.in);

        //User provides the ammount of interest
        System.out.println("Please enter the current interest rate.\n" +
                "(For example in case of a 1,75% rate you should enter .0175).");
        double intrst = in.nextDouble();

        //User provides the ammount of years
        System.out.println("How many years would you like to calculate.(Accepts half years also).");
        double years = yr.nextDouble();

        //Shows the user the results
        double futureMoney = (currentBalance * intrst * years) + currentBalance;
        System.out.println("You will have "+futureMoney+" "+years+" years from now.");
    }
     void Start(){
        Scanner scan = new Scanner(System.in);
        //Welcoming the user, giving it the options.
        System.out.println("Welcome back "+prefix+"."+customerLastName+" !");
        System.out.println("");
        System.out.println("What would you like to do today?\nWrite the number of the option below.");
        System.out.println("");
        System.out.println("B. Show me my account balance.");
        System.out.println("D. I would like to make a deposit.");
        System.out.println("W. I would like to withdraw.");
        System.out.println("I. I would like to calculate my intrest.");
        System.out.println("X. I'm done.Exit!");

        //The user provides the option number
        char op = scan.next().charAt(0);
         if(op != 'X') {
             switch (op) {

                    //The balance check
                 case 'B':
                     System.out.println("Your balance is " + currentBalance);
                     System.out.println("");
                     break;

                     //The deposit
                 case 'D':
                     System.out.println("Please enter the amount of your deposit.");
                     int dep = scan.nextInt();
                     deposit(dep);
                     System.out.println(dep+" has been added to your balance.");
                     System.out.println("");
                     break;
                     //The withdraw
                 case 'W':
                     System.out.println("Please enter the amount you would like to withdraw.");
                     int with = scan.nextInt();
                     withdraw(with);
                     System.out.println(with+" has been withdrew from your balance.");
                     System.out.println("");
                     break;
                    //The interestrate
                 case 'I':
                     calculateInterest();
                     System.out.println("");
                     break;
                 default:
                     System.out.println("Please use a character shown above.");
                     break;
             }
         }
         else{
             System.out.println("Have a great day!");
             System.exit(0);
         }
    }
}
