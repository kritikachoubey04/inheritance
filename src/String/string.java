package String;

public class string {

    public static void main(String args[]){

        String name = "Kritika";
        System.out.println("Hello:"+name);
        System.out.println(name.concat("Choubey "));
        System.out.println(name.length());  // return the size
        System.out.println(name.charAt(2));// return position index value
        System.out.println(name.substring(0,2)); // return subtracting the  string values
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

    }
}
