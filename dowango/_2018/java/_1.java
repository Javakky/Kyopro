package dowango._2018;

import java.util.Scanner;

public class _1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] a = sc.next().split("");

		if(a[0].equals(a[2]) && a[1].equals(a[3])) System.out.println("Yes");
		else System.out.println("No");

		sc.close();

	}

}
