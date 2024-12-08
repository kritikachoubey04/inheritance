package Encapsulation;

import javax.lang.model.element.Name;

public class Detailstd {

    private String Name;
    private int Roll_No;
    private int Id;

    public String getName() {
        return Name;
    }

    public int Roll_no() {
        return Roll_No;
    }

    public int Id() {
        return Id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setRoll_No(int roll_No) {
        Roll_No = roll_No;
    }

    public void setId(int id) {
        Id = id;
    }
}
class Call{
    public static void main(String args[])
    {
        Detailstd obj = new Detailstd();
        obj.setId(8);
        obj.setName("Priya");
        obj.setRoll_No(24);

        System.out.println("Student Name:" +obj.getName());
        System.out.println("student RollNo:" +obj.Roll_no());
        System.out.println("StudentId:" +obj.Id());
    }

}

