import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸��� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("���̸� �Է����ּ���.");
		int a = sc.nextInt();
		System.out.println("�̸��� "+name+"�̰�"+" ���̴� "+a+"�� �½��ϱ�?(��/�ƴϿ�)");
		String b = sc.next();
		if(b == "��") {
			System.out.println("������� "+name+"��");
		}else if(b == "�ƴϿ�") {
			System.out.println("��ҵǾ����ϴ�.");
			return;
		}else {
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			return;
		}
	}

}
