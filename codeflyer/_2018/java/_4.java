package codeflyer._2018;

import java.util.Scanner;

public class _4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] x = new boolean[h][w];
		int res = 0;

		for(int i = 0; i < n; i++){
			char[] sub = (sc.next()).toCharArray();
			for(int j = 0; j < m; j++){
				if(sub[j] == '.') continue;
				for(int a = i; a < h; a++){
					if((h - a) < (n - i))break;
					for(int b = j; b < w; b++){
						if((w - b) < (m - j))break;
						if(x[a][b] != true){
							res++;
							x[a][b] = true;
						}
					}
				}
			}
		}

		System.out.println(res);

		sc.close();

	}

}
