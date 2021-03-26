import java.util.Scanner;

public class CtrlWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¼ıÀÚ : ");
		int n = sc.nextInt();
		int i, sum = 0;
		i = 1;
		while(i <= n-1) {
			System.out.print(i);
			if(i <= n-1) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
			i++;
		}
		System.out.println(sum);

	}

}
