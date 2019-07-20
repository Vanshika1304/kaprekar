import java.util.*;
public class Kaprekar
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sq,c=0,t,m=0,sum=0,i;
		sq=num*num;
		for(i=sq;i>0;i=i/10)
		{
			c++;
		}
		for(i=c;i>0;i--)
		{
			t=(int)Math.pow(10,(i-1));
			if((sq%t)+(sq/t)==num)
			{
				System.out.println(num+" is a kaprekar number");
				m++;
				break;
			}
		}
		if(m==0)
		{
			while(sq>0)
			{
				sum=sum+(sq%10);
				sq=sq/10;
			}
			if(sum==num)
			{
				System.out.println(num+" is a kaprekar number");
			}
			else
			{
				System.out.println(num+" is not a kaprekar number");
			}
		}
	}
}

			
		