package joi2015;

import java.util.Random;

public class RPS2 {

		private int[] table_1 = new int[3];
		private int[][] table_2 = new int[3][3];
		private int[][][] table_3 = new int[3][3][3];
		private int[][][][] table_4 = new int[3][3][3][3];
		private int[] table_01 = new int[3];
		private int[][] table_02 = new int[3][3];
		private int[][][] table_03 = new int[3][3][3];
		private int[][][][] table_04 = new int[3][3][3][3];
		private int hand, handol, handol_2, handol_3, result, resultol, resultol_2, nextresult,  resultol_3, me;
		private Random rnd;
		private int timing;

		/**
		 * じゃんけんプログラムの初期化<br>
		 * 内部乱数の生成と配列表の初期化(0)を行う。
		 */

		public RPS2(){

			rnd = new Random();

			me = rnd.nextInt(3) + 1;

			timing = rnd.nextInt(1000);

			fourthInitial(table_1, table_2, table_3, table_4, 0);
			fourthInitial(table_01, table_02, table_03, table_04, 0);
		}

		/**
		 * じゃんけんで自分の手を出します。
		 * @param count 今何回戦目か
		 * @return 自分の手<br>1 = ぐー, 2 = ちょき, 3 = ぱー
		 */

		public int play(int count){

			int first, second, third;

			first = handol - 1;
			second = handol_2 - 1;
			third = handol_3 - 1;

			if(count <= 3 || count % 1000 == timing){
				me = rnd.nextInt(3) + 1;
			}
			else if(count > 3 && count <= 9){
				me = compare(table_1, table_01);
			}
			else if(count > 9 && count <= 27){
				me = compare(table_2[first], table_02[resultol]);
			}
			else if(count > 27 && count <= 81){
				me = compare(table_3[second][first], table_03[resultol_2][resultol]);
			}else if(count > 81){
				me = compare(table_4[third][second][first], table_04[resultol_3][resultol_2][resultol]);
			}

			return me;

		}

		/**
		 * じゃんけんでの相手の手を保存します。
		 * @param you 相手の手<br>1 = ぐー, 2 = ちょき, 3 = ぱー
		 * @param count 今何回戦目か
		 */

		public void learn(int you, int count){

			hand = you;
			if(hand != 1 || hand != 2 || hand != 3)
				hand = 1;
			result = hand == you ? 1: hand - 1 == you || hand + 2 == you ? 1 : 2;
			nextresult = handol == hand ? 1: handol - 1 == hand || handol + 2 == hand ? 0 : 2;

			count--;

			if(count >= 3){
				handol_3 = handol_2;
				resultol_3 = resultol_2;
			}
			if(count >= 2){
				handol_2 = handol;
				resultol_2 = resultol;
			}
			if(count >= 1){
				handol = hand;
				resultol = result;
			}

			int first = 0, second = 0, third = 0, fourth = 0;

			if(count > 0){
				first = hand - 1;
				table_1[first]++;
				table_01[nextresult]++;
			}
			if(count > 1){
				second = handol - 1;
				table_2[second][first]++;
				table_02[resultol][nextresult]++;
			}
			if(count > 2){
				third = handol_2 - 1;
				table_3[third][second][first]++;
				table_03[resultol_2][resultol][nextresult]++;
			}
			if(count > 3){
				fourth = handol_3 - 1;
				table_4[fourth][third][second][first]++;
				table_04[resultol_3][resultol_2][resultol][nextresult]++;
			}
		}

		@SuppressWarnings("unused")
		private int compare(int[] table){

			int me;

			if(table[0] > table[1] && table[0] > table[2])
				me = 3;
			else if(table[1] > table[2])
				me = 1;
			else
				me = 2;

			return me;

		}

		private int compare(int[] table, int[] table_2){

			int me;
			int zero, first, second;

			if(handol == 1){
				zero = 1;
				first = 2;
				second = 0;
			}else if(handol == 2){
				zero = 0;
				first = 1;
				second = 2;
			}else{
				zero = 2;
				first = 0;
				second = 1;
			}

			if(table[0] + table_2[zero] > table[1] + table_2[first] && table[0] + table_2[zero] > table[1] + table_2[first])
				me = 3;
			else if(table[1] + table_2[first] > table[2] + table_2[second])
				me = 1;
			else
				me = 2;

			return me;

		}

		private static void fourthInitial(int[] array, int[][] array_2, int[][][] array_3, int[][][][] array_4, int contents){
			for(int i = 0; i < 3; i++){

				for(int j = 0; j < 3; j++){

					for(int k = 0; k < 3; k++){

						for(int l = 0; l < 3; l++){

							array_4[i][j][k][l] = contents;

						}

						array_3[i][j][k] = contents;

					}

					array_2[i][j] = contents;

				}

				array[i] = contents;

			}
		}

}

