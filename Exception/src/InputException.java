import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0,n;
		System.out.println("3개의 정수를 입력하세요.");
		for(int i = 0; i < 3; i++) {
			System.out.print(i+">>");
			try {
				n = scn.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력해주세요.");
				scn.next();
				i--;
				continue;
			}
			sum += n;
		}
		

		System.out.println("합 = "+sum);
		scn.close();
	}

}
