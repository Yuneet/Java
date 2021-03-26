import java.util.Scanner;

public class CtrlFor02 {

	public static void main(String[] args) {
		int i, hap =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		
		
		for(i=0;i<=n;i++) {
			hap += i;
		}
		System.out.println("0부터 "+n+"까지의 모든합 : "+hap);

	}

}
