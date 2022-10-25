import java.util.Scanner;
public class mabada2ex3 {
	static Scanner read = new Scanner(System.in);

	public static boolean specialNumber(int num){
		int quad = num * 4;
		if ( num %10 == quad /1000 &&
				num /10%10  == quad /100%10 &&
				num /100%10 == quad / 10%10 &&
				num /1000 == quad%10)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int specCount = 0, count = 0, number;
		System.out.println("Enter a natural number");
		number = read.nextInt();

		while(number != 0){
			if(specialNumber(number) == true ){
				System.out.println(number);
				specCount++;
			}
			System.out.println("Enter a natural number");
			number = read.nextInt();
			count++; 
		}

		System.out.println("Amount of numbers " + count);
		System.out.println("Amount of special numbers " + specCount);
	}

}





