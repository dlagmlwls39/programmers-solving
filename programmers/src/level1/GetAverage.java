// 평균 구하기(https://school.programmers.co.kr/learn/courses/30/lessons/12944)

package level1;

public class GetAverage {
	
	public static void main(String[] args) {
		int[] n = { 1,2,3,4 };
       	System.out.println(solution(n));
	}
	
	public static double solution(int[] arr) {
		if(arr == null || arr.length == 0) return 0;
     		
        	int sum = 0;
        	for (int i = 0; i < arr.length; i++) {
           		sum += arr[i];
        	}
        
        	/*
        	for(int n : arr) {
            		sum += n;
        	}
        	*/
        
        	return (double) sum / arr.length;
    	}
	
}
