/*
<문제>
자동차를 나타내는 Car 클래스와 이를 상속받는 Sedan, Truck, SUV 클래스를 작성하려고 한다. 아래 조건에 따라 클래스를
설계하고 테스트하는 프로그램을 작성하세요. 아래 실행결과에서 Sedan, Truck, SUV와 같은 자동차의 클래스 타입을 알기
위해 this.getClass().getName() 메소드를 사용한다.
· Vehicle 인터페이스는 accelPedal()과 breakPedal()의 추상 메소드로 구성된다.
· Car 클래스는 Vehicle 인터페이스를 구현해야 한다.
 - accelPedal() 메소드는 속도를 올린다는 메시지를 출력하고, Car 클래스의 speedUp() 메소드로 speed를 증가시킨다.
 - breakPedal() 메소드는 속도를 내린다는 메시지를 출력하고, Car 클래스의 speedDn() 메소드로 speed를 감소시킨다.
· Car 클래스는 아래의 멤버로 구성된다.
 - 자동차 이름을 나타내는 name과 속도를 표시하는 speed 필드를 갖는다. name은 Car 클래스 내에서만 접근할 수 있고,
speed는 서브 클래스에서도 접근할 수 있다.
 - 생성자는 기본 생성자와 name 값을 설정하는 생성자로 구성된다.
 - 자동차의 클래스 타입, 자동차 이름과 속도를 출력하는 showSpeed() 메소드를 작성한다.
 - 속도를 증가시키는 speedUp() 메소드와 속도를 감소시키는 speedDn() 메소드는 추상 메소드로 설정한다.
· Sedan 클래스, Truck 클래스, SUV 클래스는 모두 Car 클래스를 상속받고, 아래의 조건에 따라 작성한다.
 - 모든 서브 클래스는 기본 생성자와 name 값을 설정하는 생성자로 구성된다.
 - 서브 클래스의 모든 생성자는 super()를 활용하여 작성한다.
 - Sedan 클래스의 speedUp() 메소드는 speed를 10 증가하고, speedDn() 메소드는 speed를 10 감소한다.
 - Truck 클래스의 speedUp() 메소드는 speed를 5 증가하고, speedDn() 메소드는 speed를 5 감소한다.
 - SUV 클래스의 speedUp() 메소드는 speed를 7 증가하고, speedDn() 메소드는 speed를 7 감소한다.
 */

// Vehicle 인터페이스
interface Vehicle {
	// 추상 메소드
	public abstract void accelPedal();
	public abstract void breakPedal();
}

// Car 틀래스
abstract class Car implements Vehicle{
	private String name; // 이름 필드
	protected int speed; // 속도 필드
	
	// 생성자
	public Car() {
		this("성공회자동차");
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	// 추상 메소드
	public abstract void speedUp();
	public abstract void speedDn();

	// 속도를 증가시키는 메소드
	@Override
	public void accelPedal() {
		System.out.println(this.getClass().getName() + " " + this.name + "의 속도를 올립니다.");
		speedUp();
	}
	// 속도를 감소시키는 메소드
	@Override
	public void breakPedal() {
		System.out.println(this.getClass().getName() + " " + this.name + "의 속도를 내립니다.");
		speedDn();
	}	
	
	// 자동차의 클래스 타입, 자동차 이름과 속도를 출력하는 메소드
	public void showSpeed() {
		System.out.println(this.getClass().getName() + " " + this.name + "의 속도는 " + this.speed + "입니다.");
	}
}
	
// Sedan 클래스
class Sedan extends Car{
		
	public Sedan(String name) {
		super(name);
	}
	
	public Sedan() {
		super();
	}
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	@Override
	public void speedDn() {
		speed -= 10;
	}
	
}

// Truck 클래스
class Truck extends Car{
	
	public Truck(String name) {
		super(name);
	}
	
	public Truck() {
		super();
	}
	
	@Override
	public void speedUp() {
		speed += 5;
	}
	@Override
	public void speedDn() {
		speed -= 5;
	}
}

// SUV 클래스
class SUV extends Car{
	
	public SUV(String name) {
		super(name);
	}
	
	public SUV() {
		super();
	}
	
	@Override
	public void speedUp() {
		speed += 7;
	}
	@Override
	public void speedDn() {
		speed -= 7;
	}
}


