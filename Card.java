public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public boolean sameSuit(Card other) {
        return suit == other.suit;
    }

    public boolean sameRank(Card other) {
        return rank == other.rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
