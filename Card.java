import java.util.*;


public class Card{
    private int rank;
    private int suit;
    private LinkedList<Card> newdeck = new LinkedList<Card>();

    
     public Card(int rank,int suit){
        this.rank = rank;
        this.suit = suit;
        this.newdeck = newdeck;
    }

    public String toString(){
        String [] ranks = {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String [] suits = {"Clubs","Diamonds","Hearts","Spades"};
        String s = ranks[this.rank] + " of " + suits[this.suit];
        return s;
    }

    public int compareTo(Card that){
        if (this.suit < that.suit){
            return -1;

        }
        if (this.suit > that.suit){
            return 1;

        }
        if (this.rank > that.rank){
            return 1;

        }
        if (this.rank>that.rank){
            return 1;
        }
        return 0;//if cards are equal then return 0
    }
	
	public LinkedList<Card> CreateDeck(){ //create deck
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[]  suits = {"S","H","D","C"};
        
        for (String a : suits){
            for(String b : numbers){
                newdeck.add(a+b);
            }
        }return newdeck;
	}
	
	/*public static String [] RiffleShuffle_Inner(String [] a){ //first shuffle
        String [] FH = new String[26];
        String [] SH = new String[26];
        int c = 0;
        for (int i = 0; i < 26;i++){
            FH[i] = a[i];
        }
        for (int j = 26; j < 52;j++){
            SH[j-26] = a[j];   //so that j starts at SH[0]
        }
        for (int v = 0; v < 52;v+=2){
            a[v]= FH[c];
            a[v+1]= SH[c];
            c++;
        }

        return a;
    }
    public static String [] RiffleShuffle_Outer(String [] a){ //second shuffle
        String [] FH = new String[26];
        String [] SH = new String[26];
        int c = 0;
        for (int i = 0; i < 26;i++){
            FH[i] = a[i];
        }
        for (int j = 26; j < 52;j++){
            SH[j-26] = a[j];
        }
      
        for (int v = 0; v < 8;v+=2){
            a[v]= SH[c];                   //changes which card will be on top when slicing
            a[v+1]= FH[c];
            c++;
        }

        return a;
    }
	public String [] Swap_shuffle(String [] a){                                       //3rd shuffle
        Random in2 = new Random(); 
        String r_swap = "";
        for (int i = 0;i< a.length;i++){
            int swap_no = in2.nextInt(52);
            r_swap = a[swap_no];
            a[i] = r_swap;
            a[swap_no] = a[i];
            
        }
		
		String [] deck1 = new String[8];                                              //deal to player1
        for (int i = 0;i<8;i++){
         
                deck1[i] = a[i];
           
        }
		
		String [] deck2 = new String[8];                               //deal to computer
        for (int i = 8;i<16;i++){
            
                deck2[i-8] = a[i];
            }
		System.out.println(Arrays.toString(deck2)+ " deck belong to computer, user wont see" );       //all deals have a initial length of 8
          
        return deck1;

    } 
}*/
	
}