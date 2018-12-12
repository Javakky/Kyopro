package joi2015;

import java.util.Scanner;

public class SelectingSubjects {
	
	public static void main(String[] args){
		
		int[] i = new int[6];
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(int j = 0; j < 6; j++){
			
			i[j] = s.nextInt();
			
		}
		
		s.close();
		
		if(i[0] < i[1]){
			
			if(i[0] < i[2]){
				
				if(i[0] < i[3])
					sum = sum(i[1], i[2], i[3]);
				else
					sum = sum(i[0], i[1], i[2]);
				
			}else{
				
				if(i[2] < i[3])
					sum = sum(i[0], i[1], i[3]);
				
			}
				
		}else{
			
			if(i[1] < i[2]){
				
				if(i[1] < i[3])
					sum = sum(i[0], i[2], i[3]);
				
			}
		
		}
		
		if(i[4] < i[5])
			sum += i[5];
		else
			sum += i[4];
		
		System.out.println(sum);
		
	}
	
	public static int sum(int a, int b, int c){
		
		return a + b + c;
		
	}
	
}
