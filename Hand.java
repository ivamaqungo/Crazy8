import java.util.*;

public class Hand{
    private LinkedList<Card> cards = new LinkedList<Card>();

    public Hand(){

    }

    public Card takecard(Card card){
        this.cards.get(card);
    }


}