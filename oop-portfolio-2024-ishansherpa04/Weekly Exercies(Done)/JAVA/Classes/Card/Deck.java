package Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // Constants for the number of cards in a deck
    public static final int NUM_CARDS = 52;
    public static final int NUM_DEALS = 5;

    // Instance variables
    private List<Card> cards;

    /**
     * Constructor. Creates a new deck of cards.
     */
    public Deck() {
        cards = new ArrayList<Card>();
        for (int suit = 1; suit <= 4; suit++) {
            for (int value = 1; value <= 13; value++) {
                cards.add(new Card(value, suit));
            }
        }
        Collections.shuffle(cards);
    }

    // Deals one card from the deck and returns it
    public Card dealCard() {
        if (cards.size() == 0) {
            throw new IllegalStateException("No more cards in the deck");
        }
        return cards.remove(cards.size() - 1);
    }

    // Deals a number of cards from the deck and returns them.
    
    public List<Card> dealCards(int num) {
        if (num > cards.size()) {
            throw new IllegalStateException("Not enough cards in the deck");
        }
        List<Card> dealt = new ArrayList<Card>();
        for (int i = 0; i < num; i++) {
            dealt.add(dealCard());
        }
        return dealt;
    }

    /**
     * Returns a string representation of the deck.
     * @return a string representation of the deck
     */
    public String toString() {
        String str = "";
        for (Card card : cards) {
            str += card.toString() + "\n";
        }
        return str;
    }

    /**
     * Main method. Creates a deck and deals five random cards.
    
     */
    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Card> hand = deck.dealCards(5);
        System.out.println("Your hand is:");
        for (Card card : hand) {
            System.out.println(card.toString());
        }
    }
}