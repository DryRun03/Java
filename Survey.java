import java.util.Scanner;
public class Survey
{
    public static void main(String[] args)
    {
        int counter =0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome , Thank you for answering the questions ");
        
        System.out.println("What is your name?");
        String name= scan.nextLine();
        counter+=1;
        
        System.out.println("How much money do you spend on Coffee?");
        double coffeePrice =scan.nextDouble();
        counter+=1;
        
        System.out.println("How much money do you spend on Fast Food?");
        double fastFood = scan.nextDouble();
        counter+=1;

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter+=1;

        System.out.println("How many times a week do you buy Fast Food");
        int foodAmount = scan.nextInt();
        counter+=1;

        System.out.println("\n Thankyou for answering "+ counter +" questions.");
        System.out.println("You Spend " + (coffeeAmount*coffeePrice)+ " on coffee a week");
        System.out.println("You Spend " + (foodAmount*fastFood)+ " on Fast Food a week");
        System.out.println("Thank You " + name + " for answering the questions");
        scan.close();
    }
}