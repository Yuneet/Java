package operator;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		int  a,b;
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("ù��° ���� : ");
		a = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		b = sc.nextInt();
		
		System.out.printf("(%d < %d)? 1 :2 => %d",a,b,((a<b)?1:2));
		//���� ������ ?: => (���ǽ�)?true:false
		sc.close();

	}

}
