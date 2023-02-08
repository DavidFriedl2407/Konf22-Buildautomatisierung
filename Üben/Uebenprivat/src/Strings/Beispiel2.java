package Strings;




public class Beispiel2 {
    public static void main(String[] args) {
        Beispiel2 csvParser= new Beispiel2(" spalte1,spalte2,spalte3");
        System.out.println(csvParser.countComma());
        System.out.println(csvParser.parse());
        String[] result = csvParser.parse();
        for (String column : result) {
            System.out.println(column);
        }
    }

    private String csvline;
    int counter=0;

    public Beispiel2(String csvline) {
        this.csvline = csvline;
    }
    public int countComma(){
        for (int i = 0; i < csvline.length(); i++) {
            if (csvline.charAt(i)==(',')){
                counter++;
            }

        }
        return counter;
    }
    public String[] parse()
    {
        String[] result = new String[countComma()];
        int pos = 0;
        for (int i = 0; i < result.length; i++)
            result[i] = "";

        for(int i = 0; i < csvline.length(); i++)
        {
            char c = csvline.charAt(i);
            if (c == ',') {
                pos++;
            }
            else {
                result[pos] += c;
//				System.out.println(pos + ": " + result[pos]);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Beispiel2{" +
                "csvline='" + csvline + '\'' +
                ", counter=" + counter +
                '}';
    }
}