package test;

import java.util.*;

public class Q04 {

	public static void main(String[] args) {
		
		
		int n = 0;
		int c = 0; //집 수, 공유기 수
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("집의 개수와 공유기의 개수를 입력하세요 (공백 구분)");
		n = scanner.nextInt();
		c = scanner.nextInt();
		int[] x = new int[n];
	
		System.out.println("집의 좌표를 입력하세요");	
		for(int i=0; i<n; i++) {
			x[i] = scanner.nextInt();
		}
		Arrays.sort(x);
		
		
		
		int a = 1;
		
        int b = x[n-1] - x[0];
        
        int d = 0;
        int ans = 0;
       
		while (a <= b) {
            int mid = (a + b) / 2;
            int start = x[0];
            int count = 1;
            for (int i=0; i<n; ++i) {
                d = x[i] - start;  // 집 거리
                if (d >= mid) {
                    count++;
                    start = x[i];
                }
            }

            if (count >= c) {
                ans = mid;
                a = mid + 1;
            } else {
                b = mid - 1;
            }
        }

		
		
		
		System.out.print("집의 개수: "+n+", ");
		System.out.println("공유기의 개수: "+c);

		System.out.println("답: "+ans);
		
		
		
		
		
		
		
	}

}
