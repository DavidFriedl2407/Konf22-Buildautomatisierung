package DogBeagle;

public class Dog {
    public String eyeColor;
    public int weight;

    public void doSomething(){
        System.out.println("Wuff");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
