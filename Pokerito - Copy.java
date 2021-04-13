import java.util.Scanner;
public class Pokerito
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Let's play Pokerito. Type anything when you're ready.");
        System.out.println("It's like Poker, but a lot simpler. \n");
        System.out.println("• There are two players, you and the computer." + "\n • The dealer will give each player one card.");
        System.out.println("• Then, the dealer will draw five cards (the river)" + "\n • The player with the most river matches wins! ");
        System.out.println("• If the matches are equal, everyone's a winner!" + "\n");
        System.out.println("• Ready? Type anything if you are.");
        String input = scan.nextLine();
        System.out.println(input);
        String yourCard = randomCard();
        String computerCard = randomCard();
        System.out.println(" Here's your card" + yourCard );
        System.out.println("Here's Computer's Card " + computerCard);
        
        int yourMatches = 0;
        int computerMatches =0;

        System.out.println("Now, the dealer will draw five cards. Press enter to continue." + "\n • The dealer will draw a card every time the user presses enter.");
        String card1 = randomCard();
        String card2= randomCard();
        String card3= randomCard();
        String card4= randomCard();
        String card5= randomCard();
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        System.out.println("Card 3: " + card3);
        System.out.println("Card 4: " + card4);
        System.out.println("Card 5: " + card5);

        if(yourCard.equals(card1) || yourCard.equals(card2) || yourCard.equals(card3) || yourCard.equals(card3) || yourCard.equals(card4) || yourCard.equals(card5))
        {
            if(yourCard.equals(card1))
            {
                yourMatches++;
            }
            if(yourCard.equals(card2))
            {
                yourMatches++;
            }
            if(yourCard.equals(card3))
            {
                yourMatches++;
            }
            if(yourCard.equals(card4))
            {
                yourMatches++;
            }
            if(yourCard.equals(card5))
            {
                yourMatches++;
            }

        }
        if(computerCard.equals(card1) || computerCard.equals(card2) || computerCard.equals(card3) || computerCard.equals(card4) || computerCard.equals(card5))
        {
           if(computerCard.equals(card1))
           {
               computerMatches++;
           }
           if(computerCard.equals(card2))
           {
               computerMatches++;
           } 
           if(computerCard.equals(card3))
           {
               computerMatches++;
           }
           if(computerCard.equals(card4))
           {
               computerMatches++;
           }
           if(computerCard.equals(card5))
           {
               computerMatches++;
           }

        }
        System.out.println(" Your Number of Matches: " + yourMatches);
        System.out.println(" Computer number of matches: " + computerMatches);
        if(yourMatches>computerMatches)
        {
            System.out.println("You Won! ");
        }
        else if(computerMatches>yourMatches)
        {
            System.out.println("Computer Won! ");
        }
        else
        {
            System.out.println("It's a tie");
        } 

         scan.close();
    }
    public static String randomCard()
    {
        double randomNumber = Math.random()*13;
        randomNumber+=1;
        int randomm = (int)randomNumber;
        switch(randomm)
        {
        case 1:   
        return "   _____\n"+
               "  |A _  |\n"+ 
               "  | ( ) |\n"+
               "  |(_'_)|\n"+
               "  |  |  |\n"+
               "  |____V|\n";
        case 2:
        return  "   _____\n"+              
                "  |2    |\n"+ 
                "  |  o  |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____Z|\n";
              
        case 3:
        return"   _____\n" +
              "  |3    |\n"+
              "  | o o |\n"+
              "  |     |\n"+
              "  |  o  |\n"+
              "  |____E|\n";

        case 4:
        return "   _____\n" +
               "  |4    |\n"+
               "  | o o |\n"+
               "  |     |\n"+
               "  | o o |\n"+
               "  |____h|\n";

        case 5:
        return  "   _____ \n" +
                "  |5    |\n" +
                "  | o o |\n" +
                "  |  o  |\n" +
                "  | o o |\n" +
                "  |____S|\n";

        case 6:
        return  "   _____ \n" +
                "  |6    |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  |____6|\n";

        case 7:
        return  
                "   _____ \n" +
                "  |7    |\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |____7|\n";
      

        case 8:
        return  "   _____ \n" +
                "  |8    |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  |____8|\n";
        case 9:
        return  "   _____ \n" +
                "  |9    |\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |____9|\n";

        case 10:
        return  "   _____ \n" +
                "  |10  o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |___10|\n";
        case 11:
        return  "   _____\n" +
                "  |J  ww|\n"+ 
                "  | o {)|\n"+ 
                "  |o o% |\n"+ 
                "  | | % |\n"+ 
                "  |__%%[|\n";
        case 12:
        return  "   _____\n" +
                "  |Q  ww|\n"+ 
                "  | o {(|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%O|\n";
        case 13:
        return  "   _____\n" +
                "  |K  WW|\n"+ 
                "  | o {)|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%>|\n";
        default: 
        return "This shouldn't get called.";
        }
    }

}
