Scanner sc = new Scanner(System.in);
		int t,i,d,c,k,j,p;
		String n;
		char ch;
		System.out.println("Enter the number of test cases");
		t=sc.nextInt();
		for(i=1;i<=t;i++)
		{
			System.out.println("Number");
			n=sc.next();
			c=0;
			for(int s=0;s<n.length();s++)
			{
				ch=n.charAt(s);
				d=(int)ch-48;
				if(d==0||d==6||d==9)
					c=c+6;
				else if(d==2||d==3||d==5)
					c=c+5;
				else if(d==4)
					c=c+4;
				else if(d==1)
					c=c+2;
				else if(d==7)
					c=c+3;
				else
					c=c+7;
			}
			System.out.println("The total number of sticks used are "+c);
			k=c/2;
			if(c%2==0)
			{
				for(j=1;j<=k;j++)
				{
					System.out.print("1");
				}
			}
			else
			{
				p=7;
				for(j=1;j<=k;j++)
				{
					System.out.print(p);
					p=1;
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
