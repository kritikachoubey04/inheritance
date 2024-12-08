package Encapsulation;

public class Student {
    private String name;
    private int phyMarks;
    private int chemMarks;
    private int BioMarks;

    public void setName(String name){
        this.name = name;
    }
    public void setPhyMarks(int phyMarks){
        this.phyMarks = phyMarks;
    }
    public void setChemMarks(int chemMarks){
        this.chemMarks = chemMarks;
    }
    public void setBioMarks(int BioMarks){
        this.BioMarks = BioMarks;
    }
    void marksRead()
    {
        System.out.println("Student's Name" +name);
        System.out.println("physics Marks" +phyMarks);
        System.out.println("Chemistry Marks" +chemMarks);
        System.out.println("Bio Marks" +BioMarks);

        int totalMarks = phyMarks +BioMarks +chemMarks ;
        float percentage = (totalMarks * 100)/300;
        System.out.println("Percentage of pcb" + percentage);
    }
}
class StudentMarks{
    public static void main(String args[])
    {
        Student st = new Student();
            st.setName("Rita");
            st.setBioMarks(99);
            st.setPhyMarks(98);
            st.setChemMarks(97);
            st.marksRead();

    }
}
