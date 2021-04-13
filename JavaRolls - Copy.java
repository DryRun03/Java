import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rolling Java. Type anything to start.");
        String input = scan.nextLine();
        System.out.println(input);
        int score = 0;
        
        System.out.println("Great, here are the rules:\n");
        System.out.println("• If you roll a 6 the game stops.\n"); 
        System.out.println(" • If you roll a 4 nothing happens. \n");
        System.out.println("• Otherwise, you get 1 point.\n"); 
      System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
      System.out.println("Enter a value");
      int value = scan.nextInt();
      System.out.println(value);
       while(true)
       {

           int random = rollDice();
           if(random>0 && random<6)
           {
               System.out.print("You Rolled: " + random);
               System.out.println("\t one point ");
               score++;
           }
           if(random==4)
           {
               System.out.println("You Rolled: 4 " );
               System.out.println("No. points");
               continue;
           }
           else if(random==6)
           {
               System.out.println(" You Rolled: 6");
               System.out.println("Game Ends.");
               System.out.println("Your Score. " + score);
               break;
           }

       }
       if(score>=3)
       {
           System.out.println("You win!, Your score is " + score);
       }
       else
       {
           System.out.println("Tough Luck!");
       }

    scan.close();
    }

    public static int rollDice()
    {
        double randomNumber = Math.random()*6;
        randomNumber =randomNumber+ 1;
        return (int)randomNumber;
    }
  
  
}
