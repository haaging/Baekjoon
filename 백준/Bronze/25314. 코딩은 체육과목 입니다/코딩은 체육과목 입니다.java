import java.util.Scanner;

public class Main
{
	static int count0, count1;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		StringBuffer str = new StringBuffer();
		
		if (n%4!=0)
		{
			n = sc.nextInt();
		}
		
		for (int i = 0; i < n/4; i++)
		{
			str.append("long ");
		}
		
		str.append("int");
		System.out.println(str);
		
		sc.close();
	}
	
}
