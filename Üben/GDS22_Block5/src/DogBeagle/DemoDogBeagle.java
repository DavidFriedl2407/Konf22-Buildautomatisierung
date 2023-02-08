package DogBeagle;

public class DemoDogBeagle {
    public static void main(String[] args) {
        Beagle b = new Beagle("schokolade");
        b.doSomething();
        b.eyeColor="brown";
        b.weight=4900;
        b.doSomething();
        System.out.println(b.eyeColor);
    }
}
