package Encapsulation;

class Human {
    private int age;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;

    }
}


    public class Demo1 {
        public static void main(String a[]) {

            Human obj = new Human();
            obj.setAge(21);
            obj.setName("vivek");

            System.out.println(obj.getAge() + " : " + obj.getName());
        }
    }
    



