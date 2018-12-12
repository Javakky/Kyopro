package joi2016;

import java.util.Scanner;

public class JapaneseFlag {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int h = s.nextInt();
		int w = s.nextInt();
		int min = Math.min(h, w);
		int count = 0;
		int sum = h * w;
		int naga = 0, hon = 0;
		int chushin_h = h / 2;
		int chushin_w = w / 2;

		char flag[][] = new char[h][w];

		for(int i = 0; i < h; i++)
			flag[i] = s.next().toCharArray();

		for(int i = 0; i < h; i++)
			for(int j = 0; j < w; j++)
				if(flag[i][j] == 'R')
					count++;

		sum = Math.min(sum, count);

		if(min % 2 == 0)
			naga = 2;
		else
			naga = 1;

		while(naga <= min){

			if(min % 2 == 0)
				hon = 2;
			else
				hon = 1;

			while(hon <= min){

				count = 0;

				for(int i = 0; i < h; i++)
					for(int j = 0; j < w; j++)
						if((i > chushin_h + Math.max(naga, hon) / 2) || i < chushin_h - naga / 2 + (naga % 2 == 0 ? 1: 0) || (j > chushin_w + hon / 2) || j < chushin_w - hon / 2 + (naga % 2 == 0 ? 1: 0)){
							if(flag[i][j] == 'R')
								count++;
						}else{
							if(flag[i][j] == 'W')
								count++;
						}

				sum = Math.min(sum, count);

				hon += 2;

			}

			naga += 2;

		}

		System.out.println(sum);

	}

}
