import java.io.*;
import java.util.StringTokenizer;

public class Main
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] < X)
				sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb);
		
		br.close();
	}
	
}
