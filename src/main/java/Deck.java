import java.util.ArrayList;
import java.util.Collections;

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
        return this.cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

}
