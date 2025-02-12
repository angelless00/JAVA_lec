
public class EX_TEST02 {

	public static void main(String[] args) {
		// [1] 구구단
		for (int i=1;i<10;i++)
		{
			for (int dan=2;dan<10;dan++)
			{
				System.out.printf("%d X %d = %d ",dan,i,dan*i);
			}
			System.out.println();
		}
		
		for (int num=1;num<10;num+=2)
		{
			for(int blank=5-num/2;blank>0;blank--)
			{
				System.out.print(' ');
			}
			for(int star=1;star<=num;star++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		for (int num=9;num>0;num-=2)
		{
			for(int blank=0;blank<5-num/2;blank++)
			{
				System.out.print(' ');
			}
			for(int star=num;star>0;star--)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
