// 기사단원의 무기 (https://school.programmers.co.kr/learn/courses/30/lessons/136798)

package level1;

import java.util.*;

public class KnightsWeapon {
	
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int limit = scanner.nextInt();
    int power = scanner.nextInt();
    System.out.println(solution(number, limit, power));
  }
  
  public int solution(int number, int limit, int power) {
    int answer = 0;
    int[] numList = new int[number];

    // 0으로 초기
    Arrays.fill(numList, 0);

    // 약수 개수 구하기 
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j * j <= i; j++) {
        if (j * j == i) numList[i-1]++;
        else if (i % j == 0) numList[i-1] += 2;  // 곱한 두 수
      }
    }

    // 공격력 제한 수치보다 크면 무기의 공격력으로 대체
    for (int i = 0; i < number; i++) {
      if (numList[i] > limit) answer += power;
      else answer += numList[i];
    }
    
    return answer;
  }

}
