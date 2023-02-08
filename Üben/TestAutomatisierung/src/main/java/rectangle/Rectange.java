package rectangle;

class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int berechneFlaeche(){
        int result = a*b;
        return result;
    }
    public int berechneUmfang(){
        int result= (a+b) *2;
        return result;
    }
}
