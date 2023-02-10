// 정수 제곱근 판별(https://school.programmers.co.kr/learn/courses/30/lessons/12934)

package level1;

import java.util.*;

public class CheckIntegerSqrt {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(solution(n));
	}
	
	public static long solution(long n) {
        	long answer = 0;

        	// 방법 1
        	/*
        	for (long i = 1; i <= n; i++) {
            		if (i * i == n) {
                		answer = (i + 1) * (i + 1);
                		break;
            		} else { 
               		answer = -1;
            		}
        	}
        	*/
        
        	// 방법 2
        	double x = Math.sqrt(n);
        	answer = Math.pow((int)x, 2) == n ? (long)Math.pow(x + 1, 2) : -1;
        
        	return answer;
    	}
	
}
