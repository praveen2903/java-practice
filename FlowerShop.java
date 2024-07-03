import java.util.Scanner;
public class FlowerShop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Flower[] f=new Flower[4];
        for(int i=0;i<f.length;i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            int rating=sc.nextInt();sc.nextLine();
            String type=sc.nextLine();
            f[i]=new Flower(id,name,price,rating,type);
        }
        String reqtype=sc.nextLine();
        sc.close();
        Flower res=findMinPriceByType(f,reqtype);
        if(res==null){
            System.out.println("no flower obtained");
        }
        else{
            System.out.println("your flower id is: "+res.getId());
        }

    }
    public static Flower findMinPriceByType(Flower[] f,String type){
        for(int i=0;i<f.length;i++){
            if(type.equalsIgnoreCase(f[i].getType())){
                if (f[i].getRating()>3){
                    return f[i];
                }
            }
        }
        return null;
    }
    
}
class Flower{
    private int id,price,rating;
    private String name,type;
    Flower(int id,String name,int price,int rating,String type){
        this.id=id;
        this.name=name;
        this.price=price;
        this.rating=rating;
        this.type=type;
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
    void setPrice(int price){
        this.price=price;
    }
    int getPrice(){
        return this.price;
    }
    void setRating(int rating){
        this.rating=rating;
    }
    int getRating(){
        return this.rating;
    }
    void setType(String type){
        this.type=type;
    }
    String getType(){
        return this.type;
    }
}