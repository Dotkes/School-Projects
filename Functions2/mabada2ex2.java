import java.util.Scanner;
public class mabada2ex2 {
	static Scanner read = new Scanner(System.in);

	public static char kod(double num1, double num2){
		if (num1 > num2)
			return  'p';
		else if (num1 < num2)
			return  'n';
		
		return 'z';
	}

	public static void main(String[] args) {
		int number1, number2;

		for(int i = 1; i <= 8; i++){
			number1 = (int)(Math.random()*201)-100;
			number2 = (int)(Math.random()*201)-100;

			System.out.print(kod(number1, number2)+ ",");

		}


	}

}
