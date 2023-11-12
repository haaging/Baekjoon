import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int max = -1000001, min = 1000001;
		for (int i = 0; i < N; i++)
		{
			int value = Integer.parseInt(st.nextToken());
			if(value < min)
				min = value;
			if(value > max)
				max = value;
		}
		
		System.out.println(min + " " + max);
		
		br.close();
	}
	
}
