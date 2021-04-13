import java.util.Scanner;
public class WorkBook
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by three ");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, Ok!"); 
        System.out.println("Pick a number to count by: ");
        int countBy = scan.nextInt();
        System.out.println("Pick a number to count from: ");
        int starting = scan.nextInt();
        System.out.println(" Pick a number to count to: ");
        int countTo = scan.nextInt();
        for(int i=starting; i<countTo ; i+=countBy)
        {
            System.out.print(i + " ");
            scan.close();
        }
    }    
}
