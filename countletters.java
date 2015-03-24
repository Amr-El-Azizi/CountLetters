public class countletters
{
    public countletters()
    {
        int sum = 0;
        int x = 0;
        int temp = 0;
        int tens = 1;
        int temp2 = 0;
        for(int i = 1; i <= 1000; i ++)
        {
            x = i;
            tens = 1;
            if(x < 100)
            temp = x;
            while(x >= 100)
            {
                temp += tens * x%10;
                x = x/10;
                tens = tens * 10;
            }
            if(temp >= 20 && temp < 100)
            {
                temp2 = temp - temp%10;
                temp = temp%10;
                if(temp2 == 20 || temp2 == 30 || temp2 == 80 || temp2 == 90)
                sum += 6;
                else if(temp2 == 50 || temp2 == 60 || temp2 == 40)
                sum += 5;
                else if(temp2 == 70)
                sum += 7;
                if(temp == 1 || temp == 2 || temp == 6 || temp == 10)
                sum +=3;
                else if(temp == 3 || temp == 7 || temp == 8)
                sum += 5;
                else if(temp == 4 || temp == 5 || temp == 9)
                sum +=4;
                else if(temp == 11 || temp == 12)
                sum += 6;
                else if(temp == 15 || temp == 16)
                sum += 7;
                else if(temp == 13 || temp == 14 || temp == 18 || temp == 19)
                sum += 8;
                else if(temp == 17)
                sum += 9;
            }
            
            while(x > 0)
            {
                temp = x%10;
                if(temp == 1 || temp == 2 || temp == 6 || temp == 10)
                sum +=3;
                else if(temp == 3 || temp == 7 || temp == 8)
                sum += 5;
                else if(temp == 4 || temp == 5 || temp == 9)
                sum +=4;
                x = x/10;
                
            }
            if(tens == 10)
            sum += 10;
            if(tens == 100)
            sum += 8;
        }
        System.out.println(sum);
    }
}