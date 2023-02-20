// 내적(https://school.programmers.co.kr/learn/courses/30/lessons/70128)

package level1;

public class DotProduct {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { -1, 0, 1 };
		System.out.println(solution(a, b));
	}

	public static int solution(int[] a, int[] b) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i] * b[i];
		}
		return sum;
	}

}
