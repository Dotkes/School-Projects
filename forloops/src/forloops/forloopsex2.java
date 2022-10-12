package forloops;
import java.util.*;
public class forloopsex2 {
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {
		int grade=0;
		int max =0;
		int second=0;

		for(int i=1; i<=10; i++)
		{
			System.out.println("Enter grade");
			grade= read.nextInt();

			if(grade>max)
			{
				second=max;
				max=grade;

			}

			else if(grade>second && grade<max)
				second=grade;

		}

		System.out.println("The best score is " + max);
		System.out.println("The second best score is " + second);




	}

}
