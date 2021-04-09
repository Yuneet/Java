package review;

public class ArrayReturn {
	
	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i=0; i<temp.length;i++) {
			temp[i] = i;
		}
		return temp;
	}
	
	static int[] makeArray2(int n) {
		int temp[] = new int[n];
		for(int i=0; i<temp.length;i++) {
			temp[i] = i;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int Array[], a[], b[];
		Array = makeArray();
		a = makeArray2(7);
		b = makeArray2(3);
		for(int i : Array) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i : b) {
			System.out.print(i+" ");
		}
	}

}
