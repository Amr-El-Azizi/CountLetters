public class evenfibonaccisum
{
   public evenfibonaccisum()
   {
      long sum = 0;
      int x = 0;
      int y = 0;
      for(int i = 0; i <= 4000000;)
      {
	   sum += i;
       y = i;
       i += x;
       x = y;
      }
      System.out.println(sum);
   }
}