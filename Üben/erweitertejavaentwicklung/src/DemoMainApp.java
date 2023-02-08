public class DemoMainApp {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Person susi; //Ein Objekt von Person für Susi
        susi=new Person();
        susi.uniqueID=4711;
        susi.firstName="Susi";
        susi.lastName="Sorglos";
        susi.ageInYears=39;
        susi.mailAddress="susi.soglos@test.com";

        Person max=new Person();
        max.uniqueID=2511;
        max.firstName="Max";
        max.lastName="Mustermann";
        max.ageInYears=40;
        max.mailAddress="max.mustermann@test.com";

        printPerson(max);
        printPerson(susi);

        max.print();
        susi.print();
        System.out.println("max.fullName() = " + max.fullName());

        System.out.println("susi.fullName = " + susi.fullName());
        System.out.println("max = " + max.toString());



    }

    public static void printTwoPerson(Person person1, Person person2){
        printPerson(person1);
        printPerson(person2);
    }
    public static void printPerson(Person person){
        System.out.println("person.uniqueID = " + person.uniqueID);
        System.out.println("person.firstName = " + person.firstName);
        System.out.println("person.lastName = " + person.lastName);
        System.out.println("person.mailAddress = " + person.mailAddress);
        System.out.println("person.ageInYears = " + person.ageInYears);
    }

}
