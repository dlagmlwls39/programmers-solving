// 문자열 내 p와 y의 개수(https://school.programmers.co.kr/learn/courses/30/lessons/12916)

package level1;

import java.util.*;

public class CountPy {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(solution(s));
	}
	
	public static boolean solution(String s) {
        	int pCount = 0, yCount = 0;
        	s = s.toUpperCase();
   
        	for (int i = 0; i < s.length(); i++) {
            		if (s.charAt(i) == 'P') pCount++;
            		else if (s.charAt(i) == 'Y') yCount++;
        	}

        	return pCount == yCount;
    	}
	
}
