import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Deck deck = new Deck();
        boolean running = true;
        while (running)  {
            System.out.println("Choose an option:");
            System.out.println("1. Print the deck of cards");
            System.out.println("2. Print a card");
            System.out.println("3. Find cards of the same suit");
            System.out.println("4. Find cards of the same rank");
            System.out.println("5. Find a card");
            System.out.println("6. Deal five cards");
            System.out.println("7. Shuffle the deck");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();

        }
    }

    private static void printDeck(Deck deck) {
        List<Card> cards = deck.getCards();
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
