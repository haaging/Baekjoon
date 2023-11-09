import java.io.*;
import java.util.StringTokenizer;

public class Main
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스
		
		
		for(int i=1; i<=T; i++)
		{
			String str = br.readLine();
			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
	
}
