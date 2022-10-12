package functions;
import java.util.Scanner;
public class functionsex3 {
	static Scanner read= new Scanner(System.in);

	public static int numDigit(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}

	public static int sumDigit(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int digcount1=1, digcount2=0, firstsum=0, secondsum=0, couplecount=0;
		int number1, number2;

		while(digcount1 != digcount2 || firstsum != secondsum ) { // Requested boolean expression

			System.out.println("Enter first natural number");
			number1=read.nextInt();
			System.out.println("Enter second natural number");
			number2=read.nextInt();

			digcount1= numDigit(number1); // Running numDigit on num1
			digcount2= numDigit(number2); // Running numDigit on num2

			firstsum= sumDigit(number1); // Running sumDigit on num1
			secondsum=sumDigit(number2); // Running sumDigit on num2

			if(digcount1 != digcount2 || firstsum != secondsum)
				couplecount++;
			System.out.println("The absolute difference between the digit sum of both numbers is: " + Math.abs(firstsum-secondsum));


		}

		System.out.println("Number of couples received until the digit sum and digit count is equal: " +couplecount); 

	}

}
