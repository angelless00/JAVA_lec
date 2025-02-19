
public class Card {
		int idx;
		String card[]=new String[52];
		String mark[]=new String[] {"◆","♣","♥","♠"};
		String num[]=new String[] {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		{
			idx=0;
			for (String m:mark) {
				for (String n:num) {
					card[idx]=m+n;
					idx++;
				}
			}
		}
		Card(){
			for (String n:card) {
				System.out.println(n);
		}
	}
}

