package joi2015;

import java.util.Scanner;

public class WalkinginJOIKingdom {

	public static void main(String[] args){
	
		int N;
		long time;
		int Q;
		int[] mainPerson = new int[1000];
		long[] place = new long[100000];
		int[] direction = new int[100000];
		int[] walkable = new int[100000];
		int sub;
		int i;
		int j;
		int k;
		int l;
		Scanner s = new Scanner(System.in);
	
		N = s.nextInt();
		time = s.nextLong(10);
		Q = s.nextInt();
	
		for(i = 0; i < N; i++){
			place[i] = s.nextLong(10);
			sub = s.nextInt();
			if(sub == 1){
				direction[i] = 1;
			}else{
				direction[i] = 0;
			}
		}
	
		for(i = 0; i < 100000; i++)
			walkable[i] = 1;
	
		for(i = 0; i < Q; i++)
			mainPerson[i] = s.nextInt();
		
		s.close();

		for(i = 0; i < time; i++){
		
			for(j = 0; j < N; j++){
				if(walkable[j] == 1){
					if(direction[j] == 1){
						place[j]++;
					}else{
						place[j]--;
					}
				}
			}

			for(k = 0; k < N - 1; k++){
			
				for(l = k + 1; l < N; l++){
					
					if(place[k] == place[l])
						walkable[k] = walkable[l] = 0;
					
				}
				
			}
			
		}
		
		for(i = 0; i < Q; i++)
			System.out.printf("%d\n", place[mainPerson[i] - 1]);
	}
}
