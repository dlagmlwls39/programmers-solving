// 짝수와 홀수(https://school.programmers.co.kr/learn/courses/30/lessons/12937)

package level1;

import java.util.*;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(solution(n));
	}
	
	public static String solution(int n) {
		return n % 2 == 0 ? "Even" : "Odd";
  	}
}
