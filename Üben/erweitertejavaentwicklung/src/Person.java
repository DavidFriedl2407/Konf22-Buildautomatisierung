public class Person {
    //Unsere Klassen haben KEINE main-Methode

    public int uniqueID;
    public String firstName;
    public String lastName;
    public int ageInYears;
    public String mailAddress;

    // Methode innerhalb der Klasse isind MEIST (99%) NICHT static
    public void print(){
        System.out.println("uniqueID = " + uniqueID);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("ageInYears = " + ageInYears);
        System.out.println("mailAddress = " + mailAddress);
    }
    public String fullName(){
        return lastName.toUpperCase() + " " +firstName;
    }



    }







