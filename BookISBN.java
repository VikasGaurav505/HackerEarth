import java.util.*;
public class BookISBN 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,t,c=0,s=0,d,i=10;
		n=sc.nextInt();
		t=n;
		while(n>0)
		{
			c++;
			n=n/10;
		}
		if(c==10)
		{
			while(t>0)
			{
				d=t%10;
				s=s+(i*d);
				i--;
				t=t/10;
			}
			if(s%11==0)
			{
				System.out.println("Legal ISBN");
			}
			else
			{
				System.out.println("Illegal ISBN");
			}
		}
		else
		{
			System.out.println("Illegal ISBN");
		}
		sc.close();
	}
}
