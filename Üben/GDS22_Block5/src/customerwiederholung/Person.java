package customerwiederholung;

public class Person {
    public String firstname;
    public String lastname;

    public String print(){
        return firstname+";"+lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
