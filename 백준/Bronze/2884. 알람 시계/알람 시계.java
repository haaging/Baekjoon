import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m>=45) {
				System.out.println(h + " " + (m-45));
		}
		else {
			if(h>=1)
				System.out.println((h-1) + " " + (60+m-45));
			else
				System.out.println(23 + " " + (60+m-45));
		}
		
		sc.close();
	}
	
}
