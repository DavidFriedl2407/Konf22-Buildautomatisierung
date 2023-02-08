package UebungsbeispielStack;

public class Card {

    private int value;
    private String colour;

    public Card(int value, String colour) {
        if (value>0&&value<10){
            this.value = value;
        }
        else System.out.println("Fehler");
        if (colour.equals("blue")||colour.equals("green")||colour.equals("yellow")||colour.equals("red")){
            this.colour=colour;
        }
        else System.out.println("Fehler");


    }

    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }
}
