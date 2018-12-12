package codeflyer._2018;

import java.util.Scanner;

public class _1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();

		System.out.println(p-(p%sc.nextInt()));

		sc.close();

	}

}
