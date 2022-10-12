package whileloops;
import java.util.Scanner;
public class whileLoopsEx3 {
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Enter a number");
		int num=read.nextInt();
		int count=0;
		int maxcount=0;

		while(num==0 || num==1)
		{

			if(num==1)
				count++;

			else 
				count=0;

			num=read.nextInt();

			if(count>maxcount)
				maxcount=count;

		}

		System.out.print(maxcount);

	}

}
