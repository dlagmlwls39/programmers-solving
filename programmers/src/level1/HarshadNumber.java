// 하샤드 수(https://school.programmers.co.kr/learn/courses/30/lessons/12947)

package level1;

import java.util.*;

public class HarshadNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(solution(n));
	}
	
	public static boolean solution(int x) {
        	int sum = 0;
        	int i = x;
        	while (i > 0) {
            		sum += i % 10;
            		i /= 10;
        	}
        	return x % sum == 0;
    	}
	
}
