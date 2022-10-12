package forloops;
import java.util.*;
public class forloopsex3 {
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {
		int num=0;

		for(int i=1; i<=6; i++)
		{
			System.out.println("Enter number");
			num=read.nextInt();

			if(num>99 && num<1000)
			{
				System.out.println(999-num);
			}

		}

	}

}
