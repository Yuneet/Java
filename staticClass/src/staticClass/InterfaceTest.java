package staticClass;
class Calcu{
	public int calulate(int x, int y) {
		return x + y;
	}
}


class SamsungPhone extends Calcu implements PhoneInterface{
	public void sendCall() {
		System.out.println("전화소리");
		
	}

	public void receiveCall() {
		System.out.println("Hello");
	}
	
	public void flach() {
		System.out.println("휴대폰 플래시");
	}
	
}
public class InterfaceTest {

	public static void main(String[] args) {
		SamsungPhone s = new SamsungPhone();
		s.printLogo();
		s.sendCall();
		s.receiveCall();
		s.flach();
	}
	
	

}
