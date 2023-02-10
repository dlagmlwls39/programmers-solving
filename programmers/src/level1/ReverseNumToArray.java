// 자연수 뒤집어 배열로 만들기(https://school.programmers.co.kr/learn/courses/30/lessons/12932)

package level1;

import java.util.*;

public class ReverseNumToArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(Arrays.toString(solution(n)));
	}
	
	public static int[] solution(long n) {
        	String str = String.valueOf(n);
        	int[] answer = new int[str.length()];
        
        	int i = 0;
        	while (n > 0) {
            		answer[i++] = (int)(n % 10);
            		n /= 10;
       		}
        
        	return answer;
    	}
	
}
