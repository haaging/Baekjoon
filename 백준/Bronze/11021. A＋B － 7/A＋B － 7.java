import java.io.*;
import java.util.StringTokenizer;

public class Main
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스
		
		StringTokenizer st;
		int i=1;
		
		while(T>0)
		{
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": " + (a+b) + "\n");
			i++;
			T--;
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
}
