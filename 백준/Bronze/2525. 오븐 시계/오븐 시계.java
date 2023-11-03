import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		int min = h*60 + m + c;
		
		System.out.println(((min/60)%24) + " " + min%60);
		
		sc.close();
	}
	
}
