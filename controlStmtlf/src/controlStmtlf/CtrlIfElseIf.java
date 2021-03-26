package controlStmtlf;

import java.util.Scanner;

public class CtrlIfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("성적입력 : ");
		score = sc.nextInt();

		if(score >= 90) {
			System.out.println("등급 A");
		}else if(score >= 80) {
			System.out.println("등급 B");
		}else if(score >= 70) {
			System.out.println("등급 C");
		}else if(score >= 60) {
			System.out.println("등급 D");
		}else {
			System.out.println("등급 F");
		}
		
		sc.close();
	}

}
