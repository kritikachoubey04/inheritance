package Encapsulation;

public class Rectangle {
    private int length;
    private int Breadth;

    Rectangle(int length, int breadth){
        this.Breadth = breadth;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return Breadth;
    }

    public void setLength(int length){
        this.length = length;
    }
    public void setBreadth(int breadth){
        this.Breadth = breadth;
    }
}
 class demo2{
    public static void main(String args[]){
        Rectangle obj1 = new Rectangle(args.length, args.length);
        obj1.setBreadth(15);
        obj1.setLength(12);


        System.out.println(obj1.getLength() + " : " + obj1.getBreadth());

    }

}
