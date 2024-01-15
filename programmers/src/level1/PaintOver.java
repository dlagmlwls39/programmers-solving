// 덧칠하 (https://school.programmers.co.kr/learn/courses/30/lessons/161989)

package level1;

import java.util.*;

public class strangeString {
	
	public static void main(String[] args) {
    int n = 8;
    int m = 4;
    int[] section = {2, 3, 6};
		System.out.println(solution(n, m, section));
	}
	
	public String solution(int n, int m, int[] section) {
    int answer = 1;
        
    int current = section[0];
    for (int i = 1; i < section.length; i++) {
      if (section[i] - current >= m) {
        answer++;
        current = section[i];
      }
    }
        
    return answer;
  }
  
}
