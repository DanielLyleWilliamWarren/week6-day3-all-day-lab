import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Deck deck;
    Player player1;
    Player player2;
    Player player3;
    Card card1;
    Card card2;
    Card card3;

    @Before
    public void before() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        card1 = new Card(SuitType.SPADES, RankType.ACE);
        card2 = new Card(SuitType.CLUBS, RankType.EIGHT);
        card3 = new Card(SuitType.DIAMONDS, RankType.EIGHT);
        deck = new Deck();
        deck.fill();
        deck.shuffle();
        player1.addCard(card1);
        player2.addCard(card2);
        player3.addCard(card3);
    }

    @Test
    public void canCompareCards() {
        assertEquals(true, Game.compare(card1, card2));
    }

    @Test
    public void canGetValueOfHand() {
        assertEquals(1, player1.getHandValue());
    }

    @Test
    public void canDeclareWinnerPlayer2() {
        assertEquals("Player 2 Wins", Game.play(player1, player2));
    }

    @Test
    public void canDeclareWinnerPlayer1() {
        assertEquals("Player 1 Wins", Game.play(player2, player1));
    }

    @Test
    public void canDeclareDraw() {
        assertEquals("It's a Draw", Game.play(player3, player2));
    }

}
