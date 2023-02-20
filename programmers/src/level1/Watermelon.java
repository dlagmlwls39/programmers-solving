// 수박수박수박수박수박수?(https://school.programmers.co.kr/learn/courses/30/lessons/12922)

package level1;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(solution(n));
	}

	public static String solution(int n) {
		String answer = "";
		StringBuffer sb = new StringBuffer(answer);

		for (int i = 0; i < n/2; i++) {
			sb.append("수박");
		}
		if (n % 2 == 1) sb.append("수");

		return sb.toString();
	}

}
