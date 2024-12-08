package Constructor;

public class Human {
    private int age ;
    private String name;

    public Human()
    {
        age=12;
        name="kritika";
    }


    public int getAge(){
        return  age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
class Cars{
    public static void main(String args[]){
        Human obj1 = new Human();
        //obj1.setAge(23);
        //obj1.setName("kritika");

        System.out.println("person name:" +obj1.getName());
        System.out.println("person age:" +obj1.getAge());
    }

}
