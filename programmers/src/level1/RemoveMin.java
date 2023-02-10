// 제일 작은 수 제거하기(https://school.programmers.co.kr/learn/courses/30/lessons/12935)

package level1;

import java.util.*;

public class RemoveMin {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 4, 3, 2, 1 };
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int[] arr) {
        int[] answer = { -1 };
        if (arr.length == 1) return answer;
        else answer = new int[arr.length - 1];
        
        // 최솟값의 인덱스 구하기
        int minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
        	if (arr[minIdx] > arr[i]) minIdx = i;
        }
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
        	if (minIdx != i) {
        		answer[count++] = arr[i];
        	}
        }

        return answer;
    }
	
}
