import java.util.Scanner;
public class JavaGuess
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-5");
        int number = scan.nextInt();
        while(number!=1)
        {
            number = scan.nextInt();
        }
        System.out.println("You got it!");
        scan.close();
    }    
}
