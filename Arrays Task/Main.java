
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Task 6
//		int[] nums;
//		nums = new int[10];
//
//		for (int i = 0; i < 10; i++) {
//			System.out.print("Enter an integer: ");
//			int n = input.nextInt();
//			nums[i] = n;
//		}
//
//		System.out.print("Enter another int: ");
//		int search = input.nextInt();
//		int times = 0;
//
//		for (int i = 0; i < 10; i++) {
//			if (nums[i] == search) {
//				times += 1;
//			}
//		}
//
//		System.out.println(times);
//		input.close();

		// Task 7
//		int[] arr = { 1, 2, 3, 4, 5, 6 };
//
//		System.out.print("Enter a number between 0 and 5: ");
//		int index = input.nextInt();
//		System.out.print("Enter another integer: ");
//		int n = input.nextInt();
//
//		int[] arrnew = new int[arr.length];
//
//		for (int i = 0; i < arrnew.length; i++) {
//			if (i < index) {
//				arrnew[i] = arr[i];
//			} else if (i == index) {
//				arrnew[index] = n;
//			} else if (i > index) {
//				arrnew[i] = arr[i - 1];
//			} else {
//				System.out.println("err");
//			}
//		}
//
//		arr = arrnew;
//
//		for (int i = 0; i < arrnew.length; i++) {
//			System.out.println(arr[i]);
//		}

		// Task 8

//		System.out.print("Enter a string: ");
//		String str = input.nextLine();
//
//		char[] sts = str.toCharArray();
//		char[] rev = new char[sts.length];
//		int t = 0;
//		for (int i = sts.length - 1; i >= 0; i--) {
//			rev[i] = sts[t];
//			t++;
//		}
//
//		for (int i = 0; i < rev.length; i++) {
//			System.out.println(rev[i]);
//		}
		

		


	}
	
	
	
	public String makeOutWord(String out, String word) {
		char[] arr1 = new char[out.length()];
		char[] arr2 = new char[word.length()];
		
		int l = out.length() + word.length();
		
		char[] finalarr = new char[l];
		
		int where = arr1.length / 2;
		
		

		for (int i = 0; i < l; i++) {
			int s = i;
			if (i < where) {
				finalarr[i] = arr1[i];
			} else if (i == where) {
				for (int q = 0; i < arr2.length; q++) {
					int s = i;
					finalarr[s] = arr2[q];
					s++;
				}
				
			} else if (i > where) {
				finalarr[s] = arr1[i];
			} else {
				System.out.println("err");
			}
		}
		
		return finalarr;

		arr = arrnew;
	}


}