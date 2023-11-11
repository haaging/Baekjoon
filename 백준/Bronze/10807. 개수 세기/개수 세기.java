import java.io.*;
import java.util.StringTokenizer;

public class Main
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int count = 0;
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i <N; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int v = Integer.parseInt(br.readLine());
		
		for (int j = 0; j < arr.length; j++)
		{
			if(v==arr[j])
				count++;
		}
		
		System.out.println(count);
		br.close();
	}
	
}
