package whileloops;
import java.util.Scanner;
public class test1 {
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter number");
		int num=read.nextInt();
		int sum=0;
		


		while(num>9)
		{
         

			while(num>0)
			{
				System.out.print(num%10 + " +");
				sum+=num%10;
				num/=10;

			}
                  
			System.out.print("=" + sum);
              num=sum;
                  sum=0;
		}
		
		

	}

}
