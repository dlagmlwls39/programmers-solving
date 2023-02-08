package level1;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(solution(n));
	}
	
	public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
