/*
<문제>
P04에서 설계한 Account 클래스를 아래와 같은 기능을 갖도록 수정하고자 한다. 
· Account 클래스의 필드값은 해당 클래스에서만 접근 가능하도록 설정한다.
· Account 클래스는 Account(String name, int balance) 생성자만을 갖는다.
· 반복문을 이용해 총 3명의 고객 객체를 생성하고 객체 배열에 저장한다.
· Account 클래스는 deposit(), withdraw(), showInfo() 메소드 외에 기부를 담당하는 donate() 메소드를 갖는다.
· withdraw() 메소드에서 잔액이 부족할 때 출금할 수 없어야 한다.
· donate() 메소드에서 기부액이 해당 객체의 잔액보다 적어야 하고, 기부가 이루어지면 해당 객체의 잔액이 차감된다.
· 각 고객 객체가 기부한 금액은 모든 객체가 공유하는 변수에 저장한다.
· 총 기부액을 확인하는 메소드를 작성하고, 모든 객체가 사용할 수 있어야 한다.
 */

public class Account {
	private String name;	// 이름 필드
	private int balance;	// 잔액 필드

	// name과 balance 매개변수를 가진 생성자
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
		System.out.println(name + " 고객님의 계좌가 개설되었습니다.");
	}

	// 입금 기능을 하는 메소드
	public void deposit(int d) {
		balance = balance + d;
		System.out.println(name + " 고객님의 계좌로 " + d + "원이 입금되었습니다.");
	}
	
	// 출금 기능을 하는 메소드
	public void withdraw(int w) {
		if(balance < w) {
			System.out.println(name + " 고객님의 잔액이 부족하여 출금할 수 없습니다.");
		}
		else {
			balance = balance - w;
			System.out.println(name + " 고객님의 계좌에서 " + w + "원이 출금되었습니다.");
		}
	}

	// 잔액을 출력하는 메소드
	public void showInfo() {
		System.out.println(name + " 고객님의 잔액: " + balance + "원");
	}
	
	// 기부 기능을 하는 메소드
	public int donate(int d) {
		if(d < balance) {
			balance -= d;
			System.out.println(name + " 고객님이 " + d + "원을 기부하였습니다.");
			return d;
		}
		else
			System.out.println(name + " 고객님의 잔액이 부족하여 기부할 수 없습니다.");
			return 0;
	}
}
