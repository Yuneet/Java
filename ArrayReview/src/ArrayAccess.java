import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int intArray[];
		intArray = new int[5];
		int max = -2147483648;
		int min = 2147483647;
		System.out.print("��� 5�� �Է� : ");
		for(int i=0;i<intArray.length;i++) {
			intArray[i] = scn.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
			}
			if(intArray[i] < min) {
				min = intArray[i];
			}
		}
		System.out.println("�Է��� ���� ���� �ִ밪 : "+max);
		System.out.println("�Է��� ���� ���� �ּҰ� : "+min);
		scn.close();

	}

}
