// 나머지가 1이 되는 수 찾기(https://school.programmers.co.kr/learn/courses/30/lessons/87389)

package level1;

import java.util.*;

public class RemainderOfOne {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        	int answer = 0;
        	for (int i = 2; i <= n; i++) {
            		if (n % i == 1) {
                		answer = i;
                		break;
            		}
        	}
        	return answer;
    	}
	
}
