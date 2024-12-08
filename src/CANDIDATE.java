import java.util.*;

class CANDIDATE
{
    int RNo;
    String Name;
    int Score;
    String Remarks;

    public void AssignRem(){
        if(Score>=50)
            Remarks = "Selected";
        else
            Remarks="Not selected";
    }

    public void Enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        RNo=sc.nextInt();
        System.out.println("Enter Name : ");
        Name=sc.next();
        System.out.println("Enter Score : ");
        Score=sc.nextInt();
        AssignRem();
    }


    public void Display(){
        System.out.println("Result ");
        System.out.println("RNo     : "+RNo);
        System.out.println("Name    : "+Name);
        System.out.println("Score   : "+Score);
        System.out.println("Remarks : "+Remarks);
    }
}

class Score
{
    public static void main(String args[])
    {
        CANDIDATE cand=new CANDIDATE();
        cand.Enter();
        cand.Display();
    }
}