import java.util.Scanner;
public class Dealership
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);    
        System.out.println("Welcome the Pankaj Dealership!");
        System.out.println("• Select OPtion A to buy a Car!");
        System.out.println("• Select Option B to sell a Car!");
        String option =scan.nextLine();
        switch(option)
        {
            case "a":  System.out.println("You choose to Buy a car"); 
                    System.out.println("What is your Budget?"); 
                    int budget = scan.nextInt();
                    if(budget>=100000)
                    {
                    System.out.println("Great a Mercedes is Available");
                    System.out.println("\n Do You have an Insurance?(yes or no) ");
                    scan.nextLine();
                    String insurance =scan.nextLine();
                    System.out.println("Do you have a Driver's License?(yes or no)");
                    String licence = scan.nextLine();
                    System.out.println("What is your credit score?");
                    int creditScore = scan.nextInt();
                    if(insurance.equals("yes")&& licence.equals("yes") && creditScore>660)
                    {
                        System.out.println("Sold! Pleasure doing Business with you");
                    }
                    else {
                        System.out.println("We are sorry, you are not eligible");
                    }
                    } 
                    else if(budget>=50000)
                    {
                        System.out.println("Great, we have a Tesla Available for you!");
                        System.out.println("\n Do You have an Insurance?(yes or no) ");
                        scan.nextLine();
                        String insurance =scan.nextLine();
                        System.out.println("Do you have a Driver's License?(yes or no)");
                        String licence = scan.nextLine();
                        System.out.println("What is your credit score?");
                        int creditScore = scan.nextInt();
                        if(insurance.equals("yes")&& licence.equals("yes") && creditScore>660)
                        {
                            System.out.println("Sold! Pleasure doing Business with you");
                        }
                        else {
                            System.out.println("We are sorry, you are not eligible");
                        }
                    }
                    else if(budget>=10000)
                    {
                        System.out.println("We have a Nissan Available for you");
                    
                        System.out.println("\n Do You have an Insurance?(yes or no) ");
                        scan.nextLine();
                        String insurance =scan.nextLine();
                        System.out.println("Do you have a Driver's License?(yes or no)");
                        String licence = scan.nextLine();
                        System.out.println("What is your credit score?");
                        int creditScore = scan.nextInt();
                        if(insurance.equals("yes")&& licence.equals("yes") && creditScore>660)
                        {
                            System.out.println("Sold! Pleasure doing Business with you");
                        }
                        else {
                            System.out.println("We are sorry, you are not eligible");
                        }
                        
                    }

                    else
                    {
                        System.out.println("We don't sell cars under 10000, Sorry");
                    }
                    break;
                    case "b": System.out.println("You chose to Sell a car"); break; 
            default: System.out.println("Invalid Option.");
        }
     scan.close();  
    }
}
