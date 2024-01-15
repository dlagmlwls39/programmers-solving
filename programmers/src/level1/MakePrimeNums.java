// 소수 만들기 (https://school.programmers.co.kr/learn/courses/30/lessons/12977)

package level1;

import java.util.*;

public class MakePrimeNums {
	public static void main(String[] args) {
		int nums[] = {1, 2, 7, 6, 4};
		System.out.println(solution(nums));
	}
	
	public String solution(int[] nums) {
	    int answer = 0;
	    int sum = 0;
    
	    for (int i = 0; i < nums.length-2; i++) {  // 첫 번째 수
		for (int j = i+1; j < nums.length-1; j++) {  // 두 번째 수
	        	for (int k = j+1; k < nums.length; k++) {  // 세 번째 수
	          		boolean flag = true;
	          		sum = nums[i] + nums[j] + nums[k];
	          		for (int h = 2; h * h <= sum; h++) { 
	            			if (sum % h == 0) flag = false;  // 소수인지 체크
	          		}   
	          		if (flag == true) answer++;
			}
		}
	    }
	    
	    return answer;
	}
}
