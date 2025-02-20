/**
 * 클래스역할 : 카드게임 
 * 클래스이름 : Deck
 * 클래스속성 : 카드 52장
 * 클래스기능 : 
 */ 			 
public class Deck {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// - 클래스변수
	public static final int D_SIZE=52; // 모든 인스턴스에서 공유, 변경이 불가
	
	// - 인스턴스 변수
	private Card arrCard[]=new Card[52];
	private int pickNum;
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	Deck() {
		// 52장 카드인턴스 생성 후 저장
		char kindArr[]= {Card.CLOVER,Card.DIAMOND,Card.HEART,Card.SPADE};
		for (int k_num=0;k_num<kindArr.length;k_num++) 
		{
			int idx=k_num*Card.NUM_MAX;
			for (int num=0;num<Card.NUM_MAX;num++)
			{
				arrCard[idx+num]=new Card(num+1,kindArr[k_num]);
			}
		}
		for (Card cd : arrCard)
		{
			cd.printInfo();
		}
	}

	//------------------------------------------
	// Getter/setter 메서드
	//------------------------------------------	
	public Card[] getArrCard() {
		return this.arrCard;
	}
	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------
	// 메서드기능 : 카드 섞기
	// 메서드이름 : shuffle
	// 매개변수들 : 없음
	// 메서드결과 : void
	//------------------------------------------
	public void shuffle() {
		
		Card temp=new Card();
		for (int idx=0; idx<Deck.D_SIZE; idx++)
		{
			int cIdx=(int)(Math.random()*Deck.D_SIZE);
			
			// idx 번째 요소값 백업
			temp=this.arrCard[idx];
			
			// idx번째 요소에 cIdx번째 값 넣기
			this.arrCard[idx]=this.arrCard[cIdx];
			
			//cIdx번째 요소에 백업 데이터 넣기
			this.arrCard[cIdx]=temp;
			
		}
		
	}
	
	//------------------------------------------
	// 메서드기능 : 카드 뽑기
	// 메서드이름 : pickup
	// 매개변수들 : 없음
	// 메서드결과 : Card
	//------------------------------------------
	public Card pickup() {
		this.pickNum+=1;
		return this.arrCard[this.pickNum];
	}
	
	//------------------------------------------
	// 메서드기능 : 카드 확인
	// 메서드이름 : checkCard
	// 매개변수들 : 없음
	// 메서드결과 : voide
	//------------------------------------------
	
	public void checkCard()
	{
		Deck myDeck=new Deck();
		for (Card card:myDeck.arrCard)
			card.printInfo();
		}
	
	
	//------------------------------------------
	// 프로그램 시작 메서드
	//------------------------------------------	
	public static void main(String[] args) {
		Deck myDeck=new Deck();
		
		// 카드 확인
		//myDeck.checkCard();
		
		myDeck.shuffle();
		
		// 카드 확인
		//myDeck.checkCard();
		
		for ( int cnt=0;cnt<5;cnt++) 
		{
			Card chioceCard=myDeck.pickup();
			System.out.print("뽑은카드 : " );
			chioceCard.printInfo();
		}
	}
}
