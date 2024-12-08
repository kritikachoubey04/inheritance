package Encapsulation;

public class MyDetails {
    private String name;
    private String Mothername;
    private String Fathername;
    private int MobileNO;
    private int AdhaarNo;

    public void setName(String name){
        this.name = name ;
    }
    public void setFathername(String fathername){
        this.Fathername = fathername;
    }
    public void setMothername(String mothername){
        this.Mothername = mothername;
    }
    public void setMobileNO(int mobileNO){
        this.MobileNO = mobileNO;
    }
    public void setAdhaarNo(int adhaarNo){
        this.AdhaarNo =adhaarNo;
    }
    void detailsread()
    {
        System.out.println("Name of Person:" +name);
        System.out.println("Mothers's name:" +Mothername);
        System.out.println("Father's name:" +Fathername);
        System.out.println("Mobile Number:" +MobileNO);
        System.out.println("Adhaar number:" +AdhaarNo);

    }

}
class My{
    public static void main(String args[]){

        MyDetails obj1 = new MyDetails();
        obj1.setName("Kritika Choubey");
        obj1.setMothername("Rita Choubey");
        obj1.setFathername("kamleshawar Choubey");
        obj1.setMobileNO(989768587);
        obj1.setAdhaarNo(4545454);
        obj1.detailsread();


    }

}

