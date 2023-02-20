// 없는 숫자 더하기(https://school.programmers.co.kr/learn/courses/30/lessons/86051)

package level1;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0 };
		System.out.println(solution(numbers));
	}
	
	public static int solution(int[] numbers) {
		int sum = 45;
		for (int i : numbers) {
			sum -= i;
		} 
		return sum;
	}
	
}
