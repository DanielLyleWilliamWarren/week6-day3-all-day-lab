import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {
    public ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }


    public int cardCount() {
        return cards.size();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void fill() {
        for (SuitType s : SuitType.values()) {
            for (RankType r : RankType.values()) {
                this.addCard(new Card(s, r));
            }
        }
    }

    public Card draw() {
        Card draw = new Card(cards.get(0).getSuit(),cards.get(0).getRank());
        this.cards.remove(0);
        return draw;
    }

}


//    public ArrayList<Card> drawCards(int i) {
//        ArrayList<Card> drawn = new ArrayList<>(this.cards.subList(0, i));
//    }
//}
