//import java.util.Scanner;
public class Calander 
{    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String day = "Friday";
        System.out.println("Hey are You Free on " + day + "\n");
        //String day = scan.nextLine();
        // String day = "Friday";
        System.out.println( day );
        System.out.println("Let me Check my calander!");
        Switch(day)
        {
            case "Monday": System.out.println("Sorry, I have to stay at work late!"); break;
            case "Tuesday": System.out.println("It looks like I have meeting all day!"); break;
            case "Wednesday": System.out.println("I have a dentist appointment, some other time?"); break;
            case "Thursday": System.out.println("Sorry Thursday is a date night"); break;
            case "Friday": System.out.println("I am Free"); break;
            case "Saturday": System.out.println("I am Free"); break;
            case "Sunday": System.out.println("I am Free"); break;
            default: System.out.println("That's not a day");
        }

    }
}
