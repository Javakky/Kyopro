package joi._2017;

import java.util.Arrays;
import java.util.Scanner;

public class _6 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int a[] = new int[sc.nextInt()];

		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		System.out.println(a[a.length - 1]);

		sc.close();

	}

}
