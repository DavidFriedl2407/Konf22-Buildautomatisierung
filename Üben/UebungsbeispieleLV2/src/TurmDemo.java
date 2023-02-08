public class TurmDemo {
    public static void main(String[] args) {
        int multiplicator =2;
        int number = multiplicator;




        while (multiplicator<=9){
            int result =multiplicator*number;
            System.out.println(number+"*"+multiplicator+"="+result);
            number=result;
            multiplicator=multiplicator+1;


        }
        multiplicator=2;
        while (multiplicator <=9){

            int result =number/multiplicator;
            System.out.println(number+"/"+multiplicator+"="+result);
            number=result;
            multiplicator++;

        }



        }




    }


