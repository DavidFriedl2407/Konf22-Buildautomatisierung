package BeispielGehaltskonto;

public class Bank {
    public static void main(String[] args) {
        Gehaltskonto gehaltskonto1 = new Gehaltskonto("hans","111111","111");
        Gehaltskonto gehaltskonto2= new Gehaltskonto("bernd","222222","222");
        Gehaltskonto gehaltskonto3= new Gehaltskonto("adi","333333","333");



        gehaltskonto1.abbuchen(40);
        System.out.println(gehaltskonto1);
        gehaltskonto1.aufbuchen(300);
        System.out.println(gehaltskonto1);
        gehaltskonto1.abbuchen(100);
        System.out.println(gehaltskonto1);
        System.out.println(gehaltskonto1.getKontostand());
        gehaltskonto3.aufbuchen(40);
        gehaltskonto2.aufbuchen(80);
        System.out.println("..................................");
        Gehaltskonto[] smallbank = {gehaltskonto1,gehaltskonto2,gehaltskonto3};
        for (int i = 0; i < smallbank.length; i++) {
            if (smallbank[i]==null){
                System.out.println(i+"ist die nächste freie Position");
                break;
            }
            System.out.println(smallbank[i].getKontostand());

        }



    }
}
