public class Demo {
    public static void main(String args[])
    {
        int data = 10;
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        int r1 = obj.add(4,9);
        //System.out.println(r1);

        obj.num = 8;

        System.out.println(obj.num);
        System.out.println(obj1.num);




    }
}
