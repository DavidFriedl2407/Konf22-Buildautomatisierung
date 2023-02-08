package org.campus02.thenewsocialmedia;

public class Profil {
    private String eMail;
    private int age;
    private String fullname;
    private MayBe<String> creditCardNumber;
    private MayBe<Double> salary;

    private Profil friend;

    private AccessRoles role;

    public Profil(String eMail, int age, String fullname, String creditCardNumber, double salary) {
        this.eMail = eMail;
        this.age = age;
        this.fullname = fullname;
        this.creditCardNumber = new MayBe<String>(creditCardNumber);
        this.salary = new MayBe<Double>(salary);
    }
    public void printPublicPage(AccessRoles role){
        System.out.println("My profile");
        System.out.println("eMail = "+ eMail);
        if (role == AccessRoles.friend || role== AccessRoles.Self){
            System.out.println("age = "+age);
        }

        System.out.println("fullname = "+fullname);

        //if (role == AccessRoles.Platform || role == AccessRoles.Self){
            //System.out.println("creditCardNumber"+creditCardNumber);
        //}
        creditCardNumber.deliverValue(role);

        System.out.println("salary"+salary);
        System.out.println("best friend= "+friend);
    }

    public void setFriend(Profil friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Profil{" +
                "eMail='" + eMail + '\'' +
                ", age=" + age +
                ", fullname='" + fullname + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", salary=" + salary +
                ", friend=" + friend +
                '}';
    }
}
