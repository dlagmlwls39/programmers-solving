// 모의고사 (https://school.programmers.co.kr/learn/courses/30/lessons/42840)

package level1;

import java.util.*;

public class MockTest {
	
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] answers = {1, 2, 3, 4, 5};
    System.out.println(solution(answers));
  }
  
  public int[] solution(int[] answers) {
    int[] num1 = {1, 2, 3, 4, 5};
    int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] cnt = new int[3];  // int cnt1 = cnt2 = cnt3 = 0;
    
    for (int i = 0; i < answers.length; i++) {
      if (num1[i % 5] == answers[i]) cnt[0]++;
      if (num2[i % 8] == answers[i]) cnt[1]++;
      if (num3[i % 10] == answers[i]) cnt[2]++;
    }
    
    int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
    
    List<Integer> list = new ArrayList<>();
    if (cnt[0] == max) list.add(1);
    if (cnt[1] == max) list.add(2);
    if (cnt[2] == max) list.add(3);

    // ArrayList -> int array로 변환
    int[] result = new int[list.size()];
    for (int i = 0 ; i < list.size() ; i++) {
      result[i] = list.get(i).intValue();
    }
    
    return result;
  }

}
