import java.util.ArrayList;

public class Player {
		private String name; //���a�m�W 
		private int chips;  //���a�����w�X
		private int bet;  //���a�����U�`���w�X
		private ArrayList<Card> oneRoundCard; //���P�����d
		public Player(String name, int chips){ 
			//�s�WPlayer����ɡA�ݭn�m�W�B�֦����w�X����ӰѼ�
			this.name = name;
			this.chips = chips;
		}
		public String getName(){
			return name;
		}
		public int makeBet(){
			//�򥻤U�`�G�@��1��bet=1
			if(chips<0){//�`�N�G�n�ˬd�O�_�٦����A�S���F�N����A�~��U�`
				return bet =0;
			}
			return bet = 1+ chips ;//�U�`�A�^�ǹw�p�U�`���w�X
		}
		public void setOneRoundCard(ArrayList<Card> cards){ 
			oneRoundCard = cards;
			}
		public boolean hitMe(){
		//*�O�_�n�P�A�O�^��true�A���A�n�P�h�^��false
		//�򥻰Ѧұ���G16�I�H�U�n�P�A17�I�H�W���n�P
		//���ܡG��oneRoundCard�Ӻ�
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
		//*�^�Ǧ��P���ұo���d�I�ƥ[�`sum rank
		}
		
		public int getCurrentChips(){
			return bet;
		//*�^�Ǫ��a�{���w�X bet
		}
		
		public void increaseChips (int diff){
			bet = bet + diff;
			//*���a�w�X�ܰʡAsetter
		}
		
		public void sayHello(){
		//���aSay Hello
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
		}
}
