package staticClass;
class Calcu{
	public int calulate(int x, int y) {
		return x + y;
	}
}


class SamsungPhone extends Calcu implements PhoneInterface{
	public void sendCall() {
		System.out.println("��ȭ�Ҹ�");
		
	}

	public void receiveCall() {
		System.out.println("Hello");
	}
	
	public void flach() {
		System.out.println("�޴��� �÷���");
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
