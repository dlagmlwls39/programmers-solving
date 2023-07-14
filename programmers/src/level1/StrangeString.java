// 이상한 문자 만들기 (https://school.programmers.co.kr/learn/courses/30/lessons/12930)

package level1;

import java.util.*;

public class strangeString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(solution(s));
	}
	
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
	      	String [] str = s.split("");
	      	int index = 0;  // 단어 기준 인덱스값
	
	      	for (String data : str) {
	        	// data가 공백이면 index 0으로 초기화, 공백이 아니면 index 증가
	          	if (data.equals(" ")) {
	              		index = 0;
	              		answer.append(data);
	          	} else { 
	              		// index가 짝수면 대문자, 홀수면 소문자로 변환 후 추가
	              		answer.append((index % 2 == 0) ? data.toUpperCase() : data.toLowerCase());
	              		index++;
	          	}
	      	}
		return answer.toString();
	}

}
