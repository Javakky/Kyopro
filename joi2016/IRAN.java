package joi2016;

import java.util.Scanner;

public class IRAN {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int mul = 0;


		String str = s.nextLine();

		int i = str.indexOf('I');
		int j;
		int k;
		int l = str.lastIndexOf('N');
		
		j = i;
		
		while(j < l - 1){

			j = str.indexOf('R', j + 1);
			
			if(j == -1)
				break;
			k = j;

			while(k < l){

				k = str.indexOf('A', k + 1);
				if(k == -1)
					break;

				mul = (j - i) * (k - j) * (l - k) > mul ? (j - i) * (k - j) * (l - k) : mul;


			}

		}
		
		s.close();

		System.out.println(mul);

	}

}
