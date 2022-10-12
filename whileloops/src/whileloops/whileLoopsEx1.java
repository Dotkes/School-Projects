package whileloops;
import java.util.Scanner;
public class whileLoopsEx1 {
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter grade");
		int grade=read.nextInt();
		int max=0;
		int second=0;

		while(grade>0)
		{
			if(grade>max)
			{
				second=max;
				max=grade;
			}
			else if(grade>second && grade<max)
			{
				second= grade;
			}
			System.out.println("Enter grade");
			grade=read.nextInt();

		}


		if(grade>max)
		{
			second=max;
			max=grade;
		}
		else if(grade>second && grade<max)
		{
			second= grade;
		}
		System.out.println("Best grade is " +max);
		System.out.println("The second best grade is " +second);


	}
}


