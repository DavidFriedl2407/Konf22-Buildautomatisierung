package DemoCustomorAddress;

public class Address {
    private String Street;
    private String Zip;
    private String City;
    private String Country;

    public Address(String street, String zip, String city, String country) {
        Street = street;
        Zip = zip;
        City = city;
        Country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", Zip='" + Zip + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
