package joi2016;

import java.util.Scanner;

public class OlympiadinInformatics {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int tensu;
		
		for(int i = 0; i < 5; i++){
			tensu = s.nextInt();
			System.out.println(tensu >= 480 ? "Rank A" : tensu >= 200 ? "Rank B" : "Rank C");
		}
		
		s.close();
		
	}
	
}
