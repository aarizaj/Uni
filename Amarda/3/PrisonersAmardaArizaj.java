public class PrisonersAmardaArizaj
	{

public static void boxSearch(int[] box,boolean[] prisoners)
{

 for (int i=0;i<100;i++)
 {
			int random = Random();
			if (!prisoners[random])
			{
				box[i] = random;
				prisoners[random] = true;
			}
			else {
				while(prisoners[random])
				{
					random = Random();
				}
				box[i] = random;
				prisoners[random] = true;
			}
		}
	}


public static int Random()
{
	return (int)(Math.random()*100);
}

	public static void repetition(boolean[] prisoners) {
		for (int i=0;i<prisoners.length;i++) {
			prisoners[i]=false;
		}
	}
	public static int checking(int success,int[] box) {

		int cnt=0;
		int found = success;
		for (int j=0;j<50;j++) {
			if (box[found]!= success)
			{
				found = box[found];
				cnt++;
			}
		}
		return cnt;
	}
	public static double probability (int survive,int lost) {

		double prob=(((double)survive)/(survive+lost))*100;;
		return prob;
	}
}
