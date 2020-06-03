/*
<문제>
사용자로부터 학생의 점수를 입력받아 배열에 저장하고, 점수 순서대로 출력하는 프로그램을 작성하세요.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score[] = new int[3];
		
		// 점수 입력받기
		for(int i = 0; i < score.length; i++) {
			System.out.print("점수 입력: ");
			score[i] = scanner.nextInt();
		}
	
		Arrays.sort(score); 
		
		System.out.println("1등: " + score[2] + "점");
		System.out.println("2등: " + score[1] + "점");
		System.out.println("3등: " + score[0] + "점");
		
		scanner.close();
		
		/*
		 * 버블정렬
		 * int temp = 0;
		 * for(int i = 0; i < score.length -1; i++){
		 * 	for(int j = 1; j <= (score.length -1) - 1; j++){
		 * 		if(score[j] > score[j-1]){
		 * 			temp = score[j-1];
		 * 			score[j-1] = score[j];
		 * 			score[j] = temp;
		 * 		}
		 * 	}
		 * }
		 * 
		 * for(int i = 0; i < score.length; i++){
		 * 		System.out.println((i+1) + "등: " + score[i] + "점")
		 * }
		 */
	}
}
