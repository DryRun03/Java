import java.util.Scanner;
public class Bank 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***ROYAL BANK OF JAVA***");
        System.out.println("are you here to get the Mortage( yes or no)");
        String option= scan.nextLine();
        switch(option)
        {
            case "no": System.out.println("Have a nice day!"); break;
            case "yes": 
            System.out.println("Greta,In one Line");
            System.out.println("How much Money Do you have in  your savings? " + "\n" + "And How mucb do you own in credit card debt.?");
            int money= scan.nextInt();
            int credit= scan.nextInt();

            System.out.println("How many years have you worked for?");
            int years = scan.nextInt();

            System.out.println("What is Your name?");
            String name= scan.next();
            if(money >19999 && credit >15000)
            {
                System.out.println("Congratulations " + name + "! , you have been approved.");
            }
            else
            {
                System.out.println("Sorry, you are not eligible for the mortage.");
            }
            System.out.println("Have a nice day!");
            break;
        }
    }    
}
