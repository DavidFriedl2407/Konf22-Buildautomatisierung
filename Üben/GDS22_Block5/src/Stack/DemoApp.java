package Stack;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("Hello World");


        T card = new T(1, "red");

        System.out.println(card);

        T[] array = new T[2];
        CardStack cardStack = new CardStack(array);

        cardStack.push(new T(3 , "yellow"));
        cardStack.push(card);
        cardStack.push( new T(7, "green"));

        T c1 = cardStack.pop();
        System.out.println("c1 = " + c1);
        T c2 = cardStack.pop();
        System.out.println("c2 = " + c2);
        System.out.println("card = " + card);

        if (card == c2) {
            System.out.println("true");
        }


        cardStack.push(new T(9, "blue"));
        T c3 = cardStack.pop();
        System.out.println("c3 = " + c3);
        T c4 = cardStack.pop();
        System.out.println("c4 = " + c4);
        //Stack.Card c5 = cardStack.pop();
        System.out.println("genericStack");
        Double [] doubleArray=new Double[5];
        String [] stringArray=new String[5];
        GenericStack<Double> myGenericstack3 = new GenericStack<>(new Double[5]);
        myGenericstack3.push(14.5);
        System.out.println(myGenericstack3.pop());

        GenericStack myGenericstack = new GenericStack (doubleArray);
        GenericStack myGenericstack2= new GenericStack (stringArray);
        myGenericstack.push(22.5);
        System.out.println(myGenericstack.pop());
        myGenericstack2.push("hallo");
        System.out.println(myGenericstack2.pop());
    }


}
