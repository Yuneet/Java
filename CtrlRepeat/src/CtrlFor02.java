import java.util.Scanner;

public class CtrlFor02 {

	public static void main(String[] args) {
		int i, hap =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int n = sc.nextInt();
		
		
		for(i=0;i<=n;i++) {
			hap += i;
		}
		System.out.println("0���� "+n+"������ ����� : "+hap);

	}

}
