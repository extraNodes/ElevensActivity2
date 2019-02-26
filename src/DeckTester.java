/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {

            String[] ranks = {"J", "Q", "K"};
            String[] suits = {"☻", "♠"};
            int[] pointValues = {8, 9, 10};
            Deck d = new Deck(ranks, suits, pointValues);

            System.out.println(d.toString());
    }
}

