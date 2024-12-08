package OVERLOADING;

public class printer {
    public static void main(String args[]){

    }
    public void print(int value) {
        System.out.println("Integer  "+value);
    }
    public void print(String value){
        System.out.println("String  "+value);
    }
    public void print(double value) {
        System.out.println("Double  "+value);
    }
    public void print(int value1, int value2){
        System.out.println("Two integer value " + value1 + " , "  + value2);
    }


}
