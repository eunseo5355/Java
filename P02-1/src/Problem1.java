import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작: ");	// 시작하는 숫자 입력 안내문 출력
		int a = scanner.nextInt();	// 시작하는 숫자 입력받기
		System.out.print("종료: ");	// 종료하는 숫자  입력 안내문 출력
		int b = scanner.nextInt();	// 종료하는 숫자 입력받기
		System.out.print("배수: ");	// 몇의 배수인지 입력하는 안내문 출력
		int c = scanner.nextInt();	// 배수 입력 받기
		int sum = 0;	// 합을 구하는 변수 선언하고 초기화
		
		// 시작하는 숫자부터 끝나는 숫자까지 반복
		for(int i=a; i<=b; i+=c){ 
			sum += i;	// sum변수에 i의 값을 더해준다
		}
		
		System.out.print(a + "부터 " + b + "까지 " + c + "의 배수의 합: " + sum);	// 배수의 합 출력
		scanner.close(); 
	}

}
