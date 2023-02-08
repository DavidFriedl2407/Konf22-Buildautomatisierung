package GenericStack;

public class demoklasse {
    public static void main(String[] args) {

        Integer[] array1=new Integer[3];
        Stack stack=new Stack(array1);
        stack.push(4);
        stack.push(5);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);




    }
}
