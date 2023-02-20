// 약수의 개수와 덧셈(https://school.programmers.co.kr/learn/courses/30/lessons/77884)

package level1;

import java.util.*;

public class DivisorCount {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int left = scanner.nextInt();
		int right = scanner.nextInt();
		System.out.println(solution(left, right));
	}
	
	public static int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) count++;   // 약수 개수
			}
			answer += count % 2 == 0 ? i : -i;
		}
		return answer;
	}
	
}
