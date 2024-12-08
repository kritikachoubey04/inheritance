package String;

class Student{
        String Name;
        int Roll_No;
        static String standard;

        public void show() {

            System.out.println(Name + ": " + Roll_No + ": " + standard);
        }
        public static void show1(Student obj)
        {
            System.out.println(obj.Name + ": " + obj.Roll_No + ": " + standard);
        }


    }


    public class staticmethod {
        public static void main(String args[]) {

            Student obj1 = new Student();
            obj1.Name = "Tina";
            obj1.Roll_No = 15;
            Student.standard = "First";


            Student obj2 = new Student();
            obj2.Name = "Riya";
            obj2.Roll_No = 17;
            Student.standard = "Second";

            obj2.show();
            obj1.show();


            Student.show1(obj2);


        }
    }