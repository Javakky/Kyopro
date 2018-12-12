package joi._2017;

import java.util.Scanner;

public class _2 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N, count = 0, max = 0, sub;
		boolean flag = false, one = false, zero = false;

		N = sc.nextInt();

		for(int i = 0; i < N; i++){
			sub = sc.nextInt();
			if(sub == 1){
				one = true;
				count++;
				flag = true;
				if(i == N - 1){
					if(max < count + 1){
						max = count + 1;
					}
				}
			}else{
				zero = true;
				if(flag){
					flag = false;
					if(max < count + 1){
						max = count + 1;
					}
				}
				count = 0;
			}
		}

		if(!zero){
			System.out.println(N+1);
		}else if(!one){
			System.out.println(1);
		}else{
			System.out.println(max);
		}

		sc.close();

	}

}
