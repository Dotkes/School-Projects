package summerwork;
import java.util.*;
public class summerex3 {
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {
		int deliverycount=0;
		double sum=0;
		int boxes=0;
		boolean payfordelivery= false;


		for(int i=0; i<4790; i++) // The number of clients is 4790
		{
			System.out.println("Enter amount of boxes");
			boxes=read.nextInt();

			if(boxes<4)
			{
				payfordelivery= true;
				deliverycount++;
			}

			if(payfordelivery==true) // checking if the client has purchased less than 4 boxes
			{
				System.out.println( "The price for the drinks is "+ (boxes*35 + 10));
			}                
			else // a different price for people buying more than 4 boxes
			{
				sum += 35*boxes;
				System.out.println("The price for the drinks is " + boxes*35);

			}

			payfordelivery=false;
		}

		System.out.println("The number of clients that paid for delivery is " + deliverycount + "clients");
		System.out.println("The average price paid for drinks with no delivery is " + sum/(4790-deliverycount));
	}

}
