public class FizzBuz 
{
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++)
        {
            if(i%3==0 && i%5==0 )
            {
                System.out.println(i + " FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println(i + " Fizz");
            }
            else 
            {
                System.out.println(i + " Buzz");
            }
        }
    }    
}
