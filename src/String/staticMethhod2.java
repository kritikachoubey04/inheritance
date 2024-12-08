package String;

public class staticMethhod2 {
    static  int a = 40;
    int b = 50;
    void simpleDisplay()
    {
        System.out.println(a);
        System.out.println(b);
    }
    //static Method
    static  void staticDisplay()
    {
        System.out.println(a);
    }
    //main method
    public static void main(String[] args)
    {
        staticMethhod2 obj = new staticMethhod2();
        obj.simpleDisplay();


        //Calling static method
        staticMethhod2.staticDisplay();
    }
}
