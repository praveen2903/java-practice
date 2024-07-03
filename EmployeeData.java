import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeData {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter company name: ");
    String cname=sc.nextLine();
    System.out.print("enter no of employees: ");
    int n=sc.nextInt();sc.nextLine();
    Employee[] e=new Employee[n];
    System.out.println("Employee details: ");
    for(int i=0;i<n;i++){
        System.out.println("Employee "+(i+1)+":");
        System.out.print("Enter Id: ");int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter name: ");String ename=sc.nextLine();
        System.out.print("Enter designation: ");String des=sc.nextLine();
        System.out.print("Enter salary: ");Double sal=sc.nextDouble();sc.nextLine();
        e[i]=new Employee(id,ename,des,sal);
    }
    Company c=new Company(cname,e,n);
    System.out.println("Average Salary: "+c.getAverageSalary(e));
    System.out.println("Maximum salary: "+c.getMaxSalary(e));
    String reqdes=sc.nextLine();
    sc.close();
    Employee[] res=c.getEmployeeDesignation(reqdes,e);
    if(res!=null){
        for(int i=0;i<res.length;i++){
            System.out.println(res[i].getId()+"::"+res[i].getEName()+"::"+res[i].getDesignation()+"::"+res[i].getSalary());
        }
    }
 }   
}


class Employee{
    private int id;
    private Double sal;
    private String name,des;
    Employee(int id,String name,String des,Double sal){
        this.id=id;
        this.name=name;
        this.des=des;
        this.sal=sal;
    }
    int getId(){
        return id;
    }
    String getEName(){
        return name;
    }
    String getDesignation(){
        return des;
    }
    Double getSalary(){
        return sal;
    }
}


class Company{
    private Employee[] e;
    private int n;
    private String name;
    Company(String name,Employee[] e,int n){
        this.name=name;
        this.e=e;
        this.n=n;
    }
    Double getAverageSalary(Employee[] e){
        Double su=0.0;
        for(int i=0;i<n;i++){
            su+=e[i].getSalary();
        }
        if(su>0){
            Double avg=su/n;
            return avg;
        }
        return 0.0;
    }
    Double getMaxSalary(Employee[] e){
        Double maxi=e[0].getSalary();
        for(int i=0;i<n;i++){
            if(e[i].getSalary()>maxi){
                maxi=e[i].getSalary();
            }
        }
        return maxi;
    }
    Employee[] getEmployeeDesignation(String des,Employee[] e){
        ArrayList<Employee> l=new ArrayList<>();
        for(int i=0;i<e.length;i++){
            if(e[i].getDesignation().equalsIgnoreCase((des))){
                l.add(e[i]);
            }
        }
        Employee[] de=l.toArray(new Employee[0]);
        if(de.length>0){
            return de;
        }
        return null;
    }

}