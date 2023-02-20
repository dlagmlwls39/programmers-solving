// 문자열 내림차순으로 배치하기(https://school.programmers.co.kr/learn/courses/30/lessons/12917)

package level1;

import java.util.*;

public class ReverseStr {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String answer = "";
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
 
		// 방법 1
		for (int i = s.length() - 1; i >= 0; i--) {
			answer += arr[i] + "";
		}
        return answer;
        
        /* 방법 2
        answer = new String(arr);
        StringBuffer sb = new StringBuffer(answer);
        sb.reverse();
        return sb.toString();
        */
	}
	
}
