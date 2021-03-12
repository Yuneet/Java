public class Circle{
	public static void main(String[] arge) {
		final double pi = 3.14;
		double re = 10.2;
		double ca = pi*re*re;
		double cc = 2*pi*re;
		
		System.out.println("반지름 "+re);
		System.out.println("원의 면적 "+ca);
		System.out.printf("원의 둘레 %.2f",cc);
	}
	
}