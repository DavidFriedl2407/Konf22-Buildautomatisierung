package DogBeagle;

public class Beagle extends Dog{
    public String lovedFood;

    public Beagle(String lovedFood) {
        this.lovedFood = lovedFood;
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "lovedFood='" + lovedFood + '\'' +
                '}';
    }
}
