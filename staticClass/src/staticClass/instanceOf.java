package staticClass;

class Person1 {}
class Student1 extends Person1 {}
class Researchar extends Person1 {}
class Professor extends Researchar {}

public class instanceOf {
	static void print(Person1 p) {
		if(p instanceof Person1) {
			System.out.print("Person ");
		}
		
		if(p instanceof Student1) {
			System.out.print("Student ");
		}
		
		if(p instanceof Researchar) {
			System.out.print("Researchar ");
		}
		
		if(p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student -> "); print(new Student1());
		System.out.print("new Researchar -> "); print(new Researchar());
		System.out.print("new Professor -> "); print(new Professor());
	}
}
