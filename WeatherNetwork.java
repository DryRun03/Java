import java.util.Scanner;
public class WeatherNetwork
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Temperature:");
        int temp = scan.nextInt();
    if(temp > -15 && temp <=0)
    {
        System.out.println("It's freeezing outside, Stay Home!");
    }
    else if (temp>0 && temp<=10){
        System.out.println("The Forecast is Chilly!,wear a coat");
    }
    else {
        System.out.println("Its Warm Go Outside!");
        //scanner.close();
    }
    }
}
