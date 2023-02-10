// 나누어 떨어지는 숫자 배열(https://school.programmers.co.kr/learn/courses/30/lessons/12910)

package level1;

import java.util.*;

public class DivisibleArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 5, 9, 7, 10 };
		System.out.println(Arrays.toString(solution(arr, 5)));
	}
	
	public static int[] solution(int[] arr, int divisor) {
		ArrayList array = new ArrayList();
		
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
            	array.add(arr[i]);
            }
        }
		
		Collections.sort(array);
		
		int[] answer = { -1 };
		if(array.size() != 0) {
			answer = new int[array.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = (int) array.get(i);
			}
		}
		return answer;
    }
	
}
