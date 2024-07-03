import java.util.*;
public class NavalVessal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();sc.nextLine();
        Naval[] n=new Naval[no];
        for(int i=0;i<n.length;i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int novp=sc.nextInt();sc.nextLine();
            int novc=sc.nextInt();sc.nextLine();
            String p=sc.nextLine();

            n[i]=new Naval(id,name,novp,novc,p);
        }
        int percentageParameter=sc.nextInt();sc.nextLine();
        int res1=findAvgVoyagePct(n, percentageParameter);
        String purpose=sc.nextLine();
        Naval res2=findVesselByGrade(n,purpose);
        sc.close();
        if(res1!=0){
            System.out.println(res1);
        }
        else{
            System.out.println("no soldier available");
        }
        if(res2!=null){
            System.out.println(res2.getName()+"::"+res2.getGrade());
        }
        else{
            System.out.println("no soldiers available");
        }

    }
    public static int findAvgVoyagePct(Naval[] n,int perparameter){
        int c=0,s=0;
        for(int i=0;i<n.length;i++){
            int res=(n[i].getNovc()*100)/n[i].getNovp();
            if(res>=perparameter){
                s+=n[i].getNovc();
                c++;
            }
        }
        if(c>0){
            int avg=s/c;
            return avg;
        }
        return 0;
    }
    public static Naval findVesselByGrade(Naval[] n,String purpose){
        for(int i=0;i<n.length;i++){
            if(n[i].getPurpose().equalsIgnoreCase(purpose)){
                int p=n[i].getNovc()*100/n[i].getNovp();
                if(p==100){
                    n[i].setGrade("Star");
                }
                else if(p<99 && p>80){
                    n[i].setGrade("Leader");
                }
                else if(p<79 && p>55){
                    n[i].setGrade("Inspirer");
                }
                else{
                    n[i].setGrade("Striver");
                }
                return n[i];
            }
            
        }
        return null;
    }
}
class Naval{
    private int id,novp,novc;
    private String name,purpose,grade;
    Naval(int id,String name,int novp,int novc,String purpose){
        this.id=id;
        this.name=name;
        this.novp=novp;
        this.novc=novc;
        this.purpose=purpose;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getNovc(){
        return novc;
    }
    int getNovp(){
        return novp;
    }
    String getPurpose(){
        return purpose;
    }
    void setGrade(String grade){
        this.grade=grade;
    }
    String getGrade(){
        return this.grade;
    }
}
