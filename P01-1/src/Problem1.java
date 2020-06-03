/*
<문제>
사용자로부터 초를 입력받아 아래와 같이 시, 분, 초로 계산하여 출력하는 프로그램을 작성하세요. 
단, 초는 정수로 입력받아야 하고 Scanner 클래스를 활용합니다.
 */
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("초를 입력하세요: ");  // 입력 안내문 출력
		int sec = scanner.nextInt();  // 초 입력받기
		int hour = sec/3600; // 시간 구하기
		int min = sec%3600/60;  // 분 구하기
		int second = sec%3600%60;  // 초 구하기
		System.out.println(sec + "초: " + hour + "시간 "+ min + "분 " + second + "초");  // 결과 출력
		scanner.close();  // scanner 종료
	}
}