import java.util.Scanner;
class prob05{
  public static void main(String[]args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the chess board : ");
        int board_size=sc.nextInt();
        int max_no_bishop=board_size+(board_size-2);
        System.out.println("The maxinum possible number moves of bishop: "+ max_no_bishop);
    
    }
    
}