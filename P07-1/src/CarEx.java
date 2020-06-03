/*
<문제>
· main() 메소드에서는 아래와 같은 동작을 수행하도록 작성한다.
 - 세 개의 객체를 저장하는 Car 타입의 객체 배열을 만든다.
 - Sedan 객체, Truck 객체, SUV 객체를 하나씩 생성하고, 각각 객체 배열의 원소로 설정한다.
 - 객체 생성 시 자동차 이름을 전달하지 않으면, 객체의 name은 "성공회자동차"로 설정된다.
 - 반복문을 이용하여 객체 배열의 모든 원소에 대해 accelPedal() 메소드를 3번 호출하여 speed를 증가시키고, 아래 실
행결과와 같이 showSpeed() 메소드를 통해 증가된 speed 값을 출력한다.
 - 반복문을 이용하여 객체 배열의 모든 원소에 대해 breakPedal() 메소드를 2번 호출하여 speed를 감소시키고, 아래 실
행결과와 같이 showSpeed() 메소드를 통해 감소된 speed 값을 출력한다.
· 인터페이스와 클래스들은 Car.java 파일에 작성하고, main()이 포함된 테스트 코드는 CarEx.java 파일에 작성한다.
 */

public class CarEx {

	public static void main(String[] args) {
		// 객체 배열 생성
		Car [] c = new Car[3];
		c[0] = new Sedan("람보르기니");
		c[1] = new Truck("볼보");
		c[2] = new SUV();
		
		// 속도 증가
		for(int i = 0; i<3; i++) c[0].accelPedal();
		
		for(int i = 0; i<3; i++) c[1].accelPedal();
		
		for(int i = 0; i<3; i++) c[2].accelPedal();
		
		// 증가된 speed 값 출력
		for(int i = 0; i<3; i++) c[i].showSpeed();
		
		System.out.println();
		
		// 속도 감소
		for(int i = 0; i<2; i++) c[0].breakPedal();
		
		for(int i = 0; i<2; i++) c[1].breakPedal();
		
		for(int i = 0; i<2; i++) c[2].breakPedal();
		
		// 감소된 speed 값 출력
		for(int i = 0; i<3; i++) c[i].showSpeed();

	}

}
