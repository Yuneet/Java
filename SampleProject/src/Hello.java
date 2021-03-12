import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
			char ch = 0312;
			Scanner sc = new Scanner(System.in);
			System.out.println("입력해라");
			String text = sc.next();
			set(text.toString());
	}
	
	public static void set(String string) {
		if(string == "준수는"){
			System.out.println("바보다");			
		}else{
			System.out.println("test");
		}
	}
}
