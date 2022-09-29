public class WinterreifenpflichtDemo {
    public static void main(String[] args) {
        System.out.println(isWinterreifenPflicht(3,false));

    }
    public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){
        if( (((temperatur<10) && (rutschigeFahrbahn == true)) || (temperatur<4))) {
            boolean winterreifenpflicht = true;
            System.out.println("Bitte Winterreifen verwenden");
            return winterreifenpflicht;
        }else{
            boolean keineWinterreifenplicht = true;
            System.out.println("Winterreifen sind nicht erforderlich");
            return keineWinterreifenplicht;}
    }
}
