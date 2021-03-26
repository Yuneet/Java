package controlStmtlf;

import java.util.Scanner;

public class CtrlSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("성적입력 : ");
		score = sc.nextInt();
		
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("등급 A");
				break;
			case 8:
				System.out.println("등급 B");
				break;
			case 7:
				System.out.println("등급 C");
				break;
			case 6:
				System.out.println("등급 D");
				break;
			default:
				System.out.println("등급 F");
				break;
		}
		 
	}

}
