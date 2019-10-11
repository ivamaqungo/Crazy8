import java.util.*;
public class Deck{
    private Card deal;      // this is to call the deck from Card  class
    private LinkedList<Card> deckOfcards;//this is the list of cards that ill use 
                                        //for this deck class
    public Deck(){

    }

    public Card newdeck(){
        this.deckOfcards = deal.CreateDeck();
    }

    public LinkedList<Card> shuffle(){
        Random rand = new Random();//thiis random number is to shuffle the cars
                                //the cards in terms of the fisher Yates shuffle method
        LinkedList<Card> set = new LinkedList<Card>();//
        LinkedList<Card> set2 = new LinkedList<Card>();//this sets if list allow the pragram to shuffle effectively 
        LinkedList<Card> set3 = new LinkedList<Card>();//
        LinkedList<Card> set4 = new LinkedList<Card>();//
        int count = 0;
        int count2 = 1;
        for ( int i = 0; i < 51; i++){
            int num =rand.nextInt(51 - i);
            //Card x = deckOfcards.get(num);
            Collections.swap(deckOfcards , (51- i) , num );//this method performs the fisher yates shuffle method
            //set[num] = set[51-i];
            //set[51 -i] = x;

        }
        System.out.println(deckOfcards);
        for( int i = 0; i < 26; i++){//this method prepares for the riffle shuffle
            set2.add(i, deckOfcards.get(i));//it gets objes/cards from the deckOFcards list by index postion
                                            //specifiesd by the for loop
        }
        for( int i = 0; i < 26; i++){//this method
            set3.add(i, deckOfcards.get(26 + i));
            }
        for( int i = 0; i < 26;i++){
            set4.add(count, set2.get(i));
            count+=2;
        }
        for( int i = 0; i < 26;i++){
            set4.add(count2, set3.get(i));
            count2+=2;
        }
        System.out.println(set4);
        /*/double ANS = shannon(set4);
        //double add = add(set4);
        System.out.println(" ");
        System.out.println(Arrays.toString(set2));
        System.out.println(" ");
        System.out.println(Arrays.toString(set3));
        System.out.println(" ");
        System.out.println(Arrays.toString(set4));
        System.out.println(" ");
        System.out.println(ANS);/*/
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

        
    }*/
}