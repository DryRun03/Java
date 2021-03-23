import java.util.Scanner;
public class Chatbot
{
    public static void main(String[] args)  
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello what is your name?");
        String name =scan.nextLine();
        
        System.out.println("Hi " + name + " I am Javabot, Where are you from?");
        String city = scan.nextLine();

        System.out.println(" I heard it's beautiful at " + city + " I am from a place called Oracle. How old are you?");
        int age = scan.nextInt();

        System.out.println("So you are "+ age + " cool! I am 400 years old." + \"  This means i am  " + (400/age) + " times older than you.");
        System.out.println("\n Enough about me. what's your favourite language?(just don't say C++)");
        scan.nextLine();
        String program =scan.nextLine();

        System.out.println( program + " Fair enough. How many years have you been coding in " + program + " ?");
        int time = scan.nextInt();

        System.out.println(time + " years eh?, That's great, keep it up!");
        System.out.println("/n Nice Chatting with you " + name +". I have to log off now. See ya!");

        scan.close();
    }  
}
