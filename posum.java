import java.util.Scanner;
class posum{
	public static void main(String[]args)
	{   int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number how many you want to enter");
		int n=sc.nextInt();
		System.out.println("Enter the number"+n);
		for(int i=0;i<n;i++)
		{
		    int a=sc.nextInt();
			if(a>0)
			{
				sum=sum+a;
			}
					
		}
		System.out.println("the sum of all the possitive "+sum);
	}
}
			 