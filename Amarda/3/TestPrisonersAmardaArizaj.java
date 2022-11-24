
	public class TestPrisonersAmardaArizaj
	{
		public static void main(String[] args) {


		boolean[] prisoners = new boolean[100];
		int[] box = new int[100];
		int prisoners_founded=0;
		int  nfoundprisoners=0;
		int survivers=0;
		int prisoners_died=0;
		int cnt;
		for (cnt=0;cnt<100000;cnt++)
		{

			PrisonersAmardaArizaj.repetition(prisoners);
			PrisonersAmardaArizaj.boxSearch(box,prisoners);
			nfoundprisoners=0;
			prisoners_founded=0;
			for (int i=0;i<100;i++) {
				if (prisoners_founded==1)
					break;
				nfoundprisoners=PrisonersAmardaArizaj.checking(i,box);
				if (nfoundprisoners==50)
					 prisoners_founded=1;
			}

			if (prisoners_founded==1)
				prisoners_died++;
			else
				survivers++;
		}
		double prob = PrisonersAmardaArizaj.probability(survivers,prisoners_died);
		System.out.println(prob);
	}
	}
