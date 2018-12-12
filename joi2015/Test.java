package joi2015;

public class Test {

	public static void main(String[] args) {

		RPS a = new RPS();
		RPS2 b = new RPS2();
		//Scanner s = new Scanner(System.in);
		//Random rnd = new Random();
		int sub;
		int c =  a.play(0);
		//int c = s.nextInt();
		//int c = rnd.nextInt(3) + 1;
		int d = b.play(1);
		b.learn(1, 0);
		//int d = b.play(c);
		int win = 0, lose = 0, draw = 0;
		if(c == d)
			draw++;
		else if((c == d - 1) || (c == d + 2))
			win++;
		else
			lose++;

		for(int i = 1; i < 100000000; i++){
		//for(int i = 1; i < 300; i++){

			sub = c;
			c = a.play(i);
			a.learn(d, i);
			//c = s.nextInt();
			//c = rnd.nextInt(3) + 1;
			d = b.play(i);
			b.learn(sub, i);

			if(c == d)
				draw++;
			else if((c == d - 1) || (c == d + 2))
				win++;
			else
				lose++;
			//System.out.println("win:" + win + " lose:" + lose + " draw:" + draw);

		}

		System.out.println("win:" + win + " lose:" + lose + " draw:" + draw);

	}

}
