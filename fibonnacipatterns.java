public class fibonnacipatterns
{
    public fibonnacipatterns()
    {
	long sum = 0;
	int x = 0;
	int y = 0;
	for(int i =0; i < 1000; i ++)
	{
	   sum += i;
	   y = i;
	   i += x;
	   x = y;
	   System.out.print(sum + "\t");
	   System.out.println(i);
	}
	System.out.println(sum);
    }
}
