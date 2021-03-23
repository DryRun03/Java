import java.util.Scanner;
public class Javagram
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n What is your First Name?");
        String fName= scan.nextLine();

        System.out.println("\n What is your Last Name?");
        String lName=scan.nextLine();

        System.out.println("\n How old are you?");
        int age =scan.nextInt();

        System.out.println("\n What is your UserName?");
        String uName =scan.nextline();

        System.out.println("\n Which city do you live in?");
        String city =scan.nextLine();

        System.out.println("\n Which country do you live in?");
        String country=scan.nextLine();

        System.out.println("\n Thankyou for joining Javagram");

        System.out.println("\n Here's the information you entered");
        System.out.println("\t First Name: " + fName);
        System.out.println("\t Last Name: " + lName);
        System.out.println("\t Age : "+ age);
        System.out.println("\t User Name: " + uName);
        System.out.println("\t City: " +city);
        System.out.println("\t Country: "+ country);
        scan.close();


    }
}