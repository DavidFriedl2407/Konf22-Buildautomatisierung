public class Bank {
    public static void main(String[] args) {
        // Wir simulieren eine Bank
        
        Gehaltskonto susi = new Gehaltskonto("Susi Sorglos","AT 612345","RZABC");

        System.out.println("susi.toString() = " + susi.toString());
        susi.abbuchen(100);
        susi.aufbuchen(250);
        System.out.println("susi.getKontostand() = " + susi.getKontostand());
        susi.abbuchen(8.7);
        System.out.println("susi.getKontostand() = " + susi.getKontostand());

        Gehaltskonto maxi = new Gehaltskonto("Maxi Mustermann","iban","bic");
        Gehaltskonto john= new Gehaltskonto("John Doe","us-iban","bic-us");

        Gehaltskonto john2 = new Gehaltskonto("John Doe Business Account","us-iban2", "bic");


        Gehaltskonto [] bank = new Gehaltskonto[100];
        bank[0]= susi;
        bank[1]= maxi;
        bank[2]= john;

        for (int i =0;i< bank.length; i++){
            if (bank[i]== null){
                break;
            }
            System.out.println("bank[i].getKontostand() = " + bank[i].getKontostand());
        }
        System.out.println("Gehaltskonto.counter = " + Gehaltskonto.counter);
    }
}
