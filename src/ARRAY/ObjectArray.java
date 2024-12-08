package ARRAY;

class Student {
    int Roll_No;
    int Marks;
    String Name;
}

public class ObjectArray {
    public static void main(String Args[])
    {
        Student s1 = new Student();
        s1.Marks = 67;
        s1.Name = "veet";
        s1.Roll_No = 54;


        Student s2 = new Student();
        s2.Marks = 90;
        s2.Name = "rahul";
        s2.Roll_No = 65;

        Student s3 = new Student();
        s3.Marks = 40;
        s3.Name = "diya";
        s3.Roll_No = 25;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for(int i=0;i<students.length;i++){
             System.out.println(students[i].Name + " : " + students[i].Marks + " :" + students[i].Roll_No);
        }


    }
}
