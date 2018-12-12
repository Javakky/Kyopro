package codeflyer._2018;

import java.util.Scanner;

public class _3 {

	static int res = 0;
	static int n, d;
	static int[] x;
	static int old = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = new int[n];
		d = sc.nextInt();
		for(int i = 0; i < n; i++){
			int sub = sc.nextInt();
			if(i == n-1 && (sub <= d)){
				System.out.println(0);
				return;
			}
			x[i] = sub - (i == 0 ? 0 : old);
			old = sub;
		}

		if(d == 0){
			System.out.println(0);
			return;
		}


		for(int i = 0; i < n-2; i++){
			int xij = 0;
			for(int j = i+1; j < n-1; j++){
				xij += x[j];
				if(xij > d){
					break;
				}
				int[] sub = find(xij, j);
				int xjk = sub[1];
				for(int k = sub[0]; k < n; k++){
					xjk += x[k];
					if(xij + xjk <= d){
						continue;
					}
					if(xjk > d){
						break;
					}
					res++;
				}
			}
		}

		System.out.println(res);

		sc.close();

	}

	static int[] find(int xij, int j){
		int xjk = 0;
		int k;
		for(k = j+1; k < n ; k++){
			xjk += x[k];
			if(xij+xjk > d)break;
		}

		if(k != n){
			return new int[]{k, xjk-x[k]};
		}else{
			return new int[]{k, 0};
		}
	}

}
