// Name: Caydin Klups
// Date: 06/12/2025
// This class defines a playing card with rank, suit, and rank value.

public class Card implements Comparable<Card> {
    private String rank;
    private String suit;
    private int rankValue;

    // Default constructor
    public Card() {
        this.rank = "Ace";
        this.suit = "Spades";
        this.rankValue = 14;
    }

    // Parameterized constructor
    public Card(String rank, String suit, int rankValue) {
        this.rank = rank;
        this.suit = suit;
        this.rankValue = rankValue;
    }

    // Accessors
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getRankValue() {
        return rankValue;
    }

    // Mutators
    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRankValue(int rankValue) {
        this.rankValue = rankValue;
    }

    // toString method
    public String toString() {
        return rank + " of " + suit + " (Value: " + rankValue + ")";
    }

    // Implement compareTo for sorting
    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.rankValue, other.rankValue);
    }
}
