import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
	}

}
