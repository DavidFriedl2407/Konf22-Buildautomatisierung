package DemoCustomorAddress;

public class Demo {
    public static void main(String[] args) {
        Customer c = new Customer(1);
        c.addAddress(new Address("Körblergasse","8020","Graz","Austria"));

        System.out.println(c.toString());

    }
}
