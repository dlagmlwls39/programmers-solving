// x만큼 간격이 있는 n개의 숫자(https://school.programmers.co.kr/learn/courses/30/lessons/12954)

package level1;

import java.util.*;

public class IntervalOfX {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long x = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println(Arrays.toString(solution(x, n)));
	}
	
	public static long[] solution(long x, int n) {
        	long[] answer = new long[n];
        	for(int i = 0; i < n; i++) {
            	answer[i] = x * (i + 1);
        	}
        
        	return answer;
    	}
	
}
