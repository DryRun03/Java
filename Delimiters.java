import java.util.Scanner;
public class Delimiters
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two Integers(On the same line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter Two big Integers(On the same line)");
        long bigNum1= scan.nextLong();
        long bigNum2= scan.nextLong();

        System.out.println("Enter Two Decimals(On the same line)");
        double dec1 =scan.nextDouble();
        double dec2 = scan.nextDouble();

        System.out.println("Enter Two Text Values(On the same line)");
        String text1= scan.next();
        String text2 = scan.next();
        
        scan.close();

        System.out.println("\t "+ "Entered Integers are " + num1 + " and " + num2);
        System.out.println("\t "+ "Entered Long Integers are " + bigNum1 + " and " + bigNum2);
        System.out.println("\t "+ "Entered Integers are " + dec1 + " and " + dec2);
        System.out.println("\t "+ "Entered Integers are " + text1 + " and " + text2);
    }    
}
