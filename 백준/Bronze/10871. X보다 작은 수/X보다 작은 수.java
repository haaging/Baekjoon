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
		
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++)
		{
			int value = Integer.parseInt(st.nextToken());
			if(value < X)
				sb.append(value).append(" ");
		}
		
		System.out.println(sb);
		
		br.close();
	}
	
}
