package functions;
import java.util.Scanner;
public class functionsEx2 {
	static Scanner read= new Scanner(System.in);

	public static int sumDigit(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum; // re
	}

	public static void main(String[] args) {
		int maxsum=0;
		int numsum=0;
		int maxnum=0;
		System.out.println("Enter a natural number");
		int number=read.nextInt();
		while(number!=0) {
			System.out.println(sumDigit(number)); // print digit sum of (number)
			numsum= sumDigit(number);
			if(numsum>maxsum) { // checking if the new number has more digits than last max
				maxsum=numsum;
				maxnum=number;
			}
			System.out.println("Enter a natural number");
			number=read.nextInt();



		}
		System.out.println("The number with the highest digit sum: " + maxnum + " With the digit sum of: " +maxsum ); // print the number with most digits and the digit count


	}

}
