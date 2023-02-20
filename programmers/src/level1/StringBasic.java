// 문자열 다루기 기본(https://school.programmers.co.kr/learn/courses/30/lessons/12918)

package level1;

import java.util.*;

public class StringBasic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6) {
			for(int i = 0; i < s.length(); i++) {
				if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
					return false;
				}
				return true;
			}
		}
		return false;
	}

}
