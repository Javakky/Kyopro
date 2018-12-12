package joi2015;

import java.util.Scanner;

public class WeatherForecaster {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int w = s.nextInt();
		char[] sub;
		int near;

		int[][] weather = new int[100][100];

		for(int i = 0; i < h; i++){

			sub = s.next().toCharArray();

			near = -1;

			for(int j = 0; j < w; j++){

				if(sub[j] == 'c'){
					near = 0;
				}else if(near >= 0){
					near++;
				}


				weather[i][j] = near;
			}

		}

		s.close();

		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.print(weather[i][j]);
			}
			System.out.println();
		}

	}

}
