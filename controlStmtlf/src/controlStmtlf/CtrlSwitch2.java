package controlStmtlf;

import java.util.Scanner;

public class CtrlSwitch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("��(1~12)�Է� : ");
		month = sc.nextInt();
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("���Դϴ�");
				break;
			case 6:
			case 7:
			case 8:
			    System.out.println("�����Դϴ�");
			    break;
			case 9:
			case 10:
			case 11:
				System.out.println("�����Դϴ�");
				break;
			case 1:
			case 2:
			case 12:
				System.out.println("�ܿ��Դϴ�");
				break;
			default:
				break;
		}
		
	}

}
