/*
<문제>
Scanner 클래스로 세 개의 정수를 입력받고, 
세 개의 숫자 중 중간 크기의 수를 출력하는 프로그램을 작성하세요.
 */
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 세 개 입력: ");  // 입력 안내문 출력
		
		// 숫자 입력받기
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int mid = 0; // 중간값 0으로 초기화
		
		if (a>=b) {
			if(b>=c) {
				mid = b;
			}
			else if(a>=c && b<=c) {
				mid = c;
			}
			else if(a<=c) {
				mid = a;
			}
		}
		else if(b>=c && c>=a) {
			mid = c;
		}
		else if(c<=a) {
			mid = a;
		}
		else{
			mid = b;
		}
		
		System.out.print("중간값: " + mid);  // 중간값 출력
		scanner.close();  // scanner 종료
	}
	
	/*
	 * a가 최댓값
	 * if ((a>b) && (a>c)) {
	 * 		(mid = (b>c)?b:c;)
	 * 		if(b>c) mid = b;
	 * 		else mid = c;
	 * }
	 * b가 최댓값
	 * else if((b>a) && (b>c)){
	 * 		(mid = (a>c)?a:c;)
	 * 		if (a>c) mid = a;
	 *  	else mid = c;
	 * }
	 * c가 최댓값
	 * else{
	 * 		(mid = (a>b)?a:b;)
	 * 		if(a>b) mid = a;
	 * 		else mid = b;
	 * }
	 */
	
	/*
	 * a가 중간값
	 * if((a>b && a<c) || (a<b && a>c))
	 * 		mid = a;
	 * b가 중간값
	 * else if((b>a && b<c) || (b<c && b>c))
	 * 		mid = b;
	 * c가 중간값
	 * else
	 * 		mid = c;
	 */
}
