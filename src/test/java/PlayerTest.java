import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Card card1;
    Card card2;
    Deck deck;

    @Before
    public void before() {
        player1 = new Player();
        card1 = new Card(SuitType.SPADES, RankType.ACE);
        deck = new Deck();
        deck.fill();
        deck.shuffle();
    }

    @Test
    public void canAddCard(){
        player1.addCard(card1);
        assertEquals(1, player1.hand.size());
    }

    @Test
    public void canTakeCardFromShuffledDeck(){
        player1.addCard(deck.draw());
        assertEquals(1, player1.hand.size());
    }



}
