import java.util.*;
public class CompareString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    String s1,s2;
	    int s,n,l,c=0;
	    int i,j,k;
	    char ch[];
	    char ch1[];
	    char c1,c2;
	    n=sc.nextInt();
	    for(i=1;i<=n;i++)
	    {
	    	c=0;
	        s1=sc.next();
	        l=s1.length();
	        ch=s1.toCharArray();
	        s2=sc.next();
	        ch1=s2.toCharArray();
	        for(j=0;j<l;j++)
	        {
	        	c1=ch[j];
	        	for(k=0;k<l;k++)
	        	{
	        		c2=ch1[k];
	        		if(c1==c2)
	        		{
	        			ch1[k]='*';
	        			break;
	        		}
	        	}
	        }
	        for(s=0;s<l;s++)
	        {
	        	if(ch1[s]=='*')
	        		c++;
	        }
	        if(c==l)
	        	System.out.println("YES");
	        else 
	        	System.out.println("NO");
	    }
	    sc.close();

	}

}
