// 문자열 내 마음대로 정렬하기 (https://school.programmers.co.kr/learn/courses/30/lessons/12915)

package level1;

import java.util.*;

public class sortString {
	
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	  String[] strings = {"sun", "bed", "car"};
    int n = scanner.nextInt();
		System.out.println(solution(strings, n));
	}
	
	public String[] solution(String[] strings, int n) {    
    Arrays.sort(strings, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        // 기준값(o1.charAt(n))이 비교대상(o2.charAt(n))보다 크면 1 반환
        if (o1.charAt(n) > o2.charAt(n)) return 1;
        // 기준값이 비교대상보다 작으면 -1 반환
        else if (o1.charAt(n) < o2.charAt(n)) return -1;
        // 기준값이 비교대상과 같으면 비교 결과값 반환
        else return o1.compareTo(o2);
      }
    });
    return strings;
  }

}
