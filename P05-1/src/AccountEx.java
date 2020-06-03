/*
<문제>
· 총 기부액을 확인하는 메소드를 작성하고, 모든 객체가 사용할 수 있어야 한다.
· 아래의 실행결과와 같이 고객 객체의 모든 메소드를 테스트하고, 반복문을 이용해 모든 고객 객체의 잔액을 확인한다
 */

import java.util.Scanner;

public class AccountEx {
	
	static int totalDonate = 0;
	
	// 총 기부액을 확인하는 메소드
	static void funTotalDonate(){
		System.out.println("총 기부액: " + totalDonate);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account [] c = new Account[3]; 

		System.out.println("이름과 금액을 입력해 주세요.");
		
		// 고객 객체를 생성하고 객체 배열에 저장
		for(int i=0; i<c.length; i++) {
			System.out.print("이름: ");
			String n = scanner.next();
			System.out.print("입금: ");
			int m = scanner.nextInt();
			c[i] = new Account(n,m);
			c[i].showInfo();
		}
		System.out.println();
		
		c[0].deposit(10000);
		c[0].withdraw(5000);
		totalDonate += c[0].donate(1000);
		funTotalDonate();
		c[1].withdraw(31000);
		funTotalDonate();
		totalDonate += c[2].donate(22000);
		funTotalDonate();
			
		// 모든 고객의 잔액 확인
		for(int j=0; j<c.length; j++) {
			c[j].showInfo();
		}
		scanner.close();
	}
}
