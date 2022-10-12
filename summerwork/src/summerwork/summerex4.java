package summerwork;
import java.util.*;
public class summerex4 {
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {

		int birthyear=0;
		char bloodtype = 0;
		int ocount=0;
		int youngdonorcount=0;

		for(int i=0; i<275; i++)
		{
			System.out.println("Enter birth year");
			birthyear=read.nextInt();
			System.out.println("Enter blood type");
			bloodtype=read.next().charAt(0);

			System.out.println("The donor information: " + '\n' +  "Blood type: " +  bloodtype + '\n' + " Birth year: " + birthyear);

			if(bloodtype == 'O') {
				ocount++;
			}

			if(birthyear>2000) {
				youngdonorcount++;
			}

		}
		System.out.println("The numbers of donors with O blood type: " + ocount);
		System.out.println("The number of donors born after the year 2000: " + youngdonorcount);
	} 

}
