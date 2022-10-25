import java.util.Scanner;
public class mabada2ex1 {
	static Scanner read = new Scanner(System.in);

	public static int multiplier(int num1,int num2){
		int sum = 0;
		for(int i = 1; i <= num1; i++){
			sum += num2;
		}
		return sum;
	}

	public static void main(String[] args) {
		int number1, number2 = 1, result = 0;
		System.out.println("Enter a natural positive number");
		number1 = read.nextInt();
		while(number1 != 0){
			result = multiplier(number1, number2);
			number2 = result;
			System.out.println("Enter a natural positive number");
			number1 = read.nextInt();
		}
		System.out.println(result);
	}

}
