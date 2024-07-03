import java.util.Scanner;

public class Institution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Students[] s=new Students[4];
        for(int i=0;i<s.length;i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int placedno=sc.nextInt();sc.nextLine();
            int clearedno=sc.nextInt();sc.nextLine();
            String loc=sc.nextLine();

            s[i]=new Students(id,name,placedno,clearedno,loc);
        }
        String l=sc.nextLine();
        int c=findNumClearanceByLoc(s, l);
        if(c>0){
            System.out.println("clearance"+c);
        }
        else{
            System.out.println("There s no cleared students in this location");
        }
        String inst=sc.nextLine();
        sc.close();
        Students res=updateInstitutionGrade(s,inst);
        if(res==null){
            System.out.println("No institute is available with specified name");
        }
        else{
            System.out.println(res.getName()+"::"+res.getGrade());
        }

    }
    public static int findNumClearanceByLoc(Students[] s,String loc){
        int sum=0;
        for(int i=0;i<s.length;i++){
            if(loc.equalsIgnoreCase(s[i].getLocation())){
                sum+=s[i].getClearedno();
            }
        }
        return sum;
    }
    public static Students updateInstitutionGrade(Students[] s,String name){
        for(int i=0;i<s.length;i++){
            if(name.equalsIgnoreCase(s[i].getName())){
                int r=(s[i].getPlacedno()*100)/(s[i].getClearedno());
                if(r>=80){
                    s[i].setGrade("A");
                }
                else{
                    s[i].setGrade("B");
                }
                return s[i];
                }
        }
        return null;
    }
}
class Students{
    private int id,placedno,clearedno;
    private String name,loc,grade;
    Students(int id,String name,int placedno,int clearedno,String loc){
        this.id=id;
        this.name=name;
        this.placedno=placedno;
        this.clearedno=clearedno;
        this.loc=loc;
    }
    void setId(int id){
        this.id=id;
    }
    int getId(){
        return this.id;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    void setPlacedno(int placedno){
        this.placedno=placedno;
    }
    int getPlacedno(){
        return this.placedno;
    }
    void setClearedno(int clearedno){
        this.clearedno=clearedno;
    }
    int getClearedno(){
        return this.clearedno;
    }
    void setLocation(String loc){
        this.loc=loc;
    }
    String getLocation(){
        return this.loc;
    }
    void setGrade(String grade){
        this.grade=grade;
    }
    String getGrade(){
        return this.grade;
    }
}