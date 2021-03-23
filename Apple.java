public class Apple
{
    public static void main(String[] args)
    {
        int totalApples= 500;
        //double  costOfOneApple= 0.4;
        double Profit=0L;
        System.out.println("Total Apples: " + totalApples);
        System.out.println("Money= "+ Profit);
        totalApples = 500-4;
        Profit= 0.4*4;
        System.out.println("Apples Bought by First Customer: 4");
        System.out.println("Total Apples left : " + totalApples);
        System.out.println("Money= " + Profit);
        totalApples =500-4-20 ;
        Profit= 0.4*(4+20);
        System.out.println("Apples Bought by Second Customer: 20");
        System.out.println("Total Apples left : " + totalApples);
        System.out.println("Money= " + Profit);
        totalApples = 500-4-20-200;
        Profit= 0.4 * (4+20+200);
        System.out.println("Apples Bought by Third Customer: 200");
        System.out.println("Total Apples left : " + totalApples+ ". We will sell more Tomorrow");
        System.out.println("Money= " + Profit);
       /* totalApples = 496-440-56 ;
        Profit= 0.4 * (4+40+400+56);
        System.out.println("Apples Bought by Fourth Customer: 56");
        System.out.println("Total Apples left : " + totalApples);
        System.out.println("Money= " + Profit);
*/        
    }   
}
