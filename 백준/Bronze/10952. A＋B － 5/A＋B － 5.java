import java.io.*;
import java.util.StringTokenizer;

public class Main
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		String input;
		while(true)
		{
			input = br.readLine();
			int a = (input.charAt(0) - 48);
			int b = (input.charAt(2) - 48);
			int sum = a + b;
			if(sum ==0) 
				break;
			
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
	
}
