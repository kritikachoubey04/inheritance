package String;

public class Mutable {
    public static void main(String a[]){


        StringBuffer sb = new StringBuffer(" Kritika");
        sb.append(" Choubey");
        sb.setLength(20);
        sb.insert(0, "rita");
        System.out.println(sb);


    }
}
