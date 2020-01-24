import java.util.Scanner;
class stics{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of stics");
		int num=sc.nextInt();
		int re= num%4;
		int numb_st_sq=num-re;
		int num_st_side=numb_st_sq/4;
		int len_side=num_st_side*2;
		int area=len_side*len_side;
	 System.out.println("Area "+area);
	}
}
		
		
		
		
		
		
		
	