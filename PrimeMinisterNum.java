import java.util.*;
public class PMs_Num
{
	public static int isPrime(long x)
	{
		long j,c=0;
		//System.out.println("Check");
		for(j=1;j<=(int)Math.sqrt(x);j++)
		{
			if(x%j==0)
			{
				c++;
			}
		}
		//System.out.println(c);
		if(c==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void PrimeRange(long l,long h)
	{
		long i,s,d,t;
		int k,k1;
		for(i=l;i<=h;i++)
		{
			k=isPrime(i);
			if(k==1)
			{
				//System.out.println(i+" is prime");
				t=i;
				s=0;
				while(t>0)
				{
					d=t%10;
					s=s+d;
					t=t/10;
				}
				//System.out.println(s);
				k1=isPrime(s);
				if(k1==1)
					System.out.print(i+" ");
			}
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long a,b;
		//System.out.println("Enter the range");
		a=sc.nextLong();
		b=sc.nextLong();
		//System.out.println("a="+a+" b="+b);
		PrimeRange(a,b);
		sc.close();
	}
}
