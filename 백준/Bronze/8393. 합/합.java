import java.util.Scanner;

public class Main
{
	static int count0, count1;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num ; i++)
		{
			sum += i;
		}
		System.out.println(sum);		
		
		sc.close();
	}
	
}
