import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오: ");  // 입력 안내문 출력
		int a = scanner.nextInt();	// 입력 받기
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};	// 배열 선언하고 초기화
		
		// 배열의 길이까지 반복
		for(int i = 0; i<unit.length; i++) {
			if(i != 0 && a%unit[i-1]/unit[i] != 0) {
				System.out.println(unit[i] + "원 " + "짜리: " + a%unit[i-1]/unit[i] + "개");
			}
			else if(i == 0 && a/unit[i] != 0){
			System.out.println(unit[i] + "원 " + "짜리: " + a/unit[i] + "개");
			}
		}
		scanner.close();
	}
}
