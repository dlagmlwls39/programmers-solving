// 콜라츠 추측(https://school.programmers.co.kr/learn/courses/30/lessons/12943)

package level1;

import java.util.*;

public class Collatz {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextInt();
		System.out.println(solution(num));
	}
	
	public static int solution(long num) {
        	if (num == 1) return 0;

        	for(int i = 0; i < 500; i++){
            	if(num == 1){
                	return i;
            	}else{
                	num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            	}
        	}
        	return -1;
    	}
	
}
