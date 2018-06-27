public class Game {


    public static boolean compare(Card card1, Card card2) {
        if (card1.getValueFromEnum() < card2.getValueFromEnum()) {
            return true;
        } else {
            return false;
        }
    }

    public static String play(Player player1, Player player2) {
        if (player1.getHandValue() == player2.getHandValue()) {
            return "It's a Draw";
        } else {
            if (player1.getHandValue() > player2.getHandValue()) {
                return "Player 1 Wins";
            } else {
                return "Player 2 Wins";
            }
        }
    }
}

