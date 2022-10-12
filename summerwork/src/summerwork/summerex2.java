package summerwork;
import java.util.*;
public class summerex2 {
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter first candidate serial number and height"); // receiving metrics of the first candidate
		int serial= read.nextInt();
		int height= read.nextInt();
		System.out.println("Enter second candidate serial number and height"); // receiving metrics of the second candidate


		int serial2= read.nextInt();
		int height2= read.nextInt();

		while(serial!=-1) {

			System.out.println("The serial number of the first candidate: " + serial + " The height of the first candidate: " + height+ "cm");
			System.out.println("The serial number of the second candidate: " + serial2 + " The height of the second candidate: " + height2+ "cm");

			System.out.println("Enter serial number and height"); 
			serial= read.nextInt();
			height= read.nextInt();
			serial2 = read.nextInt();
			height2= read.nextInt();

		}
	}

}
