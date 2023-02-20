// 가운데 글자 가져오기(https://school.programmers.co.kr/learn/courses/30/lessons/12903)

package level1;

import java.util.Scanner;

public class GetMiddle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		int length = s.length();
		return s.substring((length - 1)/2, length/2 + 1);
	}

}
