import java.util.Scanner;

public class CircleTest { //CircleTest Ŭ������ ����� �����̸��� ��ġ�Ͽ��� �մϴ�

	public static void main(String[] args) { //main�޼ҵ带 �����մϴ�.
		Circle pizza = new Circle(); //Circle Ŭ������ �̿��Ͽ� pizza��� ��ü�� ����ϴ�.
		pizza.radius = 20; //pizza�� radius�� 20�� �����մϴ�.
		pizza.name = "�ڹ� ����"; //pizza�� name�� �ڹ����ڸ� �����մϴ�.
		double area = pizza.getArea(); //double�� area�� pizza�� ��ü�� getArea �޼ҵ带 ȣ���� ������ ���մϴ�.
		System.out.println(pizza.name + "�� ������ "+area); //��¹����� pizza�� name�� area�� ����մϴ�.
		
		Circle donut = new Circle();
		donut.radius = 5;
		donut.name = "�ڹ� ����";
		area = donut.getArea();
		System.out.println(donut.name+" �� ������ "+area);		
	}
}

