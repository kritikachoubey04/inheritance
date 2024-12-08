package OVERLOADING;

public class sum {
    public int sum(int x, int y) {return (x + y); }

    public int sum(int x, int y, int z){
        return (x + y + z);
    }
    public double sum(double x, double y){
        return  (x + y);
    }
    public static void main(String args[]){
        sum s1 = new sum();
        System.out.println(s1.sum(6,9));
        System.out.println(s1.sum(6,7,67));
        System.out.println(s1.sum(6.9,9.5));

    }

}
