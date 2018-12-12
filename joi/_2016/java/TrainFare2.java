package joi2016;

import java.util.Scanner;

public class TrainFare2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int s_in = s.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		int[] p = new int[m];

		for(int i = 0; i < m; i++){
			a[i] = s.nextInt();
			b[i] = s.nextInt();
			c[i] = s.nextInt();
			p[i] = s.nextInt();
		}

	}

}
