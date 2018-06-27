import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GameTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        deck.fill();
    }

//    @Test
//    public void canDrawFromDeck(){
//        deck.drawCards(2);
//        assertEquals(50, deck.cardCount());
//    }

    @Test
    public void canDrawSingleCard(){
        deck.draw();
        assertEquals(51, deck.cards.size());
    }

    @Test
    public void canDrawFromShuffledDeck(){

    }

}
