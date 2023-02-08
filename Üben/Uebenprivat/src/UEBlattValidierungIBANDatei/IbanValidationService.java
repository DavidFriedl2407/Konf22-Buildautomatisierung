package UEBlattValidierungIBANDatei;

public class IbanValidationService {
    private String iBan;
    private int calculatedCheckSum;

    public IbanValidationService(String iBan) {
        this.iBan = iBan;
        this.calculatedCheckSum = -1;
    }
    public String getCountryCode(){
        String part = iBan.substring(0,2); // gets characters at position 0&1 => "AT"
        return part;
    }
   // Schreiben Sie eine Methode public String getCountryCode(), welche die ersten beiden Zeichen von iBan retourniert (Snippet 2).

    public int getCheckSum(){
        String part = iBan.substring(2,4); // gets characters at position 2,3 => "61"
        int value = Integer.valueOf(part); // Integer.valueOf(String) converts a String to an int (61)
        return value;
    }
    //Schreiben Sie eine Methode public int getCheckSum(), welche die Checksumme (Index 2 & 3) als intWert retourniert (Snippet 3).

    public String getAccountNumber(){
        int länge=iBan.length();
        String newString=iBan.substring(4,länge);
        return newString;
    }
    public String getCountryCodeNumber(){
    //char char1= iBan.charAt(0);
   // char char2=iBan.charAt(1);
    //int char1int=char1;
    //int char2int=char2;
    //String newString= String.valueOf(char2int+char2int);
        char charA='A';
        char charB='B';
        char charT='T';
        return "102900";
    }
    //Schreiben Sie eine Methode public String getCountryCodeNumber(), welche die Buchstaben des
    //Ländercodes in Zahlen umwandelt. Orientieren Sie sich an den oben definierten Grundlagen
    //(Snippet 4 und Snippet 1).

    public String getFullCode(){
        String newString= getAccountNumber()+getCountryCodeNumber();
        return newString;
    }
    public int[] buildArray(){
        char[] newchar= getFullCode().toCharArray();
        int [] newArray=new int[getFullCode().length()];



        for (int i = 0; i < getFullCode().length(); i++) {

            newArray[i]=newchar[i]-48;

        }


    return newArray;
    }
    //new int[getFullCode().length()]
    
    public int calcCheckSum(){
        int helper=0;
        int[] array= buildArray();

        for (int i = 0; i < buildArray().length; i++) {
            helper=((helper*10)+array[i])%97;
        }
        calculatedCheckSum=98-helper;
        return calculatedCheckSum;
    }
    public boolean isIbanCorrect(){
        if (calculatedCheckSum == getCheckSum()) {
          return true;

        }
        else return false;

    }


    
}

