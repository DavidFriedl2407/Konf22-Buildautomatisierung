package org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer{

    @Override
    public void analyze() {
        int männer=0;
        int Frauen=0;
        int KörpergrößegM=0;
        int KörpergrößegF=0;

        for (Person person : super.getPersons()) {
            if (person.getGender()=='M'){
                KörpergrößegM=KörpergrößegM+person.getSize();
                männer++;
            }
            if (person.getGender()=='F'){
                KörpergrößegF=KörpergrößegF+ person.getSize();
                Frauen++;
            }


        }
        System.out.println("In der Liste existieren "+männer+"Männer mit einer durchschnittlichen Körpergröße von "+(KörpergrößegM/männer));
        System.out.println("In der Liste existieren "+Frauen+"Frauen mit einer durchschnittlichen Körpergröße von "+(KörpergrößegF/Frauen));

    }
}
