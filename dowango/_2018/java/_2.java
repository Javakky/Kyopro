package dowango._2018;

import java.util.Scanner;

public class _2 {

	static int[] b = null;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] a = sc.next().split("");

		b = new int[a.length];

		for(int i = 0; i < a.length; i++){
			b[i] = Integer.parseInt(a[i]);
		}

		int _2 = 0;
		int _5 = 0;

		for(int i = 0; i < b.length; i++){
			if(b[i] == 2) _2++;
			if(b[i] == 5) _5++;
		}

		if(b[0] == 5 || b[b.length - 1] == 2 || b.length % 2 != 0 || _2 != _5){
			System.out.println(-1);
			System.exit(0);
		}

		int sum = 0;

		boolean flag = true;

		while(flag){

			for(int i = 0, j, k; i < b.length - 1; i++){
				if(i == b.length - 2){
					sum++;
					flag = false;
				}
				if(b[i] == 0) continue;
				j = i+1;
				while(b[j] == 0){
					j++;

				}
				if(b[i] == 2 && b[j] == 2){
					for(k = j+1; b[k] == 5 && b[k - 1] != 5; k++);
					b[i] = 0;
					b[k] = 0;
					sum++;
					break;
				}

			}

			flag = false;
			for(int i = 0; i < b.length - 1; i++){
				if(b[i] == 5){
					int j = i+1;
					while(b[j] == 0){
						j++;
					}
					if(b[i] == 5 && b[j] == 5){flag = true;}
				}
			}


		}


		System.out.println(sum);

		sc.close();

	}

	static void func(int i){

		while(b[i] == 0){
			i++;
			if(i == b.length - 1) return;
		}

		int j = i+1;

		while(b[j] == 0){
			j++;
			if(j == b.length) return;
		}

		if(b[i] == 2 && b[j] == 5){
			b[i] = 0;
			b[j] = 0;
			func(i);
		}

	}
}