package summerwork;
import java.util.*;
public class summerex5 {
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter computer science grade");
		int csgrade=read.nextInt();
		System.out.println("Enter Math grade");
		int mathgrade=read.nextInt();
		int csgod=0;
		int mathgod=0;
		double cssum=0;
		double mathsum=0;
		double gradecounter=0;

		while(csgrade!=-1 && mathgrade !=-1)
		{

			if(csgrade>mathgrade)
			{
				csgod++;
			}

			if(mathgrade>csgrade)
			{
				mathgod++;
			}


			cssum+=csgrade;
			mathsum+=mathgrade;
			gradecounter+=2;


			System.out.println("Enter computer science grade and math grade");
			csgrade= read.nextInt();
			mathgrade= read.nextInt();
		}

		System.out.println("The average computer science grade is " + (cssum/(gradecounter/2)));
		System.out.println("The average math grade is " + (mathsum/(gradecounter/2)));
		System.out.println("The average grade for both subjects is " + (cssum+mathsum)/gradecounter );


	}

}
