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
      total = cost1 + cost2;
      profit1 = 4.35 * adult;
      profit2 = 3.10 * child;
      totalProfit1 = cost2 - profit1;
      totalProfit2 = cost1 - profit2;
      profit = totalProfit1 + totalProfit2;
      
      System.out.printf("The total Profit is $%.2f and the total amount to pay is $%.2f",profit ,total);
      
      
   
   
   
   }



}