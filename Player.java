import java.util.*;

public class Player{
    private LinkedList<Card> cards = new LinkedList<Card>();

    public Player(){
        this.cards = cards;
        
    }//constructer list for cards of player

    public void receiveCards(Card card){
        try{
            this.cards.add(card);
        }
        catch(Exception c){
            System.out.println("Something went wrong" );
        }
    }//add cards of player

    /*  player can play  a card from the deck they have 
    */
    public Card play(Card card){
        try{
            for( String a : this.cards){
                if(a.equals(card)){
                     return a;
                }
            }
        }
        catch(Exception c){
            System.out.println("Something went wrong" );
        }
    }return "";

    public String toString(){
        return "Your deck hand: "+ this.cards;
    }// get your cards


}
