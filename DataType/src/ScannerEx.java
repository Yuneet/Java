import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("나이를 입력해주세요.");
		int a = sc.nextInt();
		System.out.println("이름은 "+name+"이고"+" 나이는 "+a+"살 맞습니까?(예/아니요)");
		String b = sc.next();
		if(b == "예") {
			System.out.println("어서오세요 "+name+"님");
		}else if(b == "아니요") {
			System.out.println("취소되었습니다.");
			return;
		}else {
			System.out.println("잘못된 값을 입력하셨습니다.");
			return;
		}
	}

}
