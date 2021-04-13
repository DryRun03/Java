import java.util.Scanner;
public class JavaGram
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter UserName: ");
        String uName = scan.next();
        System.out.println("Please Enter Password: ");
        String password = scan.next();
        while(!password.equals("Java"))
        {
            System.out.println("Incorrect Password or UserName. ");
            uName = scan.nextLine();
            System.out.println("Password: " );
            password = scan.nextLine();
        }
        System.out.println("Welcome!");
        System.out.println(uName);
        scan.close();
    }    
}
