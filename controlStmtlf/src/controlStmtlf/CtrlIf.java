package controlStmtlf;

import java.util.Scanner;

public class CtrlIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("당신은 성인 입니다");
		}
		sc.close();
		
	}

}
