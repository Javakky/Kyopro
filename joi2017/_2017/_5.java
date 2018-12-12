package joi._2017;

import java.util.Scanner;

public class _5 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < a; i++){
			for(int j = 0; j < b; j++){
				int x = sc.nextInt();
				if(i == 0 && j != 0)
				sum += (i+j-1)*x;
				else if(i != 0 && j == b - 1){

					sum += (i+j-1)*x;
				}
			}
		}
		System.out.println(sum);

		sc.close();

	}

}
