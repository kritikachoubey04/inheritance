package Inheritance;

public class demo {
    public static void main(String args[])
    {
        calc obj = new calc();
        int r1 = obj.add(3,4);
        int r2 = obj.sub(5,8);

        System.out.println(r1 + " " + r2);

    }
}
