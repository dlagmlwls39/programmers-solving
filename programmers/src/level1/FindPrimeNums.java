// 소수 찾기 (https://school.programmers.co.kr/learn/courses/30/lessons/12921)

package level1;

import java.util.*;

public class FindPrimeNums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner();
		int n = scanner.nextInt();
		System.out.println(solution(n));
	}
	
	public String solution(int n) {
		int answer = 0;
		
		for(int i = 2; i <= n; i++) {  // 1은 소수가 아니므로 제외
			boolean isPrime = true;
			for(int j = 2; j <=  Math.sqrt(i); j++) {  // 나누어 떨어지는 수가 있으면 소수가 아님
        			if(i % j == 0) {
          				isPrime = false;
          				break;
        			}
      			}

      			if (isPrime) answer++;
    		}

    		return answer;
  	}
}
