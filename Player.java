import java.util.ArrayList;

public class Player {
		private String name; //玩家姓名 
		private int chips;  //玩家有的籌碼
		private int bet;  //玩家此局下注的籌碼
		private ArrayList<Card> oneRoundCard; //此牌局的卡
		public Player(String name, int chips){ 
			//新增Player物件時，需要姓名、擁有的籌碼等兩個參數
			this.name = name;
			this.chips = chips;
		}
		public String getName(){
			return name;
		}
		public int makeBet(){
			//基本下注：一次1元bet=1
			if(chips<0){//注意：要檢查是否還有錢，沒錢了就不能再繼續下注
				return bet =0;
			}
			return bet = 1+ chips ;//下注，回傳預計下注的籌碼
		}
		public void setOneRoundCard(ArrayList<Card> cards){ 
			oneRoundCard = cards;
			}
		public boolean hitMe(){
		//*是否要牌，是回傳true，不再要牌則回傳false
		//基本參考條件：16點以下要牌，17點以上不要牌
		//提示：用oneRoundCard來算
			int totalrank = 0;
			String rank_s ="";
			int rank = 0;
			for(int i=0;i<oneRoundCard.size();i++){
				rank_s =oneRoundCard.get(i).rank_s;
				  switch(rank_s){
	    		  	case "Ace":
	        		rank = 1;  //1 OR 11
	    			case "11":
	        		rank = 10;
	        		case "12":
	        		rank = 10;
	        		case "13":
	        		rank = 10;
	    			default:
	        		rank = oneRoundCard.get(i).rank;
	        		//System.out.println(rank);
	        		totalrank += rank;
	        		//System.out.println(totalrank);
				}
		}
			if(totalrank <16){
				return true;
			}else{
				return false;
			}
		}
		public int getTotalValue() {
			int totalrank = 0;
			String rank_s ="";
			int rank = 0;
			for(int i=0;i<oneRoundCard.size();i++){
				rank_s =oneRoundCard.get(i).rank_s;
				  switch(rank_s){
	    		  	case "Ace":
	        		rank = 1;  //1 OR 11
	    			case "11":
	        		rank = 10;
	        		case "12":
	        		rank = 10;
	        		case "13":
	        		rank = 10;
	    			default:
	        		rank = oneRoundCard.get(i).rank;
	        		totalrank += rank;
				}
		}
			return totalrank;
		//*回傳此牌局所得的卡點數加總sum rank
		}
		
		public int getCurrentChips(){
			return bet;
		//*回傳玩家現有籌碼 bet
		}
		
		public void increaseChips (int diff){
			bet = bet + diff;
			//*玩家籌碼變動，setter
		}
		
		public void sayHello(){
		//玩家Say Hello
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
		}
}
