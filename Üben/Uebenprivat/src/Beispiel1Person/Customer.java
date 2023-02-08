package Beispiel1Person;

public class Customer extends Person{



    public static void main(String[] args) {
        String customernumber;
        Customer customer=new Customer();
        customer.setFirstname("hans");
        System.out.println(customer.firstname);
        System.out.println(customer.getFirstname());
        Person person =new Person();
        person.setFirstname("mike");
        person.setLastname("muli");
        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());








    }



}
