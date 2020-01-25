import java.util.Scanner;
public class prob08{
    public static void main(String args[]){
        int a=0,i=0,b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your target");
        int target=sc.nextInt();
        
        while(a<target)
        {
			b=sc.nextInt();
            a=a+b;
            i=i+1;
        }
        System.out.println("the number of turns is : "+ i);
    
    }
    
}