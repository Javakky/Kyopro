package joi2015;

import java.util.Scanner;

public class SwappingBibs {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] student = new int[s.nextInt()];
		int batton = s.nextInt();
		
		for(int i = 0; i < student.length; i++)
			student[i] = s.nextInt();
		
		s.close();
		
		int k = 1;
		int j = 0;
		int sub = 0;
		
		while(k <= batton){
			
			while(j < student.length){
				
				if(j != student.length - 1){
				
					if((student[j] % k) > (student[j+1] % k)){
					
						sub = student[j];
						student[j] = student[j+1];
						student[j+1] = sub;
					
					}
				}
				j++;
				
			}
			
			j = 0;
			
			k++;
			
		}
		
		for(int i = 0; i < student.length; i++)
			System.out.println(student[i]);
		
	}

}
