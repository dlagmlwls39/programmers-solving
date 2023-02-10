// 핸드폰 번호 가리기(https://school.programmers.co.kr/learn/courses/30/lessons/12948)

package level1;

import java.util.*;

public class HidePhoneNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String phone_number = scanner.next();
		System.out.println(solution(phone_number));
	}
	
	public static String solution(String phone_number) {
        	String answer = "";
        	int index = phone_number.length() - 4;
        	for (int i = 0; i < index; i++) {
            		answer += "*";
        	}
        	answer += phone_number.substring(index);
        	return answer;
    	}
	
}
