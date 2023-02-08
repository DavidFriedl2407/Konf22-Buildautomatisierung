package UebungsbeispielStack;

public class Demoklasse {
    public static void main(String[] args) {
        Card card1= new Card(7,"blue");
        Card card2= new Card(4,"yellow");
        Card card3=new Card(3,"blue");
        Card card4=new Card(2,"blue");

        Card [] cards=new Card[10];
        CardStack stack=new CardStack(cards);
        stack.push(card1);
        stack.push(card2);;
        stack.push(card3);
        stack.push(card4);
        System.out.println(stack);

        System.out.println("........................");
        Card c1 = stack.pop();
        System.out.println(c1);
        Card c2 = stack.pop();
        Card c3 = stack.pop();
        Card c4 = stack.pop();
        System.out.println(stack);
        Card c5 = stack.pop();






    }
}
