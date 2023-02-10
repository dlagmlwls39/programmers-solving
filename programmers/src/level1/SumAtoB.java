// 두 정수 사이의 합(https://school.programmers.co.kr/learn/courses/30/lessons/12912)

package level1;

import java.util.*;

public class SumAtoB {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		System.out.println(solution(a, b));
	}
	
	public static long solution(long a, long b) {
        	if(a == b) return a;
        
        	long answer = 0;
        	long max = Math.max(a, b);
        	long min = Math.min(a, b);
		
        	for (long i = min; i <= max; i++) {
            		answer += i;
        	}
		
        	return answer;
    	}
	
}
