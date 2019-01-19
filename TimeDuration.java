import java.util.*;
public class Duration
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,t,j;
		System.out.println("Enter the number of works");
		t=sc.nextInt();
		n=2;
		int hr[]=new int[n];
		int min[]=new int[n];
		int res[]=new int[n];
		for(j=1;j<=t;j++)
		{
			System.out.println(j+" iteration");
			for(i=0;i<n;i++)
			{
				hr[i]=sc.nextInt();
				min[i]=sc.nextInt();
			}
			for(i=1;i<n;i++)
			{
				if((hr[i]-hr[i-1]==0)||(hr[i]-hr[i-1]==1))
				{
					if(hr[i]==hr[i-1]&&min[i]>min[i-1])
					{
						res[i-1]=0;
						res[i]=min[i]-min[i-1];
					}
					else
					{
						if((hr[i]-1)==hr[i-1]&&min[i]>=min[i-1])
						{
							res[i-1]=1;
							res[i]=min[i]-min[i-1];
						}
						else
						{
							res[i-1]=0;
							res[i]=(60-min[i-1])+min[i];
						}
					}
				}
				else
				{
					if(min[i]>=min[i-1])
					{
						res[i-1]=hr[i]-hr[i-1];
						res[i]=min[i]-min[i-1];
					}
					else
					{
						res[i-1]=hr[i]-hr[i-1]-1;
						res[i]=(60-min[i-1])+min[i];
					}
				}
			}
				for(i=0;i<n;i=i+2)
				{
					System.out.println(res[i]+" "+res[i+1]);
				}
		}
		sc.close();
	}
}
