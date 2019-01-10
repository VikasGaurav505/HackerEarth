package hackerearth;
import java.util.*;
public class TagValidity
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		int i=0,l,s=0,c=0;
		char ch,ch1,v;
		s1=sc.nextLine();
		l=s1.length();
		if(l==9)
		{
			while(i<l-1)
			{
				
				s=0;
				if(i==0||i==4)
				{
					ch=s1.charAt(i);
					ch1=s1.charAt(i+1);
					s=((int)ch-48)+((int)ch1-48);
					i++;
				}
				else if(i==2)
				{
					v=s1.charAt(2);
					if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U'||v=='Y')
					{
						c=1;
					}
					i++;
				}
				else if(i==3||i==7)
				{
					ch=s1.charAt(i);
					ch1=s1.charAt(i+1);
					s=((int)ch-48)+((int)ch1-48);
					i++;
				}
				else if(i==6)
				{
					ch=s1.charAt(i);
					if(ch=='-')
					{
						i++;
					}
					else
					{
						c=1;
					}
				}
				else
				{
					i++;
				}
				if(s%2!=0&&s!=0)
				{
					System.out.print(s+ " ");
					c=1;
				}
			}
		}
		if(c==0&&l==9)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		sc.close();
	}
}
