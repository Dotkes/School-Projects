package functions;
import java.util.Scanner;
public class functionsEx4 {
	static Scanner read= new Scanner(System.in);

	public static int numFlipper(int num) {
		int flippedNum=0;
		flippedNum+=num*100; 
		flippedNum+=num%10*10; 
		flippedNum+=(num/10); 

		return flippedNum;
	}


	public static void main(String[] args) {

		for(int i=20; i<=40; i++) {
			System.out.println(numFlipper(i));
		}


	}

}
