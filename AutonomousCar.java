import java.util.*;
public class AutonomousCar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car[] cars=new Car[4];
        for(int i=0;i<cars.length;i++){
            int carid=sc.nextInt();sc.nextLine();
            String brand=sc.nextLine();
            int testsconducted=sc.nextInt();sc.nextLine();
            int testspassed=sc.nextInt();sc.nextLine();
            String environment=sc.nextLine();
            //new key word is compolsory as creating objects in array
            cars[i]=new Car(carid,brand,testsconducted,testspassed,environment);
        }
        String env=sc.nextLine();
        String brandreq=sc.nextLine();
        sc.close();
        int testok=findTestsdonebyEnv(cars,env);
        if(testok==0){
            System.out.println("there are no cars passed in environment");
        }
        else{
            System.out.println(testok);
        }
        Car updatedCar=updateCarGrade(cars,brandreq);
        if(updatedCar==null){
            System.out.println("no car available");
        }
        else{
            System.out.println(updatedCar.getBrand()+":"+updatedCar.getGrade());
        }
    }
    public static int findTestsdonebyEnv(Car[] cars,String env){
        int sum=0;
        for(int i=0;i<cars.length;i++){
            if(env.equalsIgnoreCase(cars[i].getEnvironment())){ //ignorecase mean no uppercase and lowercase
                sum+=cars[i].getTestspassed();
            }
        }
        return sum;
    }
    public static Car updateCarGrade(Car[] cars,String brand){
        int rating;
        for(int i=0; i<cars.length;i++){
            if(brand.equalsIgnoreCase(cars[i].getBrand())){
                rating=(cars[i].getTestspassed()*100)/(cars[i].getTestsConducted());
                if(rating>=80){
                    cars[i].setGrade("A1");
                }
                else{
                    cars[i].setGrade("B2");
                }
                return cars[i];
            }
        }
        return null;
    }
}


//note:- if public class mean new file required no only class
class Car {
    private int carid,testsconducted,testspassed;
    private String brand,environment,grade;
    Car(int carid, String brand, int testsconducted,int testspassed,String environment){
        this.carid=carid;
        this.brand=brand;
        this.testsconducted=testsconducted;
        this.testspassed=testspassed;
        this.environment=environment;
    }
    int getCarId(){
        return this.carid;
    }
    void setCarId(int carid){
        this.carid=carid;
    }
    String getBrand(){
        return this.brand;
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    int getTestsConducted(){
        return this.testsconducted;
    }
    void setTestsConducted(int testsconducted){
        this.testsconducted=testsconducted;
    }
    int getTestspassed(){
        return this.testspassed;
    }
    void setTestspassed(int testspassed){
        this.testspassed=testspassed;
    }
    String getEnvironment(){
        return this.environment;
    }
    void setEnvironment(String environment){
        this.environment=environment;
    }
    void setGrade(String grade){
        this.grade=grade;
    }
    String getGrade(){
        return this.grade;
    }
    
}