// 과일 장수 (https://school.programmers.co.kr/learn/courses/30/lessons/135808)

package level1;

import java.util.*;

public class FruitVendor {

  public static void main(String[] args) {
    int k = 3;
    int m = 4;
    int[] score = {1, 2, 3, 1, 2, 3, 1};
    System.out.println(solution(k, m, score));
  }

  public int solution(int k, int m, int[] score) {
    int answer = 0;
    
    Arrays.sort(score);
    
    for (int i = score.length - m; i >= 0; i -= m) {  // 뒤에서부터 m칸씩 이동(각 상자에서 가장 작은 값)
      answer += score[i] * m;
    }
    
    return answer;
  }

}
