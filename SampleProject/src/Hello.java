import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
			char ch = 0312;
			Scanner sc = new Scanner(System.in);
			System.out.println("�Է��ض�");
			String text = sc.next();
			set(text.toString());
	}
	
	public static void set(String string) {
		if(string == "�ؼ���"){
			System.out.println("�ٺ���");			
		}else{
			System.out.println("test");
		}
	}
}
