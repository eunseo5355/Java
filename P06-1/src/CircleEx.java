/*
<문제>
아래의 요구 사항을 만족하도록 Circle 클래스와 ColoredCircle 클래스를 설계하고, CircleEx 클래스에서 이들 클래스의
객체를 활용하는 프로그램을 작성하세요.
· Circle 클래스는 radius 필드, showCircle() 메소드, Circle(int radius) 생성자를 갖는다.
· ColoredCircle 클래스는 color 필드, showColoredCircle() 메소드, ColoredCircle(int radius, String color)
생성자를 갖는다.
· ColoredCircle 클래스는 Circle 클래스를 상속받는다.
· 서브 클래스에서는 슈퍼 클래스의 생성자를 명시적으로 선택한다.
· 각 클래스에 대한 객체를 생성하고, 아래와 같은 실행결과가 출력되도록 모든 메소드를 활용한다.
· 모든 클래스는 하나의 소스 파일에 작성한다.
 */

class Circle{
	int radius; // 반지름 필드
	
	// radius 매개변수를 가진 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 결과를 출력하는 메소드
	public void showCircle() {
		System.out.println("반지름이 " + this.radius + "인 원이다.");
	}
}

class ColoredCircle extends Circle{
	String color;  // 색 필드
	
	// radius와 color를 출력하는 생성자
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	
	// 결과를 출력하는 메소드
	public void showColoredCircle() {
		System.out.println("반지름이 " + this.radius + "인 " + this.color + " 원이다.");
	}
}

public class CircleEx {
	public static void main(String[] args) {
		// 객체 생성하고 결과 출력
		Circle a = new Circle(5);
		a.showCircle();
		Circle b = new Circle(10);
		b.showCircle();
		ColoredCircle c = new ColoredCircle(10, "빨간색");
		c.showColoredCircle();
	}
}
