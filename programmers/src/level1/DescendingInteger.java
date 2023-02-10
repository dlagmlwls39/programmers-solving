// 정수 내림차순으로 배치하기(https://school.programmers.co.kr/learn/courses/30/lessons/12933)

package level1;

import java.util.*;

public class DescendingInteger {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextInt();
		System.out.println(solution(n));
	}
	
	public static long solution(long n) {
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder(Arrays.toString(arr).replaceAll("[^0-9]",""));
		sb.reverse();

		return Long.parseLong(sb.toString());
	}
	
}
