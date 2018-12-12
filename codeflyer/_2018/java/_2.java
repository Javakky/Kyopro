package codeflyer._2018;

import java.util.Scanner;

public class _2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		char x[] = (sc.next()).toCharArray();

		for(int i = 0; i < n; i++){
			switch(x[i]){
			case 'S':
				if(a == 0)break;
				a--;
				break;
			case 'C':
				if(b == 0)break;
				b--;
				break;
			case 'E':
				if(b > a){
					b--;
					break;
				}
				a--;
				break;
			}
			if(a == 0 && b== 0) break;
		}

		System.out.println(a);
		System.out.println(b);

		sc.close();

	}
}