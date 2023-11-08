import java.io.*;

public class Main
{
	static int count0, count1;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N/4; i++)
			sb.append("long ");
		
		System.out.println(sb.append("int").toString());
	}
	
}
