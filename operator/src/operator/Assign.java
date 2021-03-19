package operator;

import java.util.Scanner;

public class Assign {

	public static void main(String[] args) {
		int  a,b;
		
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a += b");
		a += b;
		System.out.println(", a => "+a);
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a -= b");
		a -= b;
		System.out.println(", a => "+a);
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a *= b");
		a *= b;
		System.out.println(", a => "+a);
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a /= b");
		a /= b;
		System.out.println(", a => "+a);
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a %= b");
		a %= b;
		System.out.println(", a => "+a);
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a << b");
		a <<= b;
		System.out.println(", a << "+a);
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a >> b");
		a >>= b;
		System.out.println(", a => "+a);
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a >>> b");
		a >>>= b;
		System.out.println(", a => "+a);
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a &= b");
		a &= b;
		System.out.println(", a => "+a);
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a ^= b");
		a ^= b;
		System.out.println(", a => "+a);
		
		a = 1;
		b= 2;
		System.out.print("a = "+a+", b = "+b+" a |= b");
		a |= b;
		System.out.println(", a => "+a);
		
	}

}
