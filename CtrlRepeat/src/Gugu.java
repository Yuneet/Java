import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단수 : ");
		a = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(a+"*"+i+"="+(a * i));
		}

	}

}
