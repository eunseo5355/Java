/*
<문제>
고객의 은행 계좌를 나타내는 Account 클래스를 아래의 조건에 따라 정의한다. Account 클래스로부터 고객 객체를 생성하
고, 아래의 실행결과를 갖도록 프로그램을 테스트한다.
· Account 클래스의 접근 지정은 public으로 한다.
· Account 클래스는 이름과 잔액을 나타내는 두 개의 필드를 갖는다.
· Account 클래스는 생성자와 main() 메소드 이외에 아래 세 개의 메소드를 갖고 접근 지정은 public으로 한다.
 - deposit(): 입금 기능
 - withdraw(): 출금 기능
 - showInfo(): 잔액 출력
· 고객 객체는 Account 클래스로부터 생성된다.
· 고객 객체의 계좌 개설에 대한 작업은 Account 클래스의 생성자에서 처리한다.
· Account 클래스는 아래와 같은 두 개의 생성자를 갖는다.
 - Account(String name): 계좌 개설 시 입금액이 0인 경우 호출되며 this() 메소드를 활용한다.
 - Account(String name, int balance): 계좌 개설 시 입금액이 0이 아닌 경우 호출됨
· Account 클래스로부터 고객 객체를 생성하여 세 개의 메소드를 테스트한다.
· 고객 객체의 이름과 금액은 임의로 정해도 상관없다.
 */

public class Account {
	String name;	// 이름 필드
	int balance;	// 잔액 필드

	// name 매개변수를 가진 생성자
	public Account(String name) {
		this(name,0);
	}

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
		balance = balance - w;
		System.out.println(name + " 고객님의 계좌로 " + w + "원이 출금되었습니다.");
	}

	// 잔액을 출력하는 메소드
	public void showInfo() {
		System.out.println(name + " 고객님의 잔액: " + balance);
	}

	public static void main(String[] args) {
		Account c1 = new Account("배은서", 10000);	// 객체 생성
		c1.showInfo();

		Account c2 = new Account("홍길동");	// 객체 생성
		c2.showInfo();

		c1.deposit(50000);
		c1.withdraw(2500);
		c1.showInfo();

		c2.deposit(10000);
		c2.withdraw(3000);
		c2.showInfo();
	}
}
