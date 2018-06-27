import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card acespades;


    @Before
    public void before() {
        deck = new Deck();
        acespades = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void deckContains0Cards(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void deckCanAddCards(){
        deck.addCard(acespades);
        assertEquals(1, deck.cardCount());
    }

    @Test
    public void deckCanBeFilled(){
        deck.fill();
        assertEquals(52, deck.cardCount());
    }
}
