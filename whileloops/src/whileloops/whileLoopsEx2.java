package whileloops;
import java.util.Scanner;
public class whileLoopsEx2 {
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter number");
		int num=read.nextInt();
		int count=0;
		int price=150;

		while(num>=500 && num<=1000)
		{
			count++;

			System.out.println("Enter number");
			num=read.nextInt();

		}


		System.out.println("The number of students going to the trip is " +count);


		if(count>200)
			price=100;

		else if(count>100)
			price=120;

		System.out.println("The price for the trip is "+ count*price + "," + " The price per student is " +price );

		if(count*price>25000)
			System.out.println("The budget exceeded by "+ (count*price-25000));


	}

}
