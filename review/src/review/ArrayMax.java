package review;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -2147483648;
		int min = 2147483647;
		int sum = 0;
		double avg;
		
		int Array[] = new int[5];
		
		for(int i=0;i<Array.length;i++) {
			Array[i] = sc.nextInt();
			sum += Array[i];
			
			if(Array[i] > max) {
				max = Array[i];
			}
			if(Array[i] < min) {
				min = Array[i];
			}
		}
		avg = (double)sum/Array.length;
		System.out.print("배열의 원소 = ");
		for(int i=0;i<Array.length;i++) {
			System.out.print(" "+Array[i]);
		}
		
		System.out.println();
		System.out.println("합 = "+sum+", 평균 = "+ avg);
		System.out.println("최대값 = "+max+", 최소값 = "+min);
		sc.close();
	}

}
