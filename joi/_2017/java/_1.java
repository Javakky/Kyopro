package joi._2017;

import java.util.Scanner;

public class _1 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		double N;
		int A, B, C, D;

		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		if(Math.ceil(N / A) * B < Math.ceil(N / C) * D){
			System.out.println((int)(Math.ceil(N / A) * B));
		}else{
			System.out.println((int)(Math.ceil(N / C) * D));

		}
		sc.close();

	}

}
