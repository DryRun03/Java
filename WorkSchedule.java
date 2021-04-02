import java.util.Scanner;
public class WorkSchedule
{
    public static void main(String[] args) {
        //int day = 3;       
         boolean holiday = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Day: ");
        double day = scan.nextDouble();
        if(holiday)
        {
            System.out.println("WooHoo!, It's a Holiday");
        }
        else if(day==6 || day==7)
        {
            System.out.println("Its a weekend, NO work");
        }
        else
        {
            System.out.println("Wake up at 7:00 :(");
        }
         //scanner.close();
    }    
}
