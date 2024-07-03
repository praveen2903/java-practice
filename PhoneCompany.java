import java.util.Scanner;

public class PhoneCompany {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of phones: ");
        int n=sc.nextInt();sc.nextLine();
        Phone[] p=new Phone[n];
        for(int i=0;i<p.length;i++){
            int id=sc.nextInt();sc.nextLine();
            String os=sc.nextLine();
            String brand=sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            p[i]=new Phone(id,os,brand,price);
        }
        String reqbrand=sc.nextLine();
        String reqos=sc.nextLine();
        int res1=findPriceForGivenBrand(p,reqbrand);
        if(res1==0){
            System.out.println("Brand not available");
        }
        else{
            System.out.println(res1);
        }
        Phone res2=findPhoneIdBasedonOS(p,reqos);
        if(res2!=null){
            System.out.println(res2.getId());
        }
        Phone res3=findPhoneGradeofBrand(p,reqbrand);
        if(res3!=null){
            System.out.println(res3.getBrand()+"::"+res3.getPrice()+"::"+res3.getGrade());
        }
        sc.close();
    }
    public static int findPriceForGivenBrand(Phone[] p,String brand){
        for(int i=0;i<p.length;i++){
            if(brand.equalsIgnoreCase(p[i].getBrand())){
                return p[i].getPrice();
            }
        }
        return 0;
    }
    public static Phone findPhoneIdBasedonOS(Phone[] p,String os){
        for(int i=0;i<p.length;i++){
            if(os.equalsIgnoreCase(p[i].getOs())){
                return p[i];
            }
        }
        return null;
    }
    public static Phone findPhoneGradeofBrand(Phone[] p,String brand){
        for(int i=0;i<p.length;i++){
            if(p[i].getBrand().equalsIgnoreCase(brand)){
                if(p[i].getPrice()>50000){
                    p[i].setGrade("A");
                }
                else{
                    p[i].setGrade("B");
                }
                return p[i];
            }
        }
        return null;
    }
}
class Phone{
    private int id,price;
    private String brand,os,grade;
    Phone(int id,String os,String brand,int price){
        this.id=id;
        this.os=os;
        this.brand=brand;
        this.price=price;
    }
    void setId(int id){
        this.id=id;
    }
    int getId(){
        return this.id;
    }
    void setOs(String os){
        this.os=os;
    }
    String getOs(){
        return this.os;
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    String getBrand(){
        return this.brand;
    }
    void setPrice(int price){
        this.price=price;
    }
    int getPrice(){
        return this.price;
    }
    void setGrade(String grade){
        this.grade=grade;
    }
    String getGrade(){
        return this.grade;
    }
}
