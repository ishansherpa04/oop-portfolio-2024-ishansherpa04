package Card;

public class Card {
    // Constants for the face values
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    // Constants for the suits
    public static final int SPADES = 1;
    public static final int HEARTS = 2;
    public static final int DIAMONDS = 3;
    public static final int CLUBS = 4;

    // Instance variables
    private int value;
    private int suit;

    // Constructor.
     
    public Card(int v, int s) {
        value = v;
        suit = s;
    }

    public int getValue() {
        return value;
    }


    public int getSuit() {
        return suit;
    }

 
    public String toString() {
        String valueStr = "";
        String suitStr = "";

        switch (value) {
            case ACE:
                valueStr = "Ace";
                break;
            case JACK:
                valueStr = "Jack";
                break;
            case QUEEN:
                valueStr = "Queen";
                break;
            case KING:
                valueStr = "King";
                break;
            default:
                valueStr = Integer.toString(value);
        }

        switch (suit) {
            case SPADES:
                suitStr = "Spades";
                break;
            case HEARTS:
                suitStr = "Hearts";
                break;
            case DIAMONDS:
                suitStr = "Diamonds";
                break;
            case CLUBS:
                suitStr = "Clubs";
                break;
        }

        return valueStr + " of " + suitStr;
    }
}
