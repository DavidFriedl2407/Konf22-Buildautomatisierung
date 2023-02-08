package GenericStack;

import java.util.Arrays;

public class  Stack <T>{
    private T[] elements;
    private int counter;

    public Stack(T[] elements) {
        this.elements = elements;
        this.counter = -1;
    }



    public T pop(){

        counter--;

        return elements[counter+1];
    }
    public void push(T value){

        counter++;
            elements[counter]=value;




    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", counter=" + counter +
                '}';
    }
}
