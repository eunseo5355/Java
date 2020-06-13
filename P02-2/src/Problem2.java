/*
<문제>
사용자로부터 돈의 액수를 입력받아 50000원, 10000원, 1000원, 500원, 100원, 10원, 1원 단위로 각각 몇 개씩 환산되는
지 계산하는 프로그램을 작성하세요. 단, 환산할 돈의 단위를 아래와 같이 배열을 이용하여 작성하고 반복문을 활용합니다.
int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
 */
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
