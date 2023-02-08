package Stack;

public class CardStack {
    private T[] cards;
    private int counter;

    public CardStack(T[] cards) {
        this.cards = cards;
        this.counter = -1;
        //counter = -1;
    }

    public void push(T newElement) {
        // cards.length == 2
        if (cards.length > counter + 1) {
            counter++;
            cards[counter] = newElement;
        }
        else {
            System.out.println("Stack ist voll: " + newElement);
        }
    }

    public T pop(){
        if (counter >= 0 && cards.length>0) {
            T result = cards[counter];
            cards[counter]=null;
            counter--;
            return result;
        } else {
            System.out.println("Stack ist bereits leer");
            return null;
        }
    }
}
