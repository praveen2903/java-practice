import java.util.*;
public class TravelAgency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Travel[] t=new Travel[4];
        for(int i=0;i<t.length;i++){
            int regno=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String type=sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            Boolean facility=sc.nextBoolean();
            t[i]=new Travel(regno,name,type,price,facility);
        }
        int r=sc.nextInt();sc.nextLine();
        String p=sc.nextLine();
        sc.close();
        int highpackage=findAgencyWithHighestPackage(t);
        Travel res=agencyDetailsforGivenIdandPackage(t,r,p);
        System.out.println(highpackage);
        if(res==null){
            System.out.println("not obtained");
        }
        else{
            System.out.println(res.getName()+"::"+res.getPrice());
        }
    }
    public static int findAgencyWithHighestPackage(Travel[] t){
        int maxprice=Integer.MIN_VALUE;
        for(int i=0;i<t.length;i++){
            if(t[i].getPrice()>maxprice){
                maxprice=t[i].getPrice();
            }
        }
        return maxprice;
    }
    public static Travel agencyDetailsforGivenIdandPackage(Travel[] t,int regno,String p){
        for(int i=0;i<t.length;i++){
            if(t[i].getFacility() && (t[i].getRegNo()==regno) && t[i].getType().equalsIgnoreCase(p)){
                return t[i];
            }
        }
        return null;
    }
    
}
class Travel{
    private int regno,price;
    private String name,type;
    private Boolean facility;
    Travel(int regno,String name,String type,int price,Boolean facility){
        this.regno=regno;
        this.name=name;
        this.type=type;
        this.price=price;
        this.facility=facility;
    }
    int getRegNo(){
        return regno;
    }
    String getName(){
        return name;
    }
    String getType(){
        return type;
    }
    int getPrice(){
        return price;
    }
    Boolean getFacility(){
        return facility;
    }
}
