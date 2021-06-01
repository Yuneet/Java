import java.util.Scanner;

public class CircleTest { //CircleTest 클래스를 만들고 파일이름과 일치하여야 합니다

	public static void main(String[] args) { //main메소드를 정의합니다.
		Circle pizza = new Circle(); //Circle 클래스를 이용하여 pizza라는 객체를 만듭니다.
		pizza.radius = 20; //pizza의 radius에 20을 저장합니다.
		pizza.name = "자바 피자"; //pizza의 name에 자바피자를 저장합니다.
		double area = pizza.getArea(); //double형 area에 pizza의 객체의 getArea 메소드를 호출해 면적을 구합니다.
		System.out.println(pizza.name + "의 면적은 "+area); //출력문으로 pizza의 name과 area를 출력합니다.
		
		Circle donut = new Circle();
		donut.radius = 5;
		donut.name = "자바 도넛";
		area = donut.getArea();
		System.out.println(donut.name+" 의 면적은 "+area);		
	}
}

