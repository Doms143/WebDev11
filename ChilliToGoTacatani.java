import java.util.*;
public class ChilliToGoTacatani
{
   public static void main(String[] args)
   {
      
      Scanner scan = new Scanner(System.in);
      double childPrice = 4, child, adult, adultPrice = 7, profit, total, cost1, cost2, profit1, profit2, totalProfit1, totalProfit2;
      
      System.out.println("Enter Child Order: ");
      child = scan.nextInt();
      System.out.println("Enter Adult Order: ");
      adult = scan.nextInt();
      
      cost1 = child * childPrice;
      cost2 = adult * adultPrice;
      //*total = cost1 + cost2;
      profit1 = 3.10 * child;
      profit2 = 4.35 * adult;
      totalProfit1 = cost2 - profit2;
      totalProfit2 = cost1 - profit1;
      profit = totalProfit1 + totalProfit2;
      
      System.out.printf("The total money collected from adult meal is $%.2f and the total money collected from child meal is $%.2f. \nThe adult meal profit is $%.2f and the child meal profit is $%.2f. The total grand profit is $%.2f.",cost2 ,cost1 ,totalProfit1 ,totalProfit2, profit);
   }



}
