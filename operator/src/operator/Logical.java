package operator;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean a,b;
		
		System.out.print("첫번째 논리값(true or false) : ");
		a = sc.nextBoolean();
		System.out.print("두번째 논리값(true or false) : ");
		b = sc.nextBoolean();
		
		System.out.println("!"+a+" = "+(!a));
		System.out.println(a+" && "+b+" = "+(a && b));
		System.out.println(a+" ^ "+b+" = "+(a ^ b));
		System.out.println(a+" || "+b+" = "+(a || b));
		sc.close();

	}

}
