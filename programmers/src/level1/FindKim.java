// 서울에서 김서방 찾기(https://school.programmers.co.kr/learn/courses/30/lessons/12919)

package level1;

import java.util.*;

public class FindKim {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}
	
	public static String solution(String[] seoul) {
		int x = 0;
        	for (int i = 0; i < seoul.length; i++) {
           		if (seoul[i].equals("Kim")) {
                		x = i;
                		break;
            		}
        	}
        
        	return "김서방은 " + x + "에 있다";
    	}
	
}
