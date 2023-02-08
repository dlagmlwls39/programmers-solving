package level1;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer += n % 10; 
            n /= 10; 
        }
        
        /*
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';  
        }
        */

        return answer;
    }
}
