import java.util.ArrayList;
import java.util.HashMap;

public class Player {

    public String name;
    public ArrayList<Card> hand;

    public Player() {
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public int getHandValue() {
        int value = 0;
        int h;
        for (h = 0; h < this.hand.size();
             h++) {
            value += this.hand.get(h).getValueFromEnum();

        }
        return value;
    }
}
