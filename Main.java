// Name: Caydin Klups
// Date: 06/12/2025
// This program creates a deck of cards and performs operations such as displaying and sorting cards.

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create a deck using ArrayList instead of array for flexibility
        ArrayList<Card> deck = new ArrayList<>();

        // Populate the deck with 52 cards (13 ranks x 4 suits)
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                deck.add(new Card(ranks[i], suit, i + 2)); // Rank value starts at 2
            }
        }

        // Display the unsorted deck
        System.out.println("Unsorted Deck:");
        for (Card c : deck) {
            System.out.println(c);
        }

        // Sort the deck based on rank value
        Collections.sort(deck);

        // Display the sorted deck
        System.out.println("\nSorted Deck:");
        for (Card c : deck) {
            System.out.println(c);
        }
    }
}
