import java.util.Scanner;
class bird{
	public static void main(String[]args)
	{    int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number said by the number");
		int n=sc.nextInt();
		while(n!=0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
		System.out.println("Patric and johnny must follow the path to find the Alice "+sum);
	}
}
		
      