package Constructor;

public class ParameterizedCons {
    int id;
    String name;
    public ParameterizedCons(int i, String n){
        id = i;
        name = n;
    }
        void display () {
            System.out.println(id + ":" + name);
        }
        public static void main(String args[]){
        ParameterizedCons s1 = new ParameterizedCons(11, "Tiya");
        ParameterizedCons s2 = new ParameterizedCons(18,"Riya");

        s1.display();
        s2.display();
        }
}
