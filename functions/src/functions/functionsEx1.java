package functions;
import java.util.Scanner;
public class functionsEx1 {
	static Scanner read=new Scanner(System.in);
	public static int numDigit(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;  // returns number of digits
	}

	public static void main(String[] args) {
		int number;

		for(int i=1; i<=10; i++) { // run 10 times
			System.out.println("Enter a natural number");
			number=read.nextInt();
			System.out.println("Number " + i +  " has " + numDigit(number) + " digits"); // print serial number and digit count
		}

	}

}
