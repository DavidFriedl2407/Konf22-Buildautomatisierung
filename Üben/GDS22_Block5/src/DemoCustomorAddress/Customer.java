package DemoCustomorAddress;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int CustomerNumber;
    private ArrayList<Address> addresses= new ArrayList<>();


    public Customer(int customerNumber) {
        this.CustomerNumber = customerNumber;
    }
    public void addAddress(Address a){
        addresses.add(a);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerNumber=" + CustomerNumber +
                ", addresses=" + addresses +
                '}';
    }
}
