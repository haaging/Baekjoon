import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		// 결국 반지름이 중심좌표(x1, y1) 반지름 r1인 원과
		// 중심좌표(x2, y2) 반지름r2인 원의 접점 갯수 구하는 문제!!
		
		List<Integer> list = new ArrayList<Integer>();
		
		while (num>0)
		{
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			
			int l = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
			
			// 1. 중심좌표와 반지름이 같은 경우 -> 접점 무한개
			if(x1==x2 && y1==y2 && r1==r2)
				list.add(-1);
			// 2. 외접하는 경우 (중심좌표간 거리가 두 반지름의 합과 같은 경우) -> 접점 1개
			else if(l == ((r1+r2)*(r1+r2)))
				list.add(1);
			// 3. 원안에 원이 있으면서 접점이 없는 경우 (중심좌표간 거리 < 반지름간 거리) -> 접점 0개
			else if(l<((r1-r2)*(r1-r2)))
				list.add(0);
			// 4. 내접하는 경우 (중심좌표간 거리 == 반지름간 길이) -> 접점 1개
			else if(l == ((r1-r2)*(r1-r2)))
				list.add(1);
			// 4. 원이 떨어져 있는 경우 -> 접점 0개
			else if(l > ((r1+r2)*(r1+r2)))
				list.add(0);
			// 6. 그 외 -> 접점 2개
			else
				list.add(2);
			
			num -= 1;
		}
		
		for (Integer integer : list)
		{
			System.out.println(integer);
		}
		
		
		
		sc.close();
	}
	
}
