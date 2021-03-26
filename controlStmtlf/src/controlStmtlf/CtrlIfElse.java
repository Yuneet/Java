package controlStmtlf;

import java.util.Scanner;

public class CtrlIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("년도 : ");
		year = sc.nextInt();
		
		if(year%4 ==0 && year%100 !=0 || year%400 ==0) {
			System.out.println(year+"년은 윤년(loop year) 입니다");
		}else {
			System.out.println(year+"년은 평년(common year) 입니다");
		}
		sc.close();
	}

}
