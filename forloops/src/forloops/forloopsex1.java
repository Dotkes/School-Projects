package forloops;

public class forloopsex1 {

	public static void main(String[] args) {

		int count=0;

		for(int i=1000; i<=9999; i++)
		{
			if(i/1000 == i%10 && i/100%10 == i/10%10 )
			{
				System.out.println(i);
				count++;
			}
		}

		System.out.println(count);


	}

}
