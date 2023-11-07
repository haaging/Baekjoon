import java.util.Scanner;

public class Main
{
	static int count0, count1;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] arr = new int[t];
		int cnt = 0;
		while (t>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[cnt] = a + b;
			cnt++;
			t--;
		}
		
		for(int n : arr) {
			System.out.println(n);
		}
		
		sc.close();
	}
	
}
