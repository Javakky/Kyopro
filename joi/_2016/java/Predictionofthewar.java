package joi2016;

import java.util.Arrays;
import java.util.Scanner;

public class Predictionofthewar {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int people;
		int sum = 0;

		for(int i  = 0; i < n; i++){

			people = s.nextInt();

			int[] country = new int[people];

			for(int j = 0; j < people; j++){

				country[j] = s.nextInt();

			}

			Arrays.sort(country);

			sum += country[(int)people / 2];

		}
		s.close();

		System.out.println(sum / n);

	}

}
