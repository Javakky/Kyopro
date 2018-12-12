package joi._2017;

import java.util.Scanner;

public class _3 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int H, W;
		H = sc.nextInt();
		W = sc.nextInt();
		int sum = 0;
		int summ = 1000000;
		int res = 1000000;
		boolean f = true;

		int[][] A = new int[H][W];

		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				A[i][j] = sc.nextInt();
				if(j != 0 && A[i][j] != A[i][j - 1]){
					f = false;
				}else if(i != 0 && A[i - 1][A[i-1].length-1] != A[i][0]){
					f = false;
				}
			}
		}
		for(int road_h = 0; road_h < H; road_h++){
			summ = 0;
			for(int road_w = 0; road_w < W; road_w++){
				sum = 0;
				for(int i = 0; i < H; i++){
					for(int j = 0; j < W; j++){
						if(road_h == i || road_w == j){
						}else if(Math.abs(road_h - i) < Math.abs(road_w - j)){
							sum += A[i][j] * Math.abs(road_h - i);
						}else{
							sum += A[i][j] * Math.abs(road_w - j);
						}
					}
				}
				if(sum != 0 && summ > sum){
					summ = sum;
				}
			}
			if(summ != 0 && res > summ){
				res = summ;
			}
		}

		if(f){
			sum = 0;
			int road_w = (int)Math.floor(W / 2.0);
			int road_h = (int)Math.floor(H / 2.0);
			for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if(road_h == i || road_w == j){
				}else if(Math.abs(road_h - i) < Math.abs(road_w - j)){
					sum += A[i][j] * Math.abs(road_h - i);
				}else{
					sum += A[i][j] * Math.abs(road_w - j);
				}
			}
		}
			System.out.println(sum);
		}else{
			System.out.println(res);
		}

		sc.close();

	}

}
