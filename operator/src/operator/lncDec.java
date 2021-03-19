package operator;

public class lncDec {

	public static void main(String[] args) {
		int a = 6,b;
		
		//a++, ++a, a +=1, a= a+1
		System.out.println("a = "+a);
		a++;
		System.out.println("a = "+a);
		++a;
		System.out.println("a = "+a);
		a += 1;
		System.out.println("a = "+a);
		a = a+1;
		System.out.println("a = "+a);
		
		a = 1;
		b = a++;
		System.out.println("a = "+a + ",b = "+b);
		
		a = 1;
		b = ++a;
		System.out.println("a = "+a + ",b = "+b);
		
		a = 1;
		b = a++ + a++ + a++ + a++;
		System.out.println("a = "+a + ",b = "+b);
		
		a = 1;
		b = ++a + ++a + ++a + ++a;
		System.out.println("a = "+a + ",b = "+b);
	}

}
