// 음양 더하기(https://school.programmers.co.kr/learn/courses/30/lessons/76501)

package level1;

public class SumNegPos {
	
	public static void main(String[] args) {
		int[] absolutes = { 4, 7, 12 };
		boolean[] signs = { true, false, true };
		System.out.println(solution(absolutes, signs));
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int sum = 0;
        	for (int i = 0; i < absolutes.length; i++) {
            		sum += signs[i] ? absolutes[i] : -absolutes[i];
        	}
        	return sum;
    	}
	
}
